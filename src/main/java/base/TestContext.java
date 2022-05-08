package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.sql.SQLOutput;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestContext {

    public static WebDriver driver;
    protected Properties properties;
    private final String propertyFilePath= "configuration.properties";

    public TestContext() {
        try (FileInputStream fis = new FileInputStream(propertyFilePath)) {
        properties =new Properties();
        properties.load(fis);
        }catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }
    }
    protected void getUrl(String url){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(properties.getProperty(url));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(properties.getProperty("implicitSeconds"))));
    }

    public void close(){
        driver.quit();
    }
}
