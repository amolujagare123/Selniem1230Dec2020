package TestNGDemos.Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassThree {

    @Test
    public void classThreeTest1()
    {
        System.out.println("classThreeTest1");

        Assert.assertEquals(true,false,"This test is failed");
    }

    @Test  //(groups = "email")
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }

    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }


}
