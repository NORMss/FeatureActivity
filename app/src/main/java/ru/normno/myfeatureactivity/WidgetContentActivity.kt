package ru.normno.myfeatureactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ru.normno.myfeatureactivity.ui.theme.MyFeatureActivityTheme

class WidgetContentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var text by remember { mutableStateOf("") }

            MyFeatureActivityTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    TextField(
                        value = text,
                        onValueChange = {
                            text = it
                        },
                        label = {
                            Text(
                                text = "Widget content"
                            )
                        }
                    )
                    Button(
                        onClick = {

                        }
                    ) {
                        Text(
                            text = "Set content"
                        )
                    }
                }
            }
        }
    }
}