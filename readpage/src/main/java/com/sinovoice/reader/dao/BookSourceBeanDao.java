package com.sinovoice.reader.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.sinovoice.reader.bean.BookSourceBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOOK_SOURCE_BEAN".
*/
public class BookSourceBeanDao extends AbstractDao<BookSourceBean, String> {

    public static final String TABLENAME = "BOOK_SOURCE_BEAN";

    /**
     * Properties of entity BookSourceBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property BookSourceUrl = new Property(0, String.class, "bookSourceUrl", true, "BOOK_SOURCE_URL");
        public final static Property BookSourceName = new Property(1, String.class, "bookSourceName", false, "BOOK_SOURCE_NAME");
        public final static Property BookSourceGroup = new Property(2, String.class, "bookSourceGroup", false, "BOOK_SOURCE_GROUP");
        public final static Property CheckUrl = new Property(3, String.class, "checkUrl", false, "CHECK_URL");
        public final static Property LoginUrl = new Property(4, String.class, "loginUrl", false, "LOGIN_URL");
        public final static Property LastUpdateTime = new Property(5, Long.class, "lastUpdateTime", false, "LAST_UPDATE_TIME");
        public final static Property SerialNumber = new Property(6, int.class, "serialNumber", false, "SERIAL_NUMBER");
        public final static Property Weight = new Property(7, int.class, "weight", false, "WEIGHT");
        public final static Property Enable = new Property(8, boolean.class, "enable", false, "ENABLE");
        public final static Property RuleFindUrl = new Property(9, String.class, "ruleFindUrl", false, "RULE_FIND_URL");
        public final static Property RuleSearchUrl = new Property(10, String.class, "ruleSearchUrl", false, "RULE_SEARCH_URL");
        public final static Property RuleSearchList = new Property(11, String.class, "ruleSearchList", false, "RULE_SEARCH_LIST");
        public final static Property RuleSearchName = new Property(12, String.class, "ruleSearchName", false, "RULE_SEARCH_NAME");
        public final static Property RuleSearchAuthor = new Property(13, String.class, "ruleSearchAuthor", false, "RULE_SEARCH_AUTHOR");
        public final static Property RuleSearchKind = new Property(14, String.class, "ruleSearchKind", false, "RULE_SEARCH_KIND");
        public final static Property RuleSearchLastChapter = new Property(15, String.class, "ruleSearchLastChapter", false, "RULE_SEARCH_LAST_CHAPTER");
        public final static Property RuleSearchCoverUrl = new Property(16, String.class, "ruleSearchCoverUrl", false, "RULE_SEARCH_COVER_URL");
        public final static Property RuleSearchNoteUrl = new Property(17, String.class, "ruleSearchNoteUrl", false, "RULE_SEARCH_NOTE_URL");
        public final static Property RuleBookName = new Property(18, String.class, "ruleBookName", false, "RULE_BOOK_NAME");
        public final static Property RuleBookAuthor = new Property(19, String.class, "ruleBookAuthor", false, "RULE_BOOK_AUTHOR");
        public final static Property RuleChapterUrl = new Property(20, String.class, "ruleChapterUrl", false, "RULE_CHAPTER_URL");
        public final static Property RuleChapterUrlNext = new Property(21, String.class, "ruleChapterUrlNext", false, "RULE_CHAPTER_URL_NEXT");
        public final static Property RuleCoverUrl = new Property(22, String.class, "ruleCoverUrl", false, "RULE_COVER_URL");
        public final static Property RuleIntroduce = new Property(23, String.class, "ruleIntroduce", false, "RULE_INTRODUCE");
        public final static Property RuleChapterList = new Property(24, String.class, "ruleChapterList", false, "RULE_CHAPTER_LIST");
        public final static Property RuleChapterName = new Property(25, String.class, "ruleChapterName", false, "RULE_CHAPTER_NAME");
        public final static Property RuleContentUrl = new Property(26, String.class, "ruleContentUrl", false, "RULE_CONTENT_URL");
        public final static Property RuleContentUrlNext = new Property(27, String.class, "ruleContentUrlNext", false, "RULE_CONTENT_URL_NEXT");
        public final static Property RuleBookContent = new Property(28, String.class, "ruleBookContent", false, "RULE_BOOK_CONTENT");
        public final static Property RuleBookKind = new Property(29, String.class, "ruleBookKind", false, "RULE_BOOK_KIND");
        public final static Property RuleBookLastChapter = new Property(30, String.class, "ruleBookLastChapter", false, "RULE_BOOK_LAST_CHAPTER");
        public final static Property RuleBookUrlPattern = new Property(31, String.class, "ruleBookUrlPattern", false, "RULE_BOOK_URL_PATTERN");
        public final static Property HttpUserAgent = new Property(32, String.class, "httpUserAgent", false, "HTTP_USER_AGENT");
    }


    public BookSourceBeanDao(DaoConfig config) {
        super(config);
    }
    
    public BookSourceBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOK_SOURCE_BEAN\" (" + //
                "\"BOOK_SOURCE_URL\" TEXT PRIMARY KEY NOT NULL ," + // 0: bookSourceUrl
                "\"BOOK_SOURCE_NAME\" TEXT," + // 1: bookSourceName
                "\"BOOK_SOURCE_GROUP\" TEXT," + // 2: bookSourceGroup
                "\"CHECK_URL\" TEXT," + // 3: checkUrl
                "\"LOGIN_URL\" TEXT," + // 4: loginUrl
                "\"LAST_UPDATE_TIME\" INTEGER," + // 5: lastUpdateTime
                "\"SERIAL_NUMBER\" INTEGER NOT NULL ," + // 6: serialNumber
                "\"WEIGHT\" INTEGER NOT NULL ," + // 7: weight
                "\"ENABLE\" INTEGER NOT NULL ," + // 8: enable
                "\"RULE_FIND_URL\" TEXT," + // 9: ruleFindUrl
                "\"RULE_SEARCH_URL\" TEXT," + // 10: ruleSearchUrl
                "\"RULE_SEARCH_LIST\" TEXT," + // 11: ruleSearchList
                "\"RULE_SEARCH_NAME\" TEXT," + // 12: ruleSearchName
                "\"RULE_SEARCH_AUTHOR\" TEXT," + // 13: ruleSearchAuthor
                "\"RULE_SEARCH_KIND\" TEXT," + // 14: ruleSearchKind
                "\"RULE_SEARCH_LAST_CHAPTER\" TEXT," + // 15: ruleSearchLastChapter
                "\"RULE_SEARCH_COVER_URL\" TEXT," + // 16: ruleSearchCoverUrl
                "\"RULE_SEARCH_NOTE_URL\" TEXT," + // 17: ruleSearchNoteUrl
                "\"RULE_BOOK_NAME\" TEXT," + // 18: ruleBookName
                "\"RULE_BOOK_AUTHOR\" TEXT," + // 19: ruleBookAuthor
                "\"RULE_CHAPTER_URL\" TEXT," + // 20: ruleChapterUrl
                "\"RULE_CHAPTER_URL_NEXT\" TEXT," + // 21: ruleChapterUrlNext
                "\"RULE_COVER_URL\" TEXT," + // 22: ruleCoverUrl
                "\"RULE_INTRODUCE\" TEXT," + // 23: ruleIntroduce
                "\"RULE_CHAPTER_LIST\" TEXT," + // 24: ruleChapterList
                "\"RULE_CHAPTER_NAME\" TEXT," + // 25: ruleChapterName
                "\"RULE_CONTENT_URL\" TEXT," + // 26: ruleContentUrl
                "\"RULE_CONTENT_URL_NEXT\" TEXT," + // 27: ruleContentUrlNext
                "\"RULE_BOOK_CONTENT\" TEXT," + // 28: ruleBookContent
                "\"RULE_BOOK_KIND\" TEXT," + // 29: ruleBookKind
                "\"RULE_BOOK_LAST_CHAPTER\" TEXT," + // 30: ruleBookLastChapter
                "\"RULE_BOOK_URL_PATTERN\" TEXT," + // 31: ruleBookUrlPattern
                "\"HTTP_USER_AGENT\" TEXT);"); // 32: httpUserAgent
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOK_SOURCE_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BookSourceBean entity) {
        stmt.clearBindings();
 
        String bookSourceUrl = entity.getBookSourceUrl();
        if (bookSourceUrl != null) {
            stmt.bindString(1, bookSourceUrl);
        }
 
        String bookSourceName = entity.getBookSourceName();
        if (bookSourceName != null) {
            stmt.bindString(2, bookSourceName);
        }
 
        String bookSourceGroup = entity.getBookSourceGroup();
        if (bookSourceGroup != null) {
            stmt.bindString(3, bookSourceGroup);
        }
 
        String checkUrl = entity.getCheckUrl();
        if (checkUrl != null) {
            stmt.bindString(4, checkUrl);
        }
 
        String loginUrl = entity.getLoginUrl();
        if (loginUrl != null) {
            stmt.bindString(5, loginUrl);
        }
 
        Long lastUpdateTime = entity.getLastUpdateTime();
        if (lastUpdateTime != null) {
            stmt.bindLong(6, lastUpdateTime);
        }
        stmt.bindLong(7, entity.getSerialNumber());
        stmt.bindLong(8, entity.getWeight());
        stmt.bindLong(9, entity.getEnable() ? 1L: 0L);
 
        String ruleFindUrl = entity.getRuleFindUrl();
        if (ruleFindUrl != null) {
            stmt.bindString(10, ruleFindUrl);
        }
 
        String ruleSearchUrl = entity.getRuleSearchUrl();
        if (ruleSearchUrl != null) {
            stmt.bindString(11, ruleSearchUrl);
        }
 
        String ruleSearchList = entity.getRuleSearchList();
        if (ruleSearchList != null) {
            stmt.bindString(12, ruleSearchList);
        }
 
        String ruleSearchName = entity.getRuleSearchName();
        if (ruleSearchName != null) {
            stmt.bindString(13, ruleSearchName);
        }
 
        String ruleSearchAuthor = entity.getRuleSearchAuthor();
        if (ruleSearchAuthor != null) {
            stmt.bindString(14, ruleSearchAuthor);
        }
 
        String ruleSearchKind = entity.getRuleSearchKind();
        if (ruleSearchKind != null) {
            stmt.bindString(15, ruleSearchKind);
        }
 
        String ruleSearchLastChapter = entity.getRuleSearchLastChapter();
        if (ruleSearchLastChapter != null) {
            stmt.bindString(16, ruleSearchLastChapter);
        }
 
        String ruleSearchCoverUrl = entity.getRuleSearchCoverUrl();
        if (ruleSearchCoverUrl != null) {
            stmt.bindString(17, ruleSearchCoverUrl);
        }
 
        String ruleSearchNoteUrl = entity.getRuleSearchNoteUrl();
        if (ruleSearchNoteUrl != null) {
            stmt.bindString(18, ruleSearchNoteUrl);
        }
 
        String ruleBookName = entity.getRuleBookName();
        if (ruleBookName != null) {
            stmt.bindString(19, ruleBookName);
        }
 
        String ruleBookAuthor = entity.getRuleBookAuthor();
        if (ruleBookAuthor != null) {
            stmt.bindString(20, ruleBookAuthor);
        }
 
        String ruleChapterUrl = entity.getRuleChapterUrl();
        if (ruleChapterUrl != null) {
            stmt.bindString(21, ruleChapterUrl);
        }
 
        String ruleChapterUrlNext = entity.getRuleChapterUrlNext();
        if (ruleChapterUrlNext != null) {
            stmt.bindString(22, ruleChapterUrlNext);
        }
 
        String ruleCoverUrl = entity.getRuleCoverUrl();
        if (ruleCoverUrl != null) {
            stmt.bindString(23, ruleCoverUrl);
        }
 
        String ruleIntroduce = entity.getRuleIntroduce();
        if (ruleIntroduce != null) {
            stmt.bindString(24, ruleIntroduce);
        }
 
        String ruleChapterList = entity.getRuleChapterList();
        if (ruleChapterList != null) {
            stmt.bindString(25, ruleChapterList);
        }
 
        String ruleChapterName = entity.getRuleChapterName();
        if (ruleChapterName != null) {
            stmt.bindString(26, ruleChapterName);
        }
 
        String ruleContentUrl = entity.getRuleContentUrl();
        if (ruleContentUrl != null) {
            stmt.bindString(27, ruleContentUrl);
        }
 
        String ruleContentUrlNext = entity.getRuleContentUrlNext();
        if (ruleContentUrlNext != null) {
            stmt.bindString(28, ruleContentUrlNext);
        }
 
        String ruleBookContent = entity.getRuleBookContent();
        if (ruleBookContent != null) {
            stmt.bindString(29, ruleBookContent);
        }
 
        String ruleBookKind = entity.getRuleBookKind();
        if (ruleBookKind != null) {
            stmt.bindString(30, ruleBookKind);
        }
 
        String ruleBookLastChapter = entity.getRuleBookLastChapter();
        if (ruleBookLastChapter != null) {
            stmt.bindString(31, ruleBookLastChapter);
        }
 
        String ruleBookUrlPattern = entity.getRuleBookUrlPattern();
        if (ruleBookUrlPattern != null) {
            stmt.bindString(32, ruleBookUrlPattern);
        }
 
        String httpUserAgent = entity.getHttpUserAgent();
        if (httpUserAgent != null) {
            stmt.bindString(33, httpUserAgent);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BookSourceBean entity) {
        stmt.clearBindings();
 
        String bookSourceUrl = entity.getBookSourceUrl();
        if (bookSourceUrl != null) {
            stmt.bindString(1, bookSourceUrl);
        }
 
        String bookSourceName = entity.getBookSourceName();
        if (bookSourceName != null) {
            stmt.bindString(2, bookSourceName);
        }
 
        String bookSourceGroup = entity.getBookSourceGroup();
        if (bookSourceGroup != null) {
            stmt.bindString(3, bookSourceGroup);
        }
 
        String checkUrl = entity.getCheckUrl();
        if (checkUrl != null) {
            stmt.bindString(4, checkUrl);
        }
 
        String loginUrl = entity.getLoginUrl();
        if (loginUrl != null) {
            stmt.bindString(5, loginUrl);
        }
 
        Long lastUpdateTime = entity.getLastUpdateTime();
        if (lastUpdateTime != null) {
            stmt.bindLong(6, lastUpdateTime);
        }
        stmt.bindLong(7, entity.getSerialNumber());
        stmt.bindLong(8, entity.getWeight());
        stmt.bindLong(9, entity.getEnable() ? 1L: 0L);
 
        String ruleFindUrl = entity.getRuleFindUrl();
        if (ruleFindUrl != null) {
            stmt.bindString(10, ruleFindUrl);
        }
 
        String ruleSearchUrl = entity.getRuleSearchUrl();
        if (ruleSearchUrl != null) {
            stmt.bindString(11, ruleSearchUrl);
        }
 
        String ruleSearchList = entity.getRuleSearchList();
        if (ruleSearchList != null) {
            stmt.bindString(12, ruleSearchList);
        }
 
        String ruleSearchName = entity.getRuleSearchName();
        if (ruleSearchName != null) {
            stmt.bindString(13, ruleSearchName);
        }
 
        String ruleSearchAuthor = entity.getRuleSearchAuthor();
        if (ruleSearchAuthor != null) {
            stmt.bindString(14, ruleSearchAuthor);
        }
 
        String ruleSearchKind = entity.getRuleSearchKind();
        if (ruleSearchKind != null) {
            stmt.bindString(15, ruleSearchKind);
        }
 
        String ruleSearchLastChapter = entity.getRuleSearchLastChapter();
        if (ruleSearchLastChapter != null) {
            stmt.bindString(16, ruleSearchLastChapter);
        }
 
        String ruleSearchCoverUrl = entity.getRuleSearchCoverUrl();
        if (ruleSearchCoverUrl != null) {
            stmt.bindString(17, ruleSearchCoverUrl);
        }
 
        String ruleSearchNoteUrl = entity.getRuleSearchNoteUrl();
        if (ruleSearchNoteUrl != null) {
            stmt.bindString(18, ruleSearchNoteUrl);
        }
 
        String ruleBookName = entity.getRuleBookName();
        if (ruleBookName != null) {
            stmt.bindString(19, ruleBookName);
        }
 
        String ruleBookAuthor = entity.getRuleBookAuthor();
        if (ruleBookAuthor != null) {
            stmt.bindString(20, ruleBookAuthor);
        }
 
        String ruleChapterUrl = entity.getRuleChapterUrl();
        if (ruleChapterUrl != null) {
            stmt.bindString(21, ruleChapterUrl);
        }
 
        String ruleChapterUrlNext = entity.getRuleChapterUrlNext();
        if (ruleChapterUrlNext != null) {
            stmt.bindString(22, ruleChapterUrlNext);
        }
 
        String ruleCoverUrl = entity.getRuleCoverUrl();
        if (ruleCoverUrl != null) {
            stmt.bindString(23, ruleCoverUrl);
        }
 
        String ruleIntroduce = entity.getRuleIntroduce();
        if (ruleIntroduce != null) {
            stmt.bindString(24, ruleIntroduce);
        }
 
        String ruleChapterList = entity.getRuleChapterList();
        if (ruleChapterList != null) {
            stmt.bindString(25, ruleChapterList);
        }
 
        String ruleChapterName = entity.getRuleChapterName();
        if (ruleChapterName != null) {
            stmt.bindString(26, ruleChapterName);
        }
 
        String ruleContentUrl = entity.getRuleContentUrl();
        if (ruleContentUrl != null) {
            stmt.bindString(27, ruleContentUrl);
        }
 
        String ruleContentUrlNext = entity.getRuleContentUrlNext();
        if (ruleContentUrlNext != null) {
            stmt.bindString(28, ruleContentUrlNext);
        }
 
        String ruleBookContent = entity.getRuleBookContent();
        if (ruleBookContent != null) {
            stmt.bindString(29, ruleBookContent);
        }
 
        String ruleBookKind = entity.getRuleBookKind();
        if (ruleBookKind != null) {
            stmt.bindString(30, ruleBookKind);
        }
 
        String ruleBookLastChapter = entity.getRuleBookLastChapter();
        if (ruleBookLastChapter != null) {
            stmt.bindString(31, ruleBookLastChapter);
        }
 
        String ruleBookUrlPattern = entity.getRuleBookUrlPattern();
        if (ruleBookUrlPattern != null) {
            stmt.bindString(32, ruleBookUrlPattern);
        }
 
        String httpUserAgent = entity.getHttpUserAgent();
        if (httpUserAgent != null) {
            stmt.bindString(33, httpUserAgent);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public BookSourceBean readEntity(Cursor cursor, int offset) {
        BookSourceBean entity = new BookSourceBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // bookSourceUrl
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // bookSourceName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // bookSourceGroup
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // checkUrl
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // loginUrl
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5), // lastUpdateTime
            cursor.getInt(offset + 6), // serialNumber
            cursor.getInt(offset + 7), // weight
            cursor.getShort(offset + 8) != 0, // enable
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // ruleFindUrl
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // ruleSearchUrl
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // ruleSearchList
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // ruleSearchName
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // ruleSearchAuthor
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // ruleSearchKind
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // ruleSearchLastChapter
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // ruleSearchCoverUrl
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // ruleSearchNoteUrl
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // ruleBookName
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // ruleBookAuthor
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // ruleChapterUrl
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // ruleChapterUrlNext
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // ruleCoverUrl
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // ruleIntroduce
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // ruleChapterList
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // ruleChapterName
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // ruleContentUrl
            cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27), // ruleContentUrlNext
            cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28), // ruleBookContent
            cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29), // ruleBookKind
            cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30), // ruleBookLastChapter
            cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31), // ruleBookUrlPattern
            cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32) // httpUserAgent
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BookSourceBean entity, int offset) {
        entity.setBookSourceUrl(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setBookSourceName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setBookSourceGroup(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCheckUrl(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setLoginUrl(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setLastUpdateTime(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
        entity.setSerialNumber(cursor.getInt(offset + 6));
        entity.setWeight(cursor.getInt(offset + 7));
        entity.setEnable(cursor.getShort(offset + 8) != 0);
        entity.setRuleFindUrl(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setRuleSearchUrl(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setRuleSearchList(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setRuleSearchName(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setRuleSearchAuthor(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setRuleSearchKind(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setRuleSearchLastChapter(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setRuleSearchCoverUrl(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setRuleSearchNoteUrl(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setRuleBookName(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setRuleBookAuthor(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setRuleChapterUrl(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setRuleChapterUrlNext(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setRuleCoverUrl(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setRuleIntroduce(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setRuleChapterList(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setRuleChapterName(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setRuleContentUrl(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setRuleContentUrlNext(cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27));
        entity.setRuleBookContent(cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28));
        entity.setRuleBookKind(cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29));
        entity.setRuleBookLastChapter(cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30));
        entity.setRuleBookUrlPattern(cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31));
        entity.setHttpUserAgent(cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32));
     }
    
    @Override
    protected final String updateKeyAfterInsert(BookSourceBean entity, long rowId) {
        return entity.getBookSourceUrl();
    }
    
    @Override
    public String getKey(BookSourceBean entity) {
        if(entity != null) {
            return entity.getBookSourceUrl();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BookSourceBean entity) {
        return entity.getBookSourceUrl() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
