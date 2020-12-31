package TestNGDemos.Demo2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {


    @BeforeTest
    public void myBeforeTest()
    {
        System.out.println("myBeforeTest");
    }

    @AfterTest
    public void myAfterTest()
    {
        System.out.println("myAfterTest");
    }



    @Parameters({"user","pass","os"})
    @Test
    public void classOneTest1(String myUser, String myPass, String myOs)
    {

        String user = myUser;
        String pass = myPass;
        String os = myOs;

        System.out.println("user="+user);
        System.out.println("pass="+pass);
        System.out.println("os="+os);

        System.out.println("classOneTest1");
    }

    @Test
    public void classOneTest2()
    {
        System.out.println("classOneTest2");
    }

    @Test
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }


}
