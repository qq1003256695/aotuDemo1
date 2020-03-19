package com.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {
    @Test
    public void test1(){
        System.out.printf("test1111线程id : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("test2222线程id : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("test3333线程id : %s%n",Thread.currentThread().getId());
    }
}
