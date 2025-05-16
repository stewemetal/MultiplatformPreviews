package com.stewemetal.cmppreviews.uicomponents

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.stewemetal.cmppreviews.uicomponents.theme.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun AppSurface(
    modifier: Modifier = Modifier,
    shape: Shape = MaterialTheme.shapes.medium,
    color: Color = MaterialTheme.colorScheme.surface,
    contentColor: Color = MaterialTheme.colorScheme.onSurface,
    tonalElevation: Dp = 0.dp,
    shadowElevation: Dp = 0.dp,
    border: BorderStroke? = null,
    content: @Composable () -> Unit
) {
    Surface(
        modifier = modifier,
        shape = shape,
        color = color,
        contentColor = contentColor,
        tonalElevation = tonalElevation,
        shadowElevation = shadowElevation,
        border = border,
        content = content
    )
}

@Preview
@Composable
private fun PreviewAppSurface() {
    AppTheme {
        AppSurface {
            Box(modifier = Modifier.padding(16.dp)) {
                AppText("This is a surface")
            }
        }
    }
}

@Preview
@Composable
private fun PreviewAppSurfaceWithElevation() {
    AppTheme {
        AppSurface(
            tonalElevation = 4.dp,
            shadowElevation = 4.dp
        ) {
            Box(modifier = Modifier.padding(16.dp)) {
                AppText("This is an elevated surface")
            }
        }
    }
}

@Preview
@Composable
private fun PreviewAppSurfaceWithCustomColor() {
    AppTheme {
        AppSurface(
            color = MaterialTheme.colorScheme.primaryContainer,
            contentColor = MaterialTheme.colorScheme.onPrimaryContainer
        ) {
            Box(modifier = Modifier.padding(16.dp)) {
                AppText("This is a colored surface")
            }
        }
    }
}