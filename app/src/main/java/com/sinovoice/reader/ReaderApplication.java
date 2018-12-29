//Copyright (c) 2017. 章钦豪. All rights reserved.
package com.sinovoice.reader;

import android.Manifest;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;

import com.sinovoice.reader.help.AppFrontBackHelper;
import com.sinovoice.reader.help.Constant;
import com.sinovoice.reader.help.CrashHandler;
import com.sinovoice.reader.help.FileHelp;
import com.sinovoice.reader.model.UpLastChapterModel;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ReaderApplication extends Application {
    public final static boolean DEBUG = BuildConfig.DEBUG;
    public final static String channelIdDownload = "channel_download";
    public final static String channelIdReadAloud = "channel_read_aloud";
    public final static String[] PerList = {Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE};
    public final static int RESULT__PERMS = 263;
    public static String downloadPath;
    private static ReaderApplication instance;
    private static String versionName;
    private static int versionCode;
    private SharedPreferences configPreferences;
    private SharedPreferences cookiePreferences;
    private boolean donateHb;

    public static ReaderApplication getInstance() {
        return instance;
    }

    public static int getVersionCode() {
        return versionCode;
    }

    public static String getVersionName() {
        return versionName;
    }

    public static Resources getAppResources() {
        return getInstance().getResources();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        CrashHandler.getInstance().init(this);
        try {
            versionCode = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            versionName = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            versionCode = 0;
            versionName = "0.0.0";
            e.printStackTrace();
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            createChannelIdDownload();
            createChannelIdReadAloud();
        }
        configPreferences = getSharedPreferences("CONFIG", 0);
        cookiePreferences = getSharedPreferences("COOKIE", 0);
        downloadPath = configPreferences.getString(getString(R.string.pk_download_path), "");
        if (TextUtils.isEmpty(downloadPath)) {
            setDownloadPath(FileHelp.getCachePath());
        }
        AppFrontBackHelper frontBackHelper = new AppFrontBackHelper();
        frontBackHelper.register(this, new AppFrontBackHelper.OnAppStatusListener() {
            @Override
            public void onFront() {
                donateHb = System.currentTimeMillis() - configPreferences.getLong("DonateHb", 0) <= TimeUnit.DAYS.toMillis(3);
            }

            @Override
            public void onBack() {
                if (UpLastChapterModel.model != null) {
                    UpLastChapterModel.model.onDestroy();
                }
            }
        });
    }

    public void setDownloadPath(String downloadPath) {
        ReaderApplication.downloadPath = downloadPath;
        Constant.BOOK_CACHE_PATH = ReaderApplication.downloadPath + File.separator + "book_cache" + File.separator;
        SharedPreferences.Editor editor = configPreferences.edit();
        editor.putString(getString(R.string.pk_download_path), downloadPath);
        editor.apply();
    }

    public SharedPreferences getConfigPreferences() {
        return configPreferences;
    }

    public static SharedPreferences getCookiePreferences() {
        return getInstance().cookiePreferences;
    }

    public boolean getDonateHb() {
        return donateHb;
    }

    public void upDonateHb() {
        SharedPreferences.Editor editor = configPreferences.edit();
        editor.putLong("DonateHb", System.currentTimeMillis());
        editor.apply();
        donateHb = true;
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private void createChannelIdDownload() {
        //用唯一的ID创建渠道对象
        NotificationChannel firstChannel = new NotificationChannel(channelIdDownload,
                getString(R.string.download_offline),
                NotificationManager.IMPORTANCE_LOW);
        //初始化channel
        firstChannel.enableLights(false);
        firstChannel.enableVibration(false);
        firstChannel.setSound(null, null);
        //向notification manager 提交channel
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(firstChannel);
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private void createChannelIdReadAloud() {
        //用唯一的ID创建渠道对象
        NotificationChannel firstChannel = new NotificationChannel(channelIdReadAloud,
                getString(R.string.read_aloud),
                NotificationManager.IMPORTANCE_LOW);
        //初始化channel
        firstChannel.enableLights(false);
        firstChannel.enableVibration(false);
        firstChannel.setSound(null, null);
        //向notification manager 提交channel
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(firstChannel);
        }
    }

}
