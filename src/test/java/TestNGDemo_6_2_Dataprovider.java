/**
 * projectName: TestNGDemo
 * fileName: TestNGDemo_1_1.java
 * packageName: PACKAGE_NAME
 * date: 2020-11-01 7:48 上午
 */

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
public class TestNGDemo_6_2_Dataprovider {


    @DataProvider(name = "testData")
    public static Object[][] words() throws IOException {
        return FakerUtils.getTestData("/src/main/resources/data/divideparam.csv");
    }

    @Test(threadPoolSize = 1, invocationCount = 1, dataProvider = "testData")
    public void divTest(String x ,String y) throws InterruptedException {
        int result = Calculator.divide(Integer.valueOf(x),Integer.valueOf(y));
        System.out.println(result);
    }
}