package com.testng;

/*
  常用注解
 */


import org.testng.annotations.Test;

public class BaseAnnotation {
    @Test
    public static void test1(){
//        System.out.println("这是第1个测试用例");
        System.out.printf("BaseAnnotation_______test1111线程id : %s%n",Thread.currentThread().getId());
    }

    @Test(enabled = true) // 括号里面=false表示此条用例不执行
    public static void test2(){
//        System.out.println("这是第2个测试用例");
        System.out.printf("BaseAnnotation_______test2222线程id : %s%n",Thread.currentThread().getId());
    }
//
//    @BeforeMethod
//    public static void BeforeMethod(){
//        System.out.println("Before Method被执行了");
//    }
//    @AfterMethod
//    public void AfterMethod(){
//        System.out.println(" After Method被执行了");
//    }
//    @BeforeClass
//    public void beforeclass(){
//        System.out.println("Before class被执行");
//    }
//    @AfterClass
//    public void afterclass(){
//        System.out.println("After class 被执行");
//    }
//
//    @BeforeMethod
//    public void beforeMethod(){
//        System.out.println("BeforeMethod 执行");
//    }
//    @AfterMethod
//    public void afterMethod(){
//        System.out.println("AfterMethod 执行");
//    }
//
//    @BeforeSuite
//    public  static void beforeuite(){
//        System.out.println("Before suite 被执行");
//    }
//    @AfterSuite
//    public static void aftersuite(){
//        System.out.println("After suite 被执行");
//    }
}
