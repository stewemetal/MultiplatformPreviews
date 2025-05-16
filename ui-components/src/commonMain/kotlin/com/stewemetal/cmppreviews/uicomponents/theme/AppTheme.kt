package com.stewemetal.cmppreviews.uicomponents.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.ui.tooling.preview.Preview

// Define custom colors
private val PrimaryLight = Color(0xFF6200EE)
private val PrimaryVariantLight = Color(0xFF3700B3)
private val SecondaryLight = Color(0xFF03DAC6)
private val BackgroundLight = Color(0xFFF5F5F5)
private val SurfaceLight = Color(0xFFFFFFFF)
private val OnPrimaryLight = Color(0xFFFFFFFF)
private val OnSecondaryLight = Color(0xFF000000)
private val OnBackgroundLight = Color(0xFF000000)
private val OnSurfaceLight = Color(0xFF000000)

private val PrimaryDark = Color(0xFFBB86FC)
private val PrimaryVariantDark = Color(0xFF3700B3)
private val SecondaryDark = Color(0xFF03DAC6)
private val BackgroundDark = Color(0xFF121212)
private val SurfaceDark = Color(0xFF1E1E1E)
private val OnPrimaryDark = Color(0xFF000000)
private val OnSecondaryDark = Color(0xFF000000)
private val OnBackgroundDark = Color(0xFFFFFFFF)
private val OnSurfaceDark = Color(0xFFFFFFFF)

// Define color schemes
private val LightColorScheme = lightColorScheme(
    primary = PrimaryLight,
    onPrimary = OnPrimaryLight,
    secondary = SecondaryLight,
    onSecondary = OnSecondaryLight,
    background = BackgroundLight,
    onBackground = OnBackgroundLight,
    surface = SurfaceLight,
    onSurface = OnSurfaceLight
)

private val DarkColorScheme = darkColorScheme(
    primary = PrimaryDark,
    onPrimary = OnPrimaryDark,
    secondary = SecondaryDark,
    onSecondary = OnSecondaryDark,
    background = BackgroundDark,
    onBackground = OnBackgroundDark,
    surface = SurfaceDark,
    onSurface = OnSurfaceDark
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}

@Preview
@Composable
private fun PreviewAppThemeLight() {
    AppTheme(darkTheme = false) {
        // Preview content will be added here
    }
}

@Preview
@Composable
private fun PreviewAppThemeDark() {
    AppTheme(darkTheme = true) {
        // Preview content will be added here
    }
}