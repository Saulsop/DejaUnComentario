package com.example.dejauncomentario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dejauncomentario.ui.theme.DejaUnComentarioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DejaUnComentarioTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var Nombre by remember { mutableStateOf("") }
    var Gmail by remember { mutableStateOf("") }
    var comentarios by remember { mutableStateOf("") }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Nombre")
        OutlinedTextField(
            value = Nombre, // Usa la variable de estado
            onValueChange = { Nombre = it }, // Actualiza la variable de estado
            modifier = Modifier.fillMaxWidth()
        )

        Text(text = "Gmail")
        OutlinedTextField(
            value = Gmail, // Usa la variable de estado
            onValueChange = { Gmail = it }, // Actualiza la variable de estado
            modifier = Modifier.fillMaxWidth()
        )

        Text(text = "comentarios")
        OutlinedTextField(
            value = comentarios, // Usa la variable de estado
            onValueChange = { comentarios = it }, // Actualiza la variable de estado
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            maxLines = 4
        )

        Button(onClick = {/*TODO*/ } ) {
            Text(text = "Enviar")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DejaUnComentarioTheme {
        Greeting("Android")
    }
}