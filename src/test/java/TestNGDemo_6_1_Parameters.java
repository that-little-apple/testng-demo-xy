/**
 * projectName: TestNGDemo
 * fileName: TestNGDemo_1_1.java
 * packageName: PACKAGE_NAME
 * date: 2020-11-01 7:48 上午
 */

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/**
 * 1、编写基础脚本
 * 2、增加断言
 */
public class TestNGDemo_6_1_Parameters {

    @Test(threadPoolSize = 1, invocationCount = 1)
    @Parameters({"x","y","result"})
    public void addTest(int x,int y,int result) throws InterruptedException {
        int result01 = Calculator.add(x,y);
        System.out.println("完成加法计算，结果为："+result01);
        Assert.assertEquals(result,result01);
    }
}