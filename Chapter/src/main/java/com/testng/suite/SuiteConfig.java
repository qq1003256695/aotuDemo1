package com.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public  static void beforeuite(){
        System.out.println("Before suite 被执行");
    }
    @AfterSuite
    public static void aftersuite(){
        System.out.println("After suite 被执行");
    }

    @BeforeTest
    public void BeferTest(){
        System.out.println("BeferTest 运行");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("AfterTest 运行");

    }

}
