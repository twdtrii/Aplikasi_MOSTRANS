package com.example.mostrans
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class list : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.characters_list)

        val btnClick: Button = findViewById(R.id.btn_satu)
        btnClick.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v !=null){
            when(v.id){
                R.id.btn_satu -> {
                    val pindahIntent = Intent(this, detail::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}