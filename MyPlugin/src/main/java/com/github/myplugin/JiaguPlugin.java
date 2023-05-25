package com.github.myplugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * 开发自己的插件
 */
public class JiaguPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        System.out.println("My gradle plugin");
    }
}