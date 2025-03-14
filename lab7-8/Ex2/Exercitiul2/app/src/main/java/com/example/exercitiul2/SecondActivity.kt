package com.example.intents
import androidx.compose.foundation.Image
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.exercitiul2.MainActivity

class SecondActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Image(
                    painter = painterResource(id = R.drawable.spongebob),
                    contentDescription = "Imagine cu Spongebob",
                    modifier = Modifier.fillMaxWidth().height(200.dp)
                )
                Button(onClick = {
                    Intent(applicationContext, MainActivity::class.java).also {
                        startActivity(it)
                    }
                }){
                    Text("Treci la activitatea principala!")
                }
                Button(onClick = {
                    Intent(applicationContext, ThirdActivity::class.java).also {
                        startActivity(it)
                    }
                }){
                    Text("Treci la a treia activitate!")
                }
            }
            Column(
                modifier = Modifier.fillMaxSize().padding(top = 100.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text("Esti in a doua activitate!")

            }
            Column(
                modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp).padding(top = 150.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text("SpongeBob Pantaloni Pătrați, cunoscut și ca Buretele Bob Pantaloni Pătrați " +
                        "sau simplu SpongeBob, este un serial de animație creat de educatorul în știință" +
                        " marină și animatorul Stephen Hillenburg pentru Nickelodeon.")

            }
        }
    }
}