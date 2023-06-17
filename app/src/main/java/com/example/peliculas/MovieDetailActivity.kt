package com.example.peliculas

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MovieDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val movieTitle = "Título de la Película"
            val movieDescription = "Breve descripción de la película"

            MovieDetailScreen(movieTitle, movieDescription)
        }
    }
}

@Composable
fun MovieDetailScreen(title: String, description: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(16.dp)
        )
        Image(
            painter = painterResource(R.drawable.movie_poster),
            contentDescription = "Poster de la película",
            modifier = Modifier.size(200.dp).padding(16.dp)
        )
        Text(
            text = description,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview
@Composable
fun MovieDetailScreenPreview() {
    MovieDetailScreen("Título de la Película", "Breve descripción de la película")
}
