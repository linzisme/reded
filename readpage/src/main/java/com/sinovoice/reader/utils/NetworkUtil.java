//Copyright (c) 2017. 章钦豪. All rights reserved.
package com.sinovoice.reader.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.sinovoice.reader.R;
import com.sinovoice.reader.ReaderApplication;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class NetworkUtil {
    public static final int SUCCESS = 10000;
    public static final int ERROR_CODE_NONET = 10001;
    public static final int ERROR_CODE_OUTTIME = 10002;
    public static final int ERROR_CODE_ANALY = 10003;
    private static final Map<Integer, String> errorMap = new HashMap<>();

    static {
        errorMap.put(ERROR_CODE_NONET, ReaderApplication.getInstance().getString(R.string.net_error_10001));
        errorMap.put(ERROR_CODE_OUTTIME, ReaderApplication.getInstance().getString(R.string.net_error_10002));
        errorMap.put(ERROR_CODE_ANALY, ReaderApplication.getInstance().getString(R.string.net_error_10003));
    }

    public static String getErrorTip(int code) {
        return errorMap.get(code);
    }

    public static boolean isNetWorkAvailable() {
        ConnectivityManager manager = (ConnectivityManager) ReaderApplication.getInstance()
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (manager != null) {
            NetworkInfo info = manager.getActiveNetworkInfo();
            return info != null && info.isConnected();
        } else {
            return false;
        }
    }

    /**
     * 获取绝对地址
     */
    public static String getAbsoluteURL(String baseURL, String relativePath) {
        try {
            URL absoluteUrl = new URL(baseURL);
            URL parseUrl = new URL(absoluteUrl, relativePath);
            return parseUrl.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return relativePath;
    }
}
