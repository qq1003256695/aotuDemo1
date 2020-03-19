package com.testng;

/*
依赖测试
 */

import org.testng.annotations.Test;

import java.awt.image.RasterFormatException;

public class DependTest {
    @Test
    public void test1(){
        System.out.println("run test1");
        throw new RuntimeException("");
    }
    @Test(dependsOnMethods = {"test1"})  //方法2 依赖方法1，若方法1 报错 ，执行方法2也会被忽略
    public void test2(){
        System.out.println("run test2");
    }
}
