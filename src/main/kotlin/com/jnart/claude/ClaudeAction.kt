package com.jnart.claude

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAwareAction
import com.intellij.openapi.project.Project
import org.jetbrains.plugins.terminal.TerminalToolWindowManager

/**
 * Action triggered by the icon in the IntelliJ main header toolbar or keyboard shortcut.
 * Opens a new terminal tab and executes the 'claude' command.
 * Supports Dynamic Plugin loading without IDE restart.
 */
class ClaudeAction : DumbAwareAction() {

    override fun actionPerformed(e: AnActionEvent) {
        val project: Project = e.project ?: return

        try {
            val terminalManager = TerminalToolWindowManager.getInstance(project)
            val workingDir = project.basePath

            // Create and show a new terminal widget tab named "Claude Code"
            val widget = terminalManager.createShellWidget(workingDir, "Claude Code", true, true)

            // Send the 'claude' command for execution in the terminal
            widget.sendCommandToExecute("claude")
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    override fun update(e: AnActionEvent) {
        val hasProject = e.project != null
        e.presentation.isVisible = true
        e.presentation.isEnabled = hasProject
    }
}
