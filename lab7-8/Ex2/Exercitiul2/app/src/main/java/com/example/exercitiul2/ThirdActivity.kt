package com.example.intents

import android.content.Intent
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
import com.example.exercitiul2.MainActivity

class ThirdActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Button(onClick = {
                    Intent(applicationContext, MainActivity::class.java).also {
                        startActivity(it)
                    }
                }){
                    Text("Treci la activitatea principala!")
                }
                Button(onClick = {
                    Intent(applicationContext, SecondActivity::class.java).also{
                        startActivity(it)
                    }
                }){
                    Text("Treci la a doua activitate!")
                }
            }
            Column(
                modifier = Modifier.fillMaxSize().padding(top = 100.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text("Esti in a treia activitate!")

            }

        }
    }
}