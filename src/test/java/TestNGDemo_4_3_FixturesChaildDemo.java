/**
 * projectName: TestNGDemo
 * fileName: TestNGDemo_1_1.java
 * packageName: PACKAGE_NAME
 * date: 2020-11-01 7:48 上午
 */

import org.testng.annotations.*;
/**
 * 1、编写基础脚本
 * 2、增加断言
 * （一）TestNG-常用注解参数
 * https://www.cnblogs.com/lvchengda/p/13044123.html
 */
public class TestNGDemo_4_3_FixturesChaildDemo extends TestNGDemo_4_2_FixturesDemo {
    
    @BeforeSuite
    public void chaildBeforeSuite() {
        System.out.println("chaild beforeSuite");
    }

    @AfterSuite
    public void chaildAfterSuite() {
        System.out.println("chaild afterSuite");
    }

    @BeforeTest
    public void chaildBeforeTest() {
        System.out.println("chaild beforeTest");
    }

    @AfterTest
    public void chaildAfterTest() {
        System.out.println("chaild afterTest");
    }

    @BeforeClass
    public void chaildBeforeClass() {
        System.out.println("chaild beforeClass");
    }

    @AfterClass
    public void chaildAfterClass() {
        System.out.println("chaild afterClass");
    }

    @BeforeMethod
    public void chaildBeofreMethod() {
        System.out.println("chaild beforeMethod");
    }

    @AfterMethod
    public void chaildAfterMethod() {
        System.out.println("chaild afterMethod");
    }

    @Test
    public void chaildTest1() {
        System.out.println("chaild method1");
    }

    @Test(enabled = true)
    public void chaildTest2() {
        System.out.println("chaild methods2");
    }
}