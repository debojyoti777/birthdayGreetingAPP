package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createButton(view: View) {

        val name = editTextTextPersonName.editableText.toString()
        if(name.length>3){
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
        }else{
            name.setError("Name Minimum length is 4");
        }
        val intent = Intent(this, birthdaygreetingactivity::class.java)
        intent.putExtra("name", name)
        startActivity(intent)
    }
    
}

private fun String.setError(s: String) {
    print(s)

}

