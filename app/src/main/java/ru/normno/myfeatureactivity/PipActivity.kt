package ru.normno.myfeatureactivity

import android.app.PictureInPictureParams
import android.graphics.Rect
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ru.normno.myfeatureactivity.ui.theme.MyFeatureActivityTheme

class PipActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFeatureActivityTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { padding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(padding),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Text(
                            text = "Pip Activity",
                        )
                        Button(
                            onClick = {
                                this@PipActivity.enterPictureInPictureMode(
                                    PictureInPictureParams.Builder()
                                        .setSourceRectHint(Rect())
                                        .build()
                                )
                            }
                        ) {
                            Text(
                                text = "Enter Pip mode"
                            )
                        }
                    }
                }
            }
        }

    }
}