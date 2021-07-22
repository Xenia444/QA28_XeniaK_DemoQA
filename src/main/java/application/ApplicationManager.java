package application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    AlertHelper alertHelper;

    public void init() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://demoqa.com/");
        alertHelper = new AlertHelper(wd);
    }

    public AlertHelper alertHelper() {
        return alertHelper;
    }

    public void stop() {
        wd.quit();
    }
}
