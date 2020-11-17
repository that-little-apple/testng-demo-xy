/**
 * projectName: TestNGDemo
 * fileName: TestNGDemo_1_1.java
 * packageName: PACKAGE_NAME
 * date: 2020-11-01 7:48 上午
 */

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/**
 * 1、编写基础脚本
 * 2、增加断言
 */
public class TestNGDemo_4_1_Fixtures {
    @BeforeMethod
    public void clearResult(){
        Calculator.clear();
        System.out.println("计算器结果清零！");
    }
    @Test(priority = 1)
    public void addTest() throws InterruptedException {
        SoftAssert assertion = new SoftAssert();

        int result01 = Calculator.add(4,2);
        System.out.println("完成加法计算，结果为："+result01);
        assertion.assertEquals(result01,6);

        int result02 = Calculator.add(4,2);
        System.out.println("完成加法计算，结果为："+result02);
        assertion.assertEquals(result02,6);

        int result03 = Calculator.add(4,2);
        System.out.println("完成加法计算，结果为："+result03);
        assertion.assertEquals(result03,6);
        assertion.assertAll();

    }
    @Test(priority = 2)
    public void subtractTest() throws InterruptedException {
        int result = Calculator.subtract(4,2);
        System.out.println("完成减法计算，结果为："+result);
        Assert.assertEquals(result,2);
    }
    @Test(priority = 3)
    public void multiplyTest() throws InterruptedException {
        int result = Calculator.multiply(4,2);
        System.out.println("完成乘法计算，结果为："+result);
        Assert.assertEquals(result,8);
    }
    @Test(priority = 4)
    public void divideTest() throws InterruptedException {
        int result = Calculator.divide(4,2);
        System.out.println("完成除法计算，结果为："+result);
        Assert.assertEquals(result,2);
    }
    @Test(priority = 5)
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        System.out.println("完成计数器计数，结果为："+result);
        Assert.assertEquals(result,4);
    }

}