import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot {

    public void screenshot(WebDriver driver){
        String path;
        WebDriver webDriver = new Augmenter().augment(driver);
        File source = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        path = "./target/screenshots/" + source.getName();
        try {
            FileUtils.copyFile(source, new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
