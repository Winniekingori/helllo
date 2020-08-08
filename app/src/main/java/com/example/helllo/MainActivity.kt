package com.example.helllo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.etpassword
import kotlinx.android.synthetic.main.activity_registeractivity.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnlogin.setOnClickListener {
            var email=etxusername.text.toString()
            var password=etpassword.text.toString()
            Toast.makeText((baseContext), "email", Toast.LENGTH_SHORT).show()
        }
    }
    private  fun nameRecyclerView() {
        recycler_view.layoutManager = LinearLayoutManager(baseContext)

    }
}