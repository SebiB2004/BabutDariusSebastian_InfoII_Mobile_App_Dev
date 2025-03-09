package com.example.intents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
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
import com.example.intents.ui.theme.IntentsAndIntentFiltersTheme
import androidx.compose.ui.unit.dp

class SecondActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // setContent trebuie să fie apelat direct în onCreate
        setContent {
            IntentsAndIntentFiltersTheme {
                // Aici definești întreaga ierarhie de UI
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
                       Text("Treci la Main Activity!")
                   }
                }
                Column(
                    modifier = Modifier.fillMaxSize().padding(top = 50.dp),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text("Esti in Second Activity!")

                }
            }
        }
    }
}