package com.stewemetal.cmppreviews.uicomponents

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun SomeWidget() {
    val transition = rememberInfiniteTransition()
    val scale by transition.animateFloat(
        0.95f, 1.04f, infiniteRepeatable(tween(500), RepeatMode.Reverse)
    )

    Text("👋 Hello from 'ui-components'!", fontSize = 24.0.sp, modifier = Modifier.scale(scale))
}

@Preview
@Composable
private fun PreviewSomwWidget() {
    SomeWidget()
}