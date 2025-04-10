package com.stewemetal.cmppreviews

import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import androidx.compose.ui.window.singleWindowApplication
import org.jetbrains.compose.reload.DevelopmentEntryPoint

fun main() = singleWindowApplication(
    title = "MultiplatformPreviews",
    state = WindowState(width = 800.dp, height = 800.dp),
    alwaysOnTop = true
) {
    DevelopmentEntryPoint {
        App()
    }
}