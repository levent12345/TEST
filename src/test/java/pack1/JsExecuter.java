package pack1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class JsExecuter extends Hook{

//    @Test
//    void jsEx() throws InterruptedException {
//        driver.get("https://www.countries-ofthe-world.com/all-countries.html");
//
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        Thread.sleep(3000);
//        js.executeScript("window.scrollBy(0,1000)","");
//
//    }

//    @Test
//    void jsEx2() throws InterruptedException, IOException {
//        driver.get("https://www.countries-ofthe-world.com/all-countries.html");
//         Thread.sleep(2000);
//        TakesScreenshot sch=(TakesScreenshot)driver;
//        File srcFile=sch.getScreenshotAs(OutputType.FILE);
//        File desFile=new File("TestNG-Framework/test-output");
//        FileUtils.copyFile(srcFile,desFile);
//
//
//
//
//    }

    @Test
    void jsEx3() throws InterruptedException, IOException {
        driver.get("http://demo.guru99.com/test/newtours/");


        List<WebElement> lt=driver.findElements(By.tagName("a"));
        System.out.println(lt.size());

        for(WebElement a:lt){
            String url=a.getAttribute("href");

            URL link=new URL(url);
            HttpURLConnection httpCoc=(HttpURLConnection)link.openConnection();
            httpCoc.connect();

            int rCode=httpCoc.getResponseCode();
            if(rCode==200){
                System.out.println(link+"  Lin is Valid  "+rCode);}
            else{
                System.out.println(link+"   ******* Lin is Broken *********  "+rCode);










        }







    }

}}
