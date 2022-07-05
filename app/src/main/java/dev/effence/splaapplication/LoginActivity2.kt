package dev.effence.splaapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class LoginActivity2 : AppCompatActivity() {
    lateinit var btnLogin:Button
    lateinit var tilEmail:TextInputLayout
    lateinit var tilPassword:TextInputLayout
    lateinit var etEmail:EditText
    lateinit var etPasswordd:EditText
    lateinit var tvSignup:TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        btnLogin=findViewById(R.id.btnLogin)
        tilEmail=findViewById(R.id.tilEmail)
        tilPassword=findViewById(R.id.tilPassword)
        etEmail=findViewById(R.id.etEmail)
        etPasswordd=findViewById(R.id.etPasswordd)
        tvSignup=findViewById(R.id.tvSignup)

        btnLogin.setOnClickListener {
//            val intent=Intent(this,LoginActivity2::class.java)
//            startActivity(intent)
            validate()

        }
        tvSignup.setOnClickListener {
            val intent=Intent(this,SignupActivity2::class.java)
            startActivity(intent)
        }

    }
    fun validate(){
        var email=etEmail.text.toString()
        var password=etPasswordd.text.toString()

        if(email.isBlank()){
            etEmail.error="Email require"
        }
        if(password.isBlank()){
            etPasswordd.error="Password required"

        }
    }

}