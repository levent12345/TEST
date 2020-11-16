package pack1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx2 {

@DataProvider(name = "LoginData")
    Object[][] getData(){
    Object data[][]={{"Ali",12},{"Veli",18},{"Tom",26}};
    return data;
}


@Test(dataProvider = "LoginData")
    void loginTest(String name,int age){
    System.out.println("Name :"+name);
    System.out.println("Age :"+age);
    System.out.println("------------");
}

}
