import org.testng.annotations.Test;

public class TestNGDemo_5_1Parallel {
    @Test(threadPoolSize = 2,invocationCount = 10,timeOut = 6000)
    public void countTest() throws InterruptedException {
        int result = Calculator.synCount(1);
        System.out.println("计算加法结果为： "+result);
    }
}