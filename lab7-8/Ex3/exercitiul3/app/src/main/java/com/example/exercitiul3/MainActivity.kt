package com.example.exercitiul3

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intents.GigelActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

            setContent {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Button(onClick = {
                        Intent(applicationContext, GigelActivity::class.java).also{
                            startActivity(it)
                        }
                    }){
                        Text("Gigel");
                    }
                    Button(onClick = {
                        Intent(applicationContext, IonActivity::class.java).also{
                            startActivity(it)
                        }
                    }){
                        Text("Ion")
                    }
                    Button(onClick = {
                        Intent(applicationContext, AlexActivity::class.java).also{
                            startActivity(it)
                        }
                    }){
                        Text("Alex")
                    }
                    Button(onClick = {
                        Intent(applicationContext, CristiActivity::class.java).also{
                            startActivity(it)
                        }
                    }){
                        Text("Cristi")
                    }
                    Button(onClick = {
                        Intent(applicationContext, MarianActivity::class.java).also{
                            startActivity(it)
                        }
                    }){
                        Text("Marian")
                    }
                }
            }

    }
}