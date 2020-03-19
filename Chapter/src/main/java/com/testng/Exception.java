package com.testng;

import org.testng.annotations.Test;

;

public class Exception {
    /*
    异常测试
    预期结果为某一个异常的时候
    例如：传入不合法的值，程序抛出异常
     */

    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runException(){
        System.out.println("预期结果是失败");
        throw  new RuntimeException();  //新增一个异常
    }


    //这是一个不成功的 异常测试
    @Test(expectedExceptions = RuntimeException.class)  //预期异常 = xxx
    public void runExceptions(){
        System.out.println("预期结果是失败");

    }
}
