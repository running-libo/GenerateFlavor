package automatic;

import org.gradle.api.DefaultTask;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 * @author: libo
 * @date: 2023/5/31 11:46
 * @Description:
 */
public abstract class BuildInfo extends DefaultTask {

   @Input
   public abstract Property<String> getVersion();
   @OutputFile
   public abstract RegularFileProperty getOutputFile();

   @TaskAction
   public void create() {
      Properties prop = new Properties();
      prop.setProperty("version", getVersion().get());
      try {
         OutputStream outputStream = new FileOutputStream(getOutputFile().getAsFile().get());
         prop.store(outputStream, null);
      } catch (FileNotFoundException e) {
          throw new RuntimeException(e);
      } catch (IOException e) {
       throw new RuntimeException(e);
      }
   }
}
