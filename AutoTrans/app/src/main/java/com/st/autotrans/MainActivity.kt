package com.st.autotrans

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Ты Пидор", Toast.LENGTH_SHORT).show()


//        Handler().postDelayed({
//            val intent = Intent(this, MapsActivity::class.java)
//            startActivity(intent)
//            finish()
//        }, 4000)
    }
}