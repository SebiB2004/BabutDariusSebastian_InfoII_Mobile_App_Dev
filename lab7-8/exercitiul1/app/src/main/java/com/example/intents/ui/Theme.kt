package com.example.intents.ui.theme


import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Definește paleta de culori pentru tema ta
private val LightColorPalette = lightColorScheme(
    primary = Color(0xFF6200EE),
    secondary = Color(0xFF03DAC5),
    background = Color(0xFF121212),
    surface = Color(0xFF121212),
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.White,
    onSurface = Color.White
)


@Composable
fun IntentsAndIntentFiltersTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColorPalette,  // Aplică paleta de culori
        content = content                 // Afișează conținutul specificat
    )
}
