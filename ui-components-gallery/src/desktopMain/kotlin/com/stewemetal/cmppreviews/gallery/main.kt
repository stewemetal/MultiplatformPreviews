package com.stewemetal.cmppreviews.gallery

import androidx.compose.foundation.layout.Column
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import com.stewemetal.cmppreviews.uicomponents.DemoProgressIndicator
import com.stewemetal.cmppreviews.uicomponents.SomeWidget

fun main() = singleWindowApplication(
    title = "MultiplatformPreviews Gallery",
    state = WindowState(width = 800.dp, height = 800.dp),
    alwaysOnTop = true
) {
    Column {
        DemoProgressIndicator()
        SomeWidget()
    }
}