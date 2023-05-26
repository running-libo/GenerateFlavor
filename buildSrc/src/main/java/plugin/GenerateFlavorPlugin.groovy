package plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * 读取配置文件自动配置各个变体
 */
class GenerateFlavorPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        //1.读取项目跟目录下json配置文件
        def configFile= project.rootProject.file("automatic_generated_flavor.json")
        println("fileName" + configFile.mkdirs())
        //2.将配置json文件转化为所需的Bean类

        //3.遍历在app下build.gradle的android{}下配置各个对应的变体


    }
}