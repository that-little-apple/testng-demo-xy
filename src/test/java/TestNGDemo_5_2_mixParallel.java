/**
 * projectName: TestNGDemo
 * fileName: TestNGDemo_5_1Parallel.java
 * packageName: PACKAGE_NAME
 * date: 2020-11-07 5:25 下午
 */

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @description: testNG模拟多线程
 **/
public class TestNGDemo_5_2_mixParallel {
    //threadPoolSize控制的是每个测试方法并行线程数，而xml中配置的是并行不同测试方法的数量，两者相乘是最终的并行线程数
    //该测试方法可在3个线程中并发执行，共被调用10次，执行超时10秒。
    @Test(threadPoolSize = 3, invocationCount = 3,  timeOut = 6000)
    public void addTest() throws InterruptedException {
        SoftAssert assertion = new SoftAssert();
        int result = Calculator.add(4,2);
        System.out.println("完成加法计算，结果为："+result);
        Assert.assertEquals(result ,6);
    }
    @Test(threadPoolSize = 3, invocationCount = 3)
    public void subtractTest() throws InterruptedException {
        int result = Calculator.subtract(4,2);
        System.out.println("完成减法计算，结果为："+result);
        Assert.assertEquals(result,2);
    }
    @Test(threadPoolSize = 3, invocationCount = 3)
    public void multiplyTest() throws InterruptedException {
        int result = Calculator.multiply(4,2);
        System.out.println("完成乘法计算，结果为："+result);
        Assert.assertEquals(result,8);
    }
}