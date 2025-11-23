package tests;

import org.example.SimpleNumber;
import org.testng.Assert;
import org.testng.annotations.*;

public class SimpleNumberTest {

    @BeforeTest
    public void preconditionTest(){
        System.out.println("BeforeTest");
    }

    @BeforeClass
    public void preconditionClass(){
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    public void preconditionMethod(){
        System.out.println("BeforeMethod");
    }

    @BeforeSuite
    public void preconditionSuite() {
        System.out.println("BeforeSuite");
    }

    @Test(priority = 0)
    public void isPositive(){
        SimpleNumber num1 = new SimpleNumber(5);
        Assert.assertTrue(num1.isPositive());
        System.out.println("ТЕСТ 1");
    }

    @Test
    public void IsNegative(){
        SimpleNumber num2 = new SimpleNumber(-5);
        Assert.assertTrue(num2.isNegative());
        System.out.println("ТЕСТ 2");
    }

    @AfterTest
    public void postconditionTest(){
        System.out.println("AfterTest");
    }

    @AfterClass
    public void postconditionClass(){
        System.out.println("AfterClass");
    }

    @AfterMethod
    public void postconditionMethod(){
        System.out.println("AfterMethod");
    }

    @AfterSuite
    public void postconditionSuite(){
        System.out.println("AfterSuite");
    }

}
