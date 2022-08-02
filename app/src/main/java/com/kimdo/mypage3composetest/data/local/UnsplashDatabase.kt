package com.kimdo.mypage3composetest.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kimdo.mypage3composetest.data.local.dao.UnsplashImageDao
import com.kimdo.mypage3composetest.data.local.dao.UnsplashRemoteKeysDao
import com.kimdo.mypage3composetest.model.UnsplashImage
import com.kimdo.mypage3composetest.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase: RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao
}