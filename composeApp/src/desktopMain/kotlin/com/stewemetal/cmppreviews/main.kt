package com.stewemetal.cmppreviews

import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
fun main() = singleWindowApplication(
    title = "MultiplatformPreviews",
    state = WindowState(width = 800.dp, height = 800.dp),
    alwaysOnTop = true
) {
    App(
        windowSizeClass = calculateWindowSizeClass()
    )
}