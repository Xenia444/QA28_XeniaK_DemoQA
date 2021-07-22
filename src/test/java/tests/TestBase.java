package tests;

import application.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void openChrome() {
        app.init();
    }

    @AfterClass
    public void closeChrome() {
        app.stop();
    }
}
