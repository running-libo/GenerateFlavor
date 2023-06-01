package automatic

import org.gradle.api.DefaultTask
import javax.inject.Inject

/**
 * @author: libo
 * @date: 2023/5/31 12:29
 * @Description: 自定义task
 */
abstract class CustomTask @Inject constructor(private val message: String,
                                      private val number: Int) : DefaultTask()