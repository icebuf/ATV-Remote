package com.github.icebuf.atvremote.services

import com.intellij.openapi.project.Project
import com.github.icebuf.atvremote.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
