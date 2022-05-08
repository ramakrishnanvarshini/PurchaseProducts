package pages.lamda;

import base.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends TestContext {

    By start = By.linkText("Start Free Testing");
    By fullName = By.id("name");
    By businessEmail = By.id("email");
    By password = By.id("userpassword");
    By phone = By.id("phone");
    By comName = By.id("org_name");
    By designation = By.id("designation");
    By agree = By.className("customcheckbox");


    public void startFreeTesting() {
        driver.findElement(start).click();
    }
    public void fullName(){
        driver.findElement(fullName).sendKeys(properties.getProperty("fullName"));
    }
    public void businessEmail(){
        driver.findElement(businessEmail).sendKeys(properties.getProperty("businessEmail"));
    }
    public void desiredPassword(){
        driver.findElement(password).sendKeys(properties.getProperty("password"));
    }
    public void phone(){
        driver.findElement(phone).sendKeys(properties.getProperty("phone"));
    }
    public void companyName(){
        driver.findElement(comName).sendKeys(properties.getProperty("companyName"));
    }
    public void designation(){
        WebElement we = driver.findElement(designation);
        new Select(we).selectByVisibleText(properties.getProperty("designation"));
    }
    public void agree(){
        driver.findElement(agree).click();
    }
}