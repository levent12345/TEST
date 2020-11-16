package pack1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {


    @DataProvider(name="LoginData")
    public Object[][] getData(){
      Object data[][]={{"abc@gmail.com","abc"},{"xyz@gmail.com","xyz"},{"mno@gmail.com","mn0"}};
      return data;
    }


    @Test(dataProvider = "LoginData")
    void loginTest(String email,String username){

        System.out.println(email+"  "+username);
    }


}
