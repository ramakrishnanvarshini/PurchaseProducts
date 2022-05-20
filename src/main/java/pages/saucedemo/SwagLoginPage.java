package pages.saucedemo;

import base.TestContext;
import org.openqa.selenium.By;

public class SwagLoginPage extends TestContext {

    By userName = By.id("user-name");
    By password = By.id("password");
    By submit = By.id("login-button");
    By actualErrorMessage = By.xpath("//*[@id='login_button_container']/div/form/div[3]/h3");
    By totalItems=By.xpath("//*[@class='inventory_list']/div");


    public void userName(String userNameValue) {
        driver.findElement(userName).sendKeys(userNameValue);
    }

    public void password(String passwordValue) {
        driver.findElement(password).sendKeys(passwordValue);
    }

    public void submit() {
        driver.findElement(submit).click();
    }

    public String actualErrorMessage(){
        return driver.findElement(actualErrorMessage).getText();
    }

    public void totalItems(){
        driver.findElements(totalItems).size();
    }


}
