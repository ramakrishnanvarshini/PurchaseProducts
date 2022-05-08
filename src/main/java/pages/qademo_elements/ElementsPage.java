package pages.qademo_elements;

import base.TestContext;
import org.openqa.selenium.By;

public class ElementsPage extends TestContext {

//    By fieldButtons = By.xpath("//h5[contains(text(),'Element')]")
    public By adPopUp=By.id("google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0");

    public void setFieldButtons(String fieldName) {
//        driver.findElement(By.xpath("//h5[contains(text(),'" + fieldName + "')]/../../div[@class='card-up']")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]")).click();
    }

}
