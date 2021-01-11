package TestNGDemos.Demo;

import org.testng.annotations.*;

public class ClassTwo {


   /* @BeforeSuite
    public void myBeforeSuite()
    {
        System.out.println("myBeforeSuite");
    }

    @AfterSuite
    public void myAfterSuite()
    {
        System.out.println("myAfterSuite");
    }

*/
    @Test
    public void classTwoTest1()
    {
        System.out.println("classTwoTest1");
    }

    @Test //(groups = "email")
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
