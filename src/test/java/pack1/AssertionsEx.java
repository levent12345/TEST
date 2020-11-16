package pack1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionsEx extends Hook{

    @BeforeMethod
    void browser(){
    driver.get("https://opensource-demo.orangehrmlive.com/");
}

    @Test
    void logoTest(){


        WebElement logo=driver.findElement(By.xpath("//*[@id='divLogo']/img"));
        Assert.assertTrue(logo.isDisplayed());
    }
    @Test
    void homePageTitle(){

        String title=driver.getTitle();
        Assert.assertEquals("OrangeHRM",title);
    }
}
