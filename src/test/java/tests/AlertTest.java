package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        if(!app.alertHelper().isAlertsPage()) {
            app.alertHelper().goToTheHomePage();
            app.alertHelper().clickOnAlertCardMenu();
            app.alertHelper().clickOnAlertPanelMenu();
            app.alertHelper().clickOnAlerts();
        }
    }

    @Test
    public void toSeeAlert() {
        app.alertHelper().clickOnClickMe1();
        app.alertHelper().acceptAlert();
        app.alertHelper().pause(15);
        Assert.assertTrue(app.alertHelper().alertClosed());
    }

    @Test
    public void alertAfter5seconds() {
        app.alertHelper().clickOnClickMe2();
        app.alertHelper().waitAlert();
        app.alertHelper().acceptAlert();
        Assert.assertTrue(app.alertHelper().alertClosed());
    }

    @Test
    public void alertWithConfirmBoxOK() {
        app.alertHelper().clickOnClickMe3();
        app.alertHelper().acceptAlert();
        Assert.assertTrue(app.alertHelper().alertClosed());
    }

    @Test
    public void alertWithConfirmBoxCancel() {
        app.alertHelper().clickOnClickMe3();
        app.alertHelper().dismissAlert();
        Assert.assertTrue(app.alertHelper().alertClosed());
    }

    @Test
    public void alertWithPromptBoxOK() {
        app.alertHelper().clickOnClickMe4();
        app.alertHelper().acceptAlert();
        Assert.assertTrue(app.alertHelper().alertClosed());
    }

    @Test
    public void alertWithPromptBoxCancel() {
        app.alertHelper().clickOnClickMe4();
        app.alertHelper().dismissAlert();
        Assert.assertTrue(app.alertHelper().alertClosed());
    }

    @Test
    public void alertWithPromptBoxInputOK() {
        app.alertHelper().clickOnClickMe4();
        app.alertHelper().fillInputFormInAlert();
        app.alertHelper().acceptAlert();
        Assert.assertTrue(app.alertHelper().alertClosed());
    }

    @Test
    public void alertWithPromptBoxInputCancel() {
        app.alertHelper().clickOnClickMe4();
        app.alertHelper().fillInputFormInAlert();
        app.alertHelper().dismissAlert();
        Assert.assertTrue(app.alertHelper().alertClosed());
    }

}
