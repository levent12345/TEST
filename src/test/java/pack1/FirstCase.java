package pack1;

import org.testng.annotations.Test;

public class FirstCase {


    @Test(priority = 1)
    void setup(){
        System.out.println("Opening browser");
    }

    @Test(priority = 2)
    void login(){
        System.out.println("Login Test");
    }
@Test(priority = 3)
    void tearDown(){
    System.out.println("Closing browser");
}
}
