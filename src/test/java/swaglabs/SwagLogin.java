package swaglabs;

import base.TestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.saucedemo.SwagLoginPage;

public class SwagLogin extends TestContext {
    SwagLoginPage swagLoginPage = new SwagLoginPage();

    @BeforeTest
    public void openUrl() {
        getUrl("sauceDemoUrl");
    }

    @Test
    public void swagLoginPage() {
        swagLoginPage.userName();
        swagLoginPage.password();
        swagLoginPage.submit();
    }
}
