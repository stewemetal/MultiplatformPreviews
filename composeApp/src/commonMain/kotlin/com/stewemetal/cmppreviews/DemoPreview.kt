package com.stewemetal.cmppreviews

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
private fun PreviewCommonButton() {
    Button(
        onClick = {},
        content = {
            Text("Click me")
        }
    )
}