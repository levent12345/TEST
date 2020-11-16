package pack1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParalelTestEx {
    WebDriver driver;

    @BeforeClass
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test(priority = 1)
    void logoTest() throws InterruptedException {
        WebElement logo=driver.findElement(By.xpath("//*[@id='divLogo']/img"));
        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(5000);

    }

    @Test(priority = 2)
    void homePageTitle() throws InterruptedException {

        String title=driver.getTitle();
        Assert.assertEquals("OrangeHRM",title);
        Thread.sleep(5000);

    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
