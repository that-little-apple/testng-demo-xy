/**
 * projectName: TestNGDemo
 * fileName: TestNGDemo_1_1.java
 * packageName: PACKAGE_NAME
 * date: 2020-11-01 7:48 上午
 */

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/**
 * 1、编写基础脚本
 */
public class TestNGDemo_1_1_Base {
    /**
     * testng软断言演示SoftAssert
     * @throws InterruptedException
     */
    @Test
    public void addTestSoftAssert() throws InterruptedException {
        SoftAssert assertion = new SoftAssert();
        int result01 = Calculator.add(4,2);
        System.out.println(result01);
        assertion.assertEquals(result01,7);
        int result02 = Calculator.add(4,2);
        System.out.println(result02);
        assertion.assertEquals(result02,6);

        int result03 = Calculator.add(4,2);
        System.out.println(result03);
        assertion.assertEquals(result03,6);
        //assertAll()一定要放在该测试类的最后一个断言后面，软断言的类，叫SoftAssert.java，这个类是需要创建实例对象，才能调用相关实例方法进行软断言。
        assertion.assertAll();
    }

    /**
     * testng硬断言演示Assert
     * @throws InterruptedException
     */
    @Test
    public void addTest() throws InterruptedException {
        int result01 = Calculator.add(4,2);
        System.out.println(result01);
        Assert.assertEquals(result01,6);
        int result02 = Calculator.add(4,2);
        System.out.println(result02);
        Assert.assertEquals(result02,7);

        int result03 = Calculator.add(4,2);
        System.out.println(result03);
        Assert.assertEquals(result03,6);

    }

    @Test
    public void subtractTest() throws InterruptedException {
        int result = Calculator.subtract(4,2);
        System.out.println(result);
        Assert.assertEquals(result,2);

    }
    @Test
    public void multiplyTest() throws InterruptedException {
        int result = Calculator.multiply(4,2);
        System.out.println(result);
        Assert.assertEquals(result,8);

    }
    @Test
    public void divideTest() throws InterruptedException {
        int result = Calculator.divide(4,2);
        System.out.println(result);
        Assert.assertEquals(result,2);

    }
    @Test
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        System.out.println(result);
        Assert.assertEquals(result,4);

    }

}