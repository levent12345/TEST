package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropDownEX extends Hook {


    @Test
    void dropDown(){

    driver.get("http://testautomationpractice.blogspot.com/");

    WebElement frame=driver.findElement(By.id("frame-one1434677811"));

driver.switchTo().frame("frame-one1434677811");
        WebElement animal=driver.findElement(By.name("RESULT_TextField-1"));
        animal.sendKeys("Ali");
//        animal.clear();
//        driver.switchTo().defaultContent();
//        WebElement animal1=driver.findElement(By.name("RESULT_TextField-1"));
//        animal1.sendKeys("Ali");





    }
}
