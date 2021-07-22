package application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHelper extends HelperBase {
    public AlertHelper(WebDriver wd) {
        super(wd);
    }

    public void clickOnAlertCardMenu() {
        click(By.xpath("//*[@class='card mt-4 top-card'][3]"));
    }

    public void clickOnAlertPanelMenu() {
        click(By.cssSelector(".element-group:nth-child(3)"));
    }

    public void clickOnAlerts() {
        click(By.cssSelector(".element-group:nth-child(3) ul li:nth-child(2)"));
    }

    public void clickOnClickMe1() {
        click(By.xpath("//button[@id='alertButton']"));
    }

    public void acceptAlert() {
        wd.switchTo().alert().accept();
    }

    public void dismissAlert() {
        wd.switchTo().alert().dismiss();
    }

    public void clickOnClickMe2() {
        click(By.xpath("//button[@id='timerAlertButton']"));
    }

    public void waitAlert() {
       new WebDriverWait(wd, 5).until(ExpectedConditions.alertIsPresent());
    }

    public boolean isAlertsPage() {
        return wd.findElements(By.xpath("//*[@class='main-header']")).size() > 0;
    }

    public void goToTheHomePage() {
        wd.navigate().to("https://demoqa.com/");
    }

    public void clickOnClickMe3() {
        click(By.xpath("//button[@id='confirmButton']"));
    }


    public void clickOnClickMe4() {
        click(By.xpath("//button[@id='promtButton']"));
    }

    public void fillInputFormInAlert() {
        wd.switchTo().alert().sendKeys("Hello");
    }

    public boolean alertClosed() {
        return wd.findElements(By.xpath("//img[@src='/images/Toolsqa.jpg']")).size() > 0;
    }

}
