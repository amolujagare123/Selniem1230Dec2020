package TestNGDemos.Demo2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {


    @BeforeSuite
    public void myBeforeSuite()
    {
        System.out.println("myBeforeSuite");
    }

    @AfterSuite
    public void myAfterSuite()
    {
        System.out.println("myAfterSuite");
    }

    @Parameters({"user","pass","os"})
    @Test
    public void classTwoTest1(String myUser, String myPass, String myOs)
    {

        String user = myUser;
        String pass = myPass;
        String os = myOs;

        System.out.println("user="+user);
        System.out.println("pass="+pass);
        System.out.println("os="+os);

        System.out.println("classTwoTest1");
    }

    @Test
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }

    @Test
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");
    }


}
