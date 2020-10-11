package com.example.room_practice.Dataclass

import androidx.lifecycle.LiveData

class WordRepositry(private val wordDao: WordDao) {

    val allWords: LiveData<List<Word>> = wordDao.getAlphabetizedWords()

    suspend fun insert(word:Word){
        wordDao.insert(word)
    }
}