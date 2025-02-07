package ru.normno.myfeatureactivity

import android.content.Context
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.GlanceTheme
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.components.Scaffold
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.fillMaxSize
import androidx.glance.text.Text

class AppWidget : GlanceAppWidget() {
    override suspend fun provideGlance(
        context: Context,
        id: GlanceId
    ) {
        provideContent {
            Scaffold(
                modifier = GlanceModifier
                    .fillMaxSize(),
                backgroundColor = GlanceTheme.colors.background,
            ) {
                Text(
                    text = "Hello, Android!",
                )
            }
        }
    }
}