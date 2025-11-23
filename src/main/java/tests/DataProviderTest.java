package tests;

import org.example.SimpleNumber;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "numForCheck")
    public Object[][] createNumbers(){
        return new Object[][]{
                {5, true},
                {10, true},
                {-5, false}
        };
    }

    @Test(dataProvider = "numForCheck")
    public void IsPositive(int num, boolean expectRes){
        SimpleNumber number = new SimpleNumber(num);
        Assert.assertEquals(number.isPositive(), expectRes);
        System.out.println("ТЕСТ DATA_PROVIDER");
    }
}
