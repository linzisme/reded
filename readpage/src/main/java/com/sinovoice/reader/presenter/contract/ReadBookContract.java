package com.sinovoice.reader.presenter.contract;

import android.app.Activity;

import com.sinovoice.basemvplib.impl.IPresenter;
import com.sinovoice.basemvplib.impl.IView;
import com.sinovoice.reader.bean.BookShelfBean;
import com.sinovoice.reader.bean.BookSourceBean;
import com.sinovoice.reader.bean.BookmarkBean;
import com.sinovoice.reader.bean.SearchBookBean;
import com.sinovoice.reader.presenter.ReadBookPresenter;

import java.io.File;
import java.util.List;

public interface ReadBookContract {
    interface View extends IView {

        String getNoteUrl();

        Boolean getAdd();

        void setAdd(Boolean isAdd);

        void changeSourceFinish(BookShelfBean book);

        void startLoadingBook();

        void upMenu();

        void openBookFromOther();

        void showBookmark(BookmarkBean bookmarkBean);

        void skipToChapter(int chapterIndex, int pageIndex);

        void onMediaButton();

//        void upAloudState(ReadAloudService.Status state);

        void upAloudTimer(String timer);
//
//        void readAloudStart(int start);
//
//        void readAloudLength(int readAloudLength);

        void refresh(boolean recreate);

        void finish();

    }

    interface Presenter extends IPresenter {

        int getOpen_from();

        BookShelfBean getBookShelf();

        void saveProgress();

        void addToShelf(final ReadBookPresenter.OnAddListener Listener);

        void removeFromShelf();

        void initData(Activity activity);

        void importBooks(List<File> books);

        void openBookFromOther(Activity activity);

        void addDownload(int start, int end);

        void changeBookSource(SearchBookBean searchBookBean);

        void saveBookmark(BookmarkBean bookmarkBean);

        void delBookmark(BookmarkBean bookmarkBean);

        void disableDurBookSource();

        BookSourceBean getBookSource();
    }
}
