package com.kimdo.mypage3composetest.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kimdo.mypage3composetest.model.UnsplashImage

@Dao
interface UnsplashImageDao {
    @Query("select * from unsplash_image_table")
    fun getAllImages(): PagingSource<Int, UnsplashImage>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addImages(images: List<UnsplashImage>)

    @Query("delete from unsplash_image_table")
    suspend fun deleteAllImages()

}