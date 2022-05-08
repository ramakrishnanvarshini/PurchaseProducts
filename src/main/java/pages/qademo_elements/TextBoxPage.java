package pages.qademo_elements;

import base.TestContext;
import org.openqa.selenium.By;

import java.util.Properties;

public class TextBoxPage extends TestContext {
    By textBox = By.xpath("//span[contains(text(),'Text Box')]");
    By userName = By.id("userName");
    By userEmail = By.id("userEmail");
    By currentAddress = By.id("currentAddress");
    By permanentAddress = By.id("permanentAddress");
    By submit = By.id("submit");

    public void clickTextBox() {
        driver.findElement(textBox).click();
    }

    public void setUserName() {
        driver.findElement(userName).sendKeys(properties.getProperty("txtBoxUserName"));
    }

    public void setUserEmail() {
        driver.findElement(userEmail).sendKeys(properties.getProperty("txtBoxUserEmail"));
    }

    public void setCurrentAddress() {
        driver.findElement(currentAddress).sendKeys(properties.getProperty("txtBoxCurrentAddress"));
    }

    public void setPermanentAddress() {
        driver.findElement(permanentAddress).sendKeys(properties.getProperty("txtBoxPermanentAddress"));
    }

    public void setSubmit() {
        driver.findElement(submit).click();
    }
}
