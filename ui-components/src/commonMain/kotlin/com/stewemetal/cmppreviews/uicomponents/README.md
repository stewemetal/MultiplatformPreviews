# UI Components Library

This library provides reusable Compose Multiplatform UI components based on Material 3 components. The components are designed to be used across different platforms (Android, iOS, Desktop) with a consistent look and feel.

## Currently Implemented Components

1. **AppTheme** - A theme wrapper based on Material 3 with light and dark color schemes.
2. **AppButton** - A wrapper around Material 3's Button component with custom styling.
3. **AppText** - A wrapper around Material 3's Text component with custom styling.
4. **AppIconButton** - A wrapper around Material 3's IconButton component with custom styling.
5. **AppSurface** - A wrapper around Material 3's Surface component with custom styling.
6. **WelcomeMessage** - A component that displays a welcome message using string resources.

## Suggested Components for Future Implementation

Here are some additional components that could be implemented in the future:

1. **AppTextField** - A wrapper around Material 3's TextField component for text input.
2. **AppCard** - A wrapper around Material 3's Card component for displaying content in cards.
3. **AppCheckbox** - A wrapper around Material 3's Checkbox component for boolean input.
4. **AppRadioButton** - A wrapper around Material 3's RadioButton component for single selection from a group.
5. **AppSwitch** - A wrapper around Material 3's Switch component for toggling settings.
6. **AppDropdownMenu** - A wrapper around Material 3's DropdownMenu component for displaying menus.
7. **AppAlertDialog** - A wrapper around Material 3's AlertDialog component for displaying dialogs.
8. **AppProgressIndicator** - A wrapper around Material 3's LinearProgressIndicator and CircularProgressIndicator components.
9. **AppDivider** - A wrapper around Material 3's Divider component for separating content.
10. **AppChip** - A wrapper around Material 3's Chip components for displaying compact elements.
11. **AppBottomNavigation** - A wrapper around Material 3's NavigationBar component for bottom navigation.
12. **AppTopAppBar** - A wrapper around Material 3's TopAppBar component for top app bars.
13. **AppFab** - A wrapper around Material 3's FloatingActionButton component.
14. **AppBadge** - A wrapper around Material 3's Badge component for displaying badges.
15. **AppSnackbar** - A wrapper around Material 3's Snackbar component for displaying temporary messages.

## String Resources

The library includes shared string resources that can be used across different platforms. The string resources are defined in XML files and can be accessed using the `StringResources` utility class.

### Available String Resources

- `app_name` - The application name.
- `welcome_message` - A welcome message.

### How to Use String Resources

String resources can be accessed using the `StringResources` utility class:

```kotlin
@Composable
fun MyComponent() {
    // Get the string value
    val welcomeMessage = StringResources.getString(Res.string.welcome_message)

    // Use the string value
    Text(text = welcomeMessage)
}
```

### How to Add New String Resources

To add a new string resource, add it to the `strings.xml` file in the `ui-components/src/commonMain/composeResources/strings` directory:

```xml
<string name="my_string">My string value</string>
```

## Usage

All components follow a consistent API design pattern and are designed to be used with the AppTheme component. Here's an example of how to use these components:

```kotlin
AppTheme {
    AppSurface {
        AppButton(
            onClick = { /* Handle click */ },
            content = {
                AppText("Click me")
            }
        )

        // Use the WelcomeMessage component
        WelcomeMessage()
    }
}
```

Each component has preview functions that demonstrate its usage and appearance in different configurations.
