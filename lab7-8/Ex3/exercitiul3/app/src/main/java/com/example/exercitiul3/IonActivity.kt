package com.example.exercitiul3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exercitiul3.MainActivity

class IonActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {

            Column(
                modifier = Modifier.fillMaxSize().padding(top = 50.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Button(onClick = {
                    Intent(applicationContext, MainActivity::class.java).also {
                        startActivity(it)
                    }
                }){
                    Text("Treci la activitatea principala!")
                }

            }
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text("Datele despre Ion:",modifier = Modifier.padding(bottom = 16.dp), fontSize = 30.sp)
                Text("Nume: Ion Popa", modifier = Modifier.padding(bottom = 8.dp))
                Text("Varsta: 35 de ani", modifier = Modifier.padding(bottom = 8.dp))
                Text("Email: ionPopa35@gmail.com", modifier = Modifier.padding(bottom = 8.dp))
                Text("Numar de telefon: 0773897602")
            }
            Column(
                modifier = Modifier.fillMaxSize().padding(bottom = 50.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Button(onClick = {
                    val numarTelefon = "tel:+40773897602"
                    val intent = Intent(Intent.ACTION_DIAL, Uri.parse(numarTelefon))
                    startActivity(intent)
                }) {
                    Text("Suna-l pe Ion!")
                }
            }
        }
    }
}