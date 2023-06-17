package com.example.peliculas

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.peliculas.ui.theme.PeliculasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PeliculasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyMoviesApp()
                }
            }
        }
    }
}
@Composable
fun MyMoviesApp() {
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Mis Películas", style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold))
        Image(
            painter = painterResource(R.drawable.movie_poster),
            contentDescription = "Poster de la película",
            modifier = Modifier.size(200.dp).padding(16.dp)
        )
        Button(
            onClick = {
                navigateToMovieDetail(context)
            },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(text = "Película 1")
        }
        Button(
            onClick = {
                navigateToMovieDetail(context)
            },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(text = "Película 2")
        }
        Button(
            onClick = {
                navigateToMovieDetail(context)
            },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(text = "Película 3")
        }
        Button(
            onClick = {
                navigateToMovieDetail(context)
            },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(text = "Película 4")
        }
    }
}

private fun navigateToMovieDetail(context: Context) {
    val intent = Intent(context, MovieDetailActivity::class.java)
    context.startActivity(intent)
}

@Composable
@Preview
fun MyMoviesAppPreview() {
    MyMoviesApp()
}