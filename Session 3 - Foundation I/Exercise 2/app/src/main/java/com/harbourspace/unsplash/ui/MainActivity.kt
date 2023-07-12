package com.harbourspace.unsplash.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.harbourspace.unsplash.R
import com.harbourspace.unsplash.ui.exercises.Exercise31Activity
import com.harbourspace.unsplash.ui.exercises.Exercise32Activity
import com.harbourspace.unsplash.ui.theme.UnsplashTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnsplashTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Column(
                        modifier = Modifier.padding(16.dp)
                    ){
                        Greeting("Android")

                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Spacer(modifier = Modifier.height(16.dp))

                            Button(
                                modifier = Modifier.fillMaxWidth(),
                                onClick = {
                                    val intent = Intent(applicationContext, Exercise31Activity::class.java)
                                    startActivity(intent)
                                }
                            ) {
                                Text(stringResource(id = R.string.main_exercise_31))
                            }

                            Spacer(modifier = Modifier.height(16.dp))

                            Button(
                                modifier = Modifier.fillMaxWidth(),
                                onClick = {
                                    val intent = Intent(applicationContext, Exercise32Activity::class.java)
                                    startActivity(intent)
                                }
                            ) {
                                Text(stringResource(id = R.string.main_exercise_32))
                            }

                            Spacer(modifier = Modifier.height(16.dp))

                            Button(
                                modifier = Modifier.fillMaxWidth(),
                                onClick = {
                                    val intent = Intent(applicationContext, DetailsActivity::class.java)
                                    startActivity(intent)
                                }
                            ) {
                                Text(stringResource(id = R.string.main_details))
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UnsplashTheme {
        Greeting("Android")
    }
}