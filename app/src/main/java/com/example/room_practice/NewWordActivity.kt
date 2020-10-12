package com.example.room_practice

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_new_word.*

class NewWordActivity : AppCompatActivity() {

    private lateinit var editWordView : EditText

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_word)
        editWordView = findViewById(R.id.edit_word)

        val button = findViewById<Button>(R.id.button_save)
        button.setOnClickListener{
            val replayIntent = Intent()
            if(TextUtils.isEmpty(editWordView.text)){
                setResult(Activity.RESULT_OK,replayIntent)
            }else{
                val word = editWordView.text.toString()
                replayIntent.putExtra(EXTRA_REPLY,word)
                setResult(Activity.RESULT_OK,replayIntent)
            }
            finish()
        }
    }

    companion object{
        const val EXTRA_REPLY = "com.example.android.wordlistsql.REPLY"
    }
}


