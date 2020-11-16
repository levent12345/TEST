package pack1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data {

 @DataProvider(name="data")
    Object[][] getData(){
     Object[][] datas={{1,2},{3,4}};
     return datas;

 }
 @Test(dataProvider = "data")
void login(int x,int y){

    System.out.println(x+"  "+y);
}


}
