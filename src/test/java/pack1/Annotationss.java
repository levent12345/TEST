package pack1;

import org.testng.annotations.*;

public class Annotationss {



    @Test(priority = 1,enabled = false)
    void set(){
        System.out.println("Test 1 Set Method");
    }

    @Test(priority = 2,enabled = false)
    void down(){
        System.out.println("Test 2 Down Method");
    }

   @BeforeMethod
   void beforeMethod(){
       System.out.println("Before Method....");
   }
   @AfterMethod
   void afterMethod(){
       System.out.println("After Method....");
   }
   @BeforeClass
   void beforeClass(){
       System.out.println("Before Class....");
   }
   @AfterClass
   void afterClass(){
       System.out.println("After Class....");
   }
//   @BeforeTest
//   void beforeTest(){
//       System.out.println("Before Test....");
//   }
//   @AfterTest
//   void afterTest(){
//       System.out.println("After Test....");
//   }
//   @BeforeSuite
//   void beforeSuite(){
//       System.out.println("Before suite ....");
//   }
//   @AfterSuite
//   void afterSuite(){
//       System.out.println("After suite ....");
//   }




}
