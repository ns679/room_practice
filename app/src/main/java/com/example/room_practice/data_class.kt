package com.example.room_practice

import androidx.lifecycle.LiveData
import androidx.room.*

    @Entity(tableName = "word_table")
    class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)
    @Dao
    interface WordDao{
        @Query("SELECT * from word_table ORDER BY word ASC")
        fun getAlphabetizedWords():LiveData<List<Word>>

        @Insert(onConflict = OnConflictStrategy.IGNORE)
        suspend fun insert(word: Word)

        @Query("DELETE FROM word_table")
        suspend fun deleteAll()
    }
