package com.stewemetal.cmppreviews.uicomponents

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.stewemetal.cmppreviews.uicomponents.theme.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

// https://www.kotlinguide.com/google-material-vector-icons-in-kmp/
@Composable
fun AppIconButton(
    onClick: () -> Unit,
    icon: ImageVector,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    contentDescription: String? = null,
    tint: Color = MaterialTheme.colorScheme.onSurface
) {
    IconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = IconButtonDefaults.iconButtonColors(
            contentColor = tint,
            disabledContentColor = tint.copy(alpha = 0.5f)
        )
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            tint = tint
        )
    }
}

@Preview
@Composable
private fun PreviewAppIconButton() {
    AppTheme {
        AppIconButton(
            onClick = {},
            icon = Icons.Default.Add,
            contentDescription = "Add"
        )
    }
}

@Preview
@Composable
private fun PreviewAppIconButtonDisabled() {
    AppTheme {
        AppIconButton(
            onClick = {},
            icon = Icons.Default.Add,
            enabled = false,
            contentDescription = "Add (Disabled)"
        )
    }
}

@Preview
@Composable
private fun PreviewAppIconButtonCustomColor() {
    AppTheme {
        AppIconButton(
            onClick = {},
            icon = Icons.Default.Add,
            tint = MaterialTheme.colorScheme.primary,
            contentDescription = "Add (Custom Color)"
        )
    }
}