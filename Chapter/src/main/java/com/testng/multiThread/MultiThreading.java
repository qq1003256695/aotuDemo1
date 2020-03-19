package com.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreading {
    @Test(invocationCount = 5,threadPoolSize = 2)   //5个线程，2个线程池  必须加线程池  才可以不然默认线程还是1
    public void test1(){
        System.out.println("11111111");
        System.out.printf("线程id : %s%n",Thread.currentThread().getId());
        System.out.printf("getContextClassLoader : %s%n",Thread.currentThread().getContextClassLoader());
        System.out.printf("getName : %s%n",Thread.currentThread().getName());
    }
}
