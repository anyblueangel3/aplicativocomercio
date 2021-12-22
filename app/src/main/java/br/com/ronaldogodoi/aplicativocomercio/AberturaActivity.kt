package br.com.ronaldogodoi.aplicativocomercio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.os.Looper

class AberturaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abertura)

        val intent: Intent = Intent( this, MainActivity::class.java )

        Handler(Looper.getMainLooper()).postDelayed( {

            startActivity(intent)
            finish()

        },5000)

    }
}