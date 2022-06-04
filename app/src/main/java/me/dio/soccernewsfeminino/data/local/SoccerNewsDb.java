package me.dio.soccernewsfeminino.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;


import me.dio.soccernewsfeminino.domain.News;

@Database(entities = {News.class}, version = 1)
public abstract class SoccerNewsDb extends RoomDatabase {
    public abstract me.dio.soccernewsfeminino.data.local.NewsDao newsDao();
}
