package pack1;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListenersEx.class)
public class ListenersEx {


    @Test
    void test1(){
        System.out.println("This is test1");
        Assert.assertEquals(1,1);
    }
    @Test
    void test2(){
        System.out.println("This is test2");
        Assert.assertEquals(1,2);
    }

    @Test
    void test3(){
        System.out.println("This is test3");
        throw new SkipException("This is skip Exeptions");
    }

}
