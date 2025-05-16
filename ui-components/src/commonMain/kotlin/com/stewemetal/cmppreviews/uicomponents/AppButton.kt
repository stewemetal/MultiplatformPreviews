package com.stewemetal.cmppreviews.uicomponents

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.stewemetal.cmppreviews.uicomponents.theme.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun AppButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary,
            disabledContainerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f),
            disabledContentColor = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.5f)
        ),
        content = content
    )
}

@Preview
@Composable
private fun PreviewAppButton() {
    AppTheme {
        AppButton(
            onClick = {},
            content = {
                Text("Click me")
            }
        )
    }
}

@Preview
@Composable
private fun PreviewAppButtonDisabled() {
    AppTheme {
        AppButton(
            onClick = {},
            enabled = false,
            content = {
                Text("Disabled")
            }
        )
    }
}
