package pack1;

import org.testng.annotations.*;

public class Annotationss2 {



    @Test(priority = 1)
    void set2(){
        System.out.println("Test 1 Set2 Method");
    }

    @Test(priority = 2)
    void down2(){
        System.out.println("Test 2 Down2 Method");
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
