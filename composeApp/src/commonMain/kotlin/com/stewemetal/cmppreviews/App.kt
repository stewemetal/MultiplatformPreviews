package com.stewemetal.cmppreviews

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.stewemetal.cmppreviews.uicomponents.DemoProgressIndicator
import com.stewemetal.cmppreviews.uicomponents.SomeWidget
import multiplatformpreviews.composeapp.generated.resources.Res
import multiplatformpreviews.composeapp.generated.resources.button_text
import multiplatformpreviews.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun App(windowSizeClass: WindowSizeClass) {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            SomeWidget()
            DemoProgressIndicator()
            Text(
                "Width = ${windowSizeClass.widthSizeClass}, height = ${windowSizeClass.heightSizeClass}"
            )
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(
                    Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }

            Text(stringResource(Res.string.button_text))
        }
    }
}


@Preview
@Composable
private fun PreviewCommonTest() {
    Button(
        onClick = {},
        content = {
            Text("Click me")
        }
    )
}