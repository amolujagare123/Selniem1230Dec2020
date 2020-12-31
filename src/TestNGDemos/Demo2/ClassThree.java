package TestNGDemos.Demo2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {
    @Parameters({"user","pass","os"})
    @Test
    public void classThreeTest1(String myUser, String myPass, String myOs)
    {

        String user = myUser;
        String pass = myPass;
        String os = myOs;

        System.out.println("user="+user);
        System.out.println("pass="+pass);
        System.out.println("os="+os);

        System.out.println("classThreeTest1");
    }

    @Test
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
