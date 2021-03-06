package com.wwssxx.kaiyan.module.greendao;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.SqlUtils;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.wwssxx.kaiyan.model.modelforvideo.Author;
import com.wwssxx.kaiyan.model.modelforvideo.Consumption;
import com.wwssxx.kaiyan.model.modelforvideo.Cover;
import com.wwssxx.kaiyan.model.modelforvideo.Provider;
import com.wwssxx.kaiyan.model.modelforvideo.WebUrl;

import com.wwssxx.kaiyan.model.modelforvideo.Video;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "VIDEO".
*/
public class VideoDao extends AbstractDao<Video, Long> {

    public static final String TABLENAME = "VIDEO";

    /**
     * Properties of entity Video.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property KeyId = new Property(0, Long.class, "keyId", true, "_id");
        public final static Property Id = new Property(1, long.class, "id", false, "ID");
        public final static Property CustomerId = new Property(2, long.class, "customerId", false, "CUSTOMER_ID");
        public final static Property DataType = new Property(3, String.class, "dataType", false, "DATA_TYPE");
        public final static Property Title = new Property(4, String.class, "title", false, "TITLE");
        public final static Property Description = new Property(5, String.class, "description", false, "DESCRIPTION");
        public final static Property Category = new Property(6, String.class, "category", false, "CATEGORY");
        public final static Property PlayUrl = new Property(7, String.class, "playUrl", false, "PLAY_URL");
        public final static Property Duration = new Property(8, int.class, "duration", false, "DURATION");
        public final static Property ReleaseTime = new Property(9, long.class, "releaseTime", false, "RELEASE_TIME");
        public final static Property Campaign = new Property(10, String.class, "campaign", false, "CAMPAIGN");
        public final static Property WaterMarks = new Property(11, String.class, "waterMarks", false, "WATER_MARKS");
        public final static Property AdTrack = new Property(12, String.class, "adTrack", false, "AD_TRACK");
        public final static Property Type = new Property(13, String.class, "type", false, "TYPE");
        public final static Property TitlePgc = new Property(14, String.class, "titlePgc", false, "TITLE_PGC");
        public final static Property DescriptionPgc = new Property(15, String.class, "descriptionPgc", false, "DESCRIPTION_PGC");
        public final static Property Idx = new Property(16, int.class, "idx", false, "IDX");
        public final static Property ShareAdTrack = new Property(17, String.class, "shareAdTrack", false, "SHARE_AD_TRACK");
        public final static Property FavoriteAdTrack = new Property(18, String.class, "favoriteAdTrack", false, "FAVORITE_AD_TRACK");
        public final static Property WebAdTrack = new Property(19, String.class, "webAdTrack", false, "WEB_AD_TRACK");
        public final static Property Date = new Property(20, long.class, "date", false, "DATE");
        public final static Property Promotion = new Property(21, String.class, "promotion", false, "PROMOTION");
        public final static Property Label = new Property(22, String.class, "label", false, "LABEL");
        public final static Property DescriptionEditor = new Property(23, String.class, "descriptionEditor", false, "DESCRIPTION_EDITOR");
        public final static Property Collected = new Property(24, boolean.class, "collected", false, "COLLECTED");
        public final static Property Played = new Property(25, boolean.class, "played", false, "PLAYED");
    }

    private DaoSession daoSession;


    public VideoDao(DaoConfig config) {
        super(config);
    }
    
    public VideoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"VIDEO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: keyId
                "\"ID\" INTEGER NOT NULL ," + // 1: id
                "\"CUSTOMER_ID\" INTEGER NOT NULL ," + // 2: customerId
                "\"DATA_TYPE\" TEXT," + // 3: dataType
                "\"TITLE\" TEXT," + // 4: title
                "\"DESCRIPTION\" TEXT," + // 5: description
                "\"CATEGORY\" TEXT," + // 6: category
                "\"PLAY_URL\" TEXT," + // 7: playUrl
                "\"DURATION\" INTEGER NOT NULL ," + // 8: duration
                "\"RELEASE_TIME\" INTEGER NOT NULL ," + // 9: releaseTime
                "\"CAMPAIGN\" TEXT," + // 10: campaign
                "\"WATER_MARKS\" TEXT," + // 11: waterMarks
                "\"AD_TRACK\" TEXT," + // 12: adTrack
                "\"TYPE\" TEXT," + // 13: type
                "\"TITLE_PGC\" TEXT," + // 14: titlePgc
                "\"DESCRIPTION_PGC\" TEXT," + // 15: descriptionPgc
                "\"IDX\" INTEGER NOT NULL ," + // 16: idx
                "\"SHARE_AD_TRACK\" TEXT," + // 17: shareAdTrack
                "\"FAVORITE_AD_TRACK\" TEXT," + // 18: favoriteAdTrack
                "\"WEB_AD_TRACK\" TEXT," + // 19: webAdTrack
                "\"DATE\" INTEGER NOT NULL ," + // 20: date
                "\"PROMOTION\" TEXT," + // 21: promotion
                "\"LABEL\" TEXT," + // 22: label
                "\"DESCRIPTION_EDITOR\" TEXT," + // 23: descriptionEditor
                "\"COLLECTED\" INTEGER NOT NULL ," + // 24: collected
                "\"PLAYED\" INTEGER NOT NULL );"); // 25: played
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"VIDEO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Video entity) {
        stmt.clearBindings();
 
        Long keyId = entity.getKeyId();
        if (keyId != null) {
            stmt.bindLong(1, keyId);
        }
        stmt.bindLong(2, entity.getId());
        stmt.bindLong(3, entity.getCustomerId());
 
        String dataType = entity.getDataType();
        if (dataType != null) {
            stmt.bindString(4, dataType);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(5, title);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(6, description);
        }
 
        String category = entity.getCategory();
        if (category != null) {
            stmt.bindString(7, category);
        }
 
        String playUrl = entity.getPlayUrl();
        if (playUrl != null) {
            stmt.bindString(8, playUrl);
        }
        stmt.bindLong(9, entity.getDuration());
        stmt.bindLong(10, entity.getReleaseTime());
 
        String campaign = entity.getCampaign();
        if (campaign != null) {
            stmt.bindString(11, campaign);
        }
 
        String waterMarks = entity.getWaterMarks();
        if (waterMarks != null) {
            stmt.bindString(12, waterMarks);
        }
 
        String adTrack = entity.getAdTrack();
        if (adTrack != null) {
            stmt.bindString(13, adTrack);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(14, type);
        }
 
        String titlePgc = entity.getTitlePgc();
        if (titlePgc != null) {
            stmt.bindString(15, titlePgc);
        }
 
        String descriptionPgc = entity.getDescriptionPgc();
        if (descriptionPgc != null) {
            stmt.bindString(16, descriptionPgc);
        }
        stmt.bindLong(17, entity.getIdx());
 
        String shareAdTrack = entity.getShareAdTrack();
        if (shareAdTrack != null) {
            stmt.bindString(18, shareAdTrack);
        }
 
        String favoriteAdTrack = entity.getFavoriteAdTrack();
        if (favoriteAdTrack != null) {
            stmt.bindString(19, favoriteAdTrack);
        }
 
        String webAdTrack = entity.getWebAdTrack();
        if (webAdTrack != null) {
            stmt.bindString(20, webAdTrack);
        }
        stmt.bindLong(21, entity.getDate());
 
        String promotion = entity.getPromotion();
        if (promotion != null) {
            stmt.bindString(22, promotion);
        }
 
        String label = entity.getLabel();
        if (label != null) {
            stmt.bindString(23, label);
        }
 
        String descriptionEditor = entity.getDescriptionEditor();
        if (descriptionEditor != null) {
            stmt.bindString(24, descriptionEditor);
        }
        stmt.bindLong(25, entity.getCollected() ? 1L: 0L);
        stmt.bindLong(26, entity.getPlayed() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Video entity) {
        stmt.clearBindings();
 
        Long keyId = entity.getKeyId();
        if (keyId != null) {
            stmt.bindLong(1, keyId);
        }
        stmt.bindLong(2, entity.getId());
        stmt.bindLong(3, entity.getCustomerId());
 
        String dataType = entity.getDataType();
        if (dataType != null) {
            stmt.bindString(4, dataType);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(5, title);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(6, description);
        }
 
        String category = entity.getCategory();
        if (category != null) {
            stmt.bindString(7, category);
        }
 
        String playUrl = entity.getPlayUrl();
        if (playUrl != null) {
            stmt.bindString(8, playUrl);
        }
        stmt.bindLong(9, entity.getDuration());
        stmt.bindLong(10, entity.getReleaseTime());
 
        String campaign = entity.getCampaign();
        if (campaign != null) {
            stmt.bindString(11, campaign);
        }
 
        String waterMarks = entity.getWaterMarks();
        if (waterMarks != null) {
            stmt.bindString(12, waterMarks);
        }
 
        String adTrack = entity.getAdTrack();
        if (adTrack != null) {
            stmt.bindString(13, adTrack);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(14, type);
        }
 
        String titlePgc = entity.getTitlePgc();
        if (titlePgc != null) {
            stmt.bindString(15, titlePgc);
        }
 
        String descriptionPgc = entity.getDescriptionPgc();
        if (descriptionPgc != null) {
            stmt.bindString(16, descriptionPgc);
        }
        stmt.bindLong(17, entity.getIdx());
 
        String shareAdTrack = entity.getShareAdTrack();
        if (shareAdTrack != null) {
            stmt.bindString(18, shareAdTrack);
        }
 
        String favoriteAdTrack = entity.getFavoriteAdTrack();
        if (favoriteAdTrack != null) {
            stmt.bindString(19, favoriteAdTrack);
        }
 
        String webAdTrack = entity.getWebAdTrack();
        if (webAdTrack != null) {
            stmt.bindString(20, webAdTrack);
        }
        stmt.bindLong(21, entity.getDate());
 
        String promotion = entity.getPromotion();
        if (promotion != null) {
            stmt.bindString(22, promotion);
        }
 
        String label = entity.getLabel();
        if (label != null) {
            stmt.bindString(23, label);
        }
 
        String descriptionEditor = entity.getDescriptionEditor();
        if (descriptionEditor != null) {
            stmt.bindString(24, descriptionEditor);
        }
        stmt.bindLong(25, entity.getCollected() ? 1L: 0L);
        stmt.bindLong(26, entity.getPlayed() ? 1L: 0L);
    }

    @Override
    protected final void attachEntity(Video entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Video readEntity(Cursor cursor, int offset) {
        Video entity = new Video( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // keyId
            cursor.getLong(offset + 1), // id
            cursor.getLong(offset + 2), // customerId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // dataType
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // title
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // description
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // category
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // playUrl
            cursor.getInt(offset + 8), // duration
            cursor.getLong(offset + 9), // releaseTime
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // campaign
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // waterMarks
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // adTrack
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // type
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // titlePgc
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // descriptionPgc
            cursor.getInt(offset + 16), // idx
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // shareAdTrack
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // favoriteAdTrack
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // webAdTrack
            cursor.getLong(offset + 20), // date
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // promotion
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // label
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // descriptionEditor
            cursor.getShort(offset + 24) != 0, // collected
            cursor.getShort(offset + 25) != 0 // played
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Video entity, int offset) {
        entity.setKeyId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setId(cursor.getLong(offset + 1));
        entity.setCustomerId(cursor.getLong(offset + 2));
        entity.setDataType(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTitle(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDescription(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCategory(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPlayUrl(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setDuration(cursor.getInt(offset + 8));
        entity.setReleaseTime(cursor.getLong(offset + 9));
        entity.setCampaign(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setWaterMarks(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setAdTrack(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setType(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setTitlePgc(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setDescriptionPgc(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setIdx(cursor.getInt(offset + 16));
        entity.setShareAdTrack(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setFavoriteAdTrack(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setWebAdTrack(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setDate(cursor.getLong(offset + 20));
        entity.setPromotion(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setLabel(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setDescriptionEditor(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setCollected(cursor.getShort(offset + 24) != 0);
        entity.setPlayed(cursor.getShort(offset + 25) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Video entity, long rowId) {
        entity.setKeyId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Video entity) {
        if(entity != null) {
            return entity.getKeyId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Video entity) {
        return entity.getKeyId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getProviderDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T1", daoSession.getAuthorDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T2", daoSession.getCoverDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T3", daoSession.getWebUrlDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T4", daoSession.getConsumptionDao().getAllColumns());
            builder.append(" FROM VIDEO T");
            builder.append(" LEFT JOIN PROVIDER T0 ON T.\"CUSTOMER_ID\"=T0.\"_id\"");
            builder.append(" LEFT JOIN AUTHOR T1 ON T.\"CUSTOMER_ID\"=T1.\"_id\"");
            builder.append(" LEFT JOIN COVER T2 ON T.\"CUSTOMER_ID\"=T2.\"_id\"");
            builder.append(" LEFT JOIN WEB_URL T3 ON T.\"CUSTOMER_ID\"=T3.\"_id\"");
            builder.append(" LEFT JOIN CONSUMPTION T4 ON T.\"CUSTOMER_ID\"=T4.\"_id\"");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Video loadCurrentDeep(Cursor cursor, boolean lock) {
        Video entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        Provider provider = loadCurrentOther(daoSession.getProviderDao(), cursor, offset);
         if(provider != null) {
            entity.setProvider(provider);
        }
        offset += daoSession.getProviderDao().getAllColumns().length;

        Author author = loadCurrentOther(daoSession.getAuthorDao(), cursor, offset);
         if(author != null) {
            entity.setAuthor(author);
        }
        offset += daoSession.getAuthorDao().getAllColumns().length;

        Cover cover = loadCurrentOther(daoSession.getCoverDao(), cursor, offset);
         if(cover != null) {
            entity.setCover(cover);
        }
        offset += daoSession.getCoverDao().getAllColumns().length;

        WebUrl webUrl = loadCurrentOther(daoSession.getWebUrlDao(), cursor, offset);
         if(webUrl != null) {
            entity.setWebUrl(webUrl);
        }
        offset += daoSession.getWebUrlDao().getAllColumns().length;

        Consumption consumption = loadCurrentOther(daoSession.getConsumptionDao(), cursor, offset);
         if(consumption != null) {
            entity.setConsumption(consumption);
        }

        return entity;    
    }

    public Video loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<Video> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Video> list = new ArrayList<Video>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<Video> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Video> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
