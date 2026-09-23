# Claude Code Terminal Launcher - IntelliJ Plugin

An extension for IntelliJ IDEA and JetBrains IDEs that adds an icon to the main header toolbar (top-right corner) and a custom keyboard shortcut to open the integrated terminal and execute `claude`.

> **Disclaimer:** This is an independent, community-driven plugin created by **João Alves (j-nart)** and is not affiliated with, endorsed by, or associated with Anthropic or Claude.

---

## ⚡ Dynamic Plugin (No Restart Required!)
This plugin supports **Dynamic Plugin Loading**. It activates immediately upon installation without requiring an IDE restart.

---

## 🌐 Developer & Repository

- **Vendor / Author:** João Alves (j-nart)
- **GitHub Repository:** [https://github.com/joaonart/intellij-claude-plugin](https://github.com/joaonart/intellij-claude-plugin)
- **Contact:** joao.alves64@gmail.com

---

## 🚀 Features

- **Main Toolbar Icon (New UI & Classic)**: Located in the `MainToolbarRight` group (top-right corner of the IDE header).
- **Dedicated Keyboard Shortcut**: `Cmd` + `Option` + `K` (macOS) / `Ctrl` + `Alt` + `K` (Windows/Linux).
- **Dedicated Terminal Tab**: Automatically opens a tab titled **"Claude Code"** pointing to the root directory of the active project.
- **Automatic Execution**: Sends the `claude` command for immediate launch in the terminal.
- **Theme Aware Branding**: Features custom icons with light and dark IDE theme auto-switching.

---

## 💻 Project Structure

```text
intellij-claude-plugin/
├── LICENSE                   # Apache License 2.0
├── build.gradle.kts          # Gradle build configuration (IntelliJ Platform Plugin v2)
├── settings.gradle.kts       # Gradle project settings
├── gradle.properties         # Platform versions and metadata
└── src/
    └── main/
        ├── kotlin/
        │   └── com/jnart/claude/
        │       └── ClaudeAction.kt       # Action handler for toolbar button & keyboard shortcut
        └── resources/
            ├── META-INF/
            │   ├── plugin.xml           # Extension manifest with Vendor and Change Notes
            │   ├── pluginIcon.svg       # Plugin List Icon (Light Theme)
            │   └── pluginIcon_dark.svg  # Plugin List Icon (Dark Theme)
            └── icons/
                ├── claudeIcon.svg       # Header toolbar SVG icon (Light Theme)
                └── claudeIcon_dark.svg  # Header toolbar SVG icon (Dark Theme)
```

---

## 🛠️ How to Build and Install

### 1. Prerequisites
- Java Development Kit (JDK) 17 or higher.
- `claude` CLI installed on your system and available in `$PATH`.

### 2. Build the Plugin ZIP
In your terminal, navigate to the project directory and run:
```bash
./gradlew buildPlugin
```

The compiled plugin ZIP package will be generated at:
`build/distributions/intellij-claude-plugin-1.0.0.zip`

### 3. Install in IntelliJ IDEA
1. Open IntelliJ IDEA.
2. Go to **Settings** (or **Preferences** on macOS) -> **Plugins**.
3. Click the gear icon ⚙️ in the top-right corner of the Plugins window.
4. Select **Install Plugin from Disk...**.
5. Choose the generated `.zip` file (`intellij-claude-plugin-1.0.0.zip`).
6. The plugin will be enabled **instantly** (no IDE restart required)!

---

## 📄 License

This project is licensed under the **Apache License 2.0** - see the [LICENSE](LICENSE) file for details.
