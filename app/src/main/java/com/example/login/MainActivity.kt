package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun login(view: View) {
        var getname=findViewById<EditText>(R.id.uname)
        var getpswrd=findViewById<EditText>(R.id.pswrd)
        Toast.makeText(this,getname.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getpswrd.text.toString(),Toast.LENGTH_LONG).show()
    }
}