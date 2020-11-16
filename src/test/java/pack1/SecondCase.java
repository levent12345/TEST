package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondCase {


    @Test(priority = 1)
    void setup(){
        System.out.println("Opening browser");
    }

    @Test(priority = 3)
    void searchCustomer(){
        System.out.println("Search customer Test");
    }

    @Test(priority = 2)
    void addCustomer(){
        System.out.println("Add customer Test");
        Assert.assertEquals(1,1);
    }

     @Test(priority = 4)
    void tearDown(){
    System.out.println("Closing browser");
}
}
