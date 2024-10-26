package com.example.ana_toma_uf1_act7

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity;


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextUsername = findViewById<EditText>(R.id.editTextUsername)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            // Muestra el Toast con los datos ingresados
            Toast.makeText(this, "Usuari: $username, Contrasenya: $password", Toast.LENGTH_SHORT).show()

            // Imprime en el Logcat
            Log.d("LoginInfo", "Usuari: $username, Contrasenya: $password")
        }
    }
}