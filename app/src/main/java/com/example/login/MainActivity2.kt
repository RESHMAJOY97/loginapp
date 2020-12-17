package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun register(view: View) {
        var getname=findViewById<EditText>(R.id.name)
        var getnum=findViewById<EditText>(R.id.num)
        var getmail=findViewById<EditText>(R.id.email)
        var getuname=findViewById<EditText>(R.id.uname)
        var getpswrd=findViewById<EditText>(R.id.pswrd)
        var getcpswrd=findViewById<EditText>(R.id.cpswrd)
        Toast.makeText(this,getname.text.toString()+getnum.text.toString()+getmail.text.toString()+getuname.text.toString()+getpswrd.text.toString()+getcpswrd.text.toString(), Toast.LENGTH_LONG).show()

    }

    fun login(view: View) {
        intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

}