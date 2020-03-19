package com.testng.parameter;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProvider {
    @Test(dataProvider = "data")
    public void dataProviderTest(String name,int age){
        System.out.println("name="+name+"  age="+age);
        System.out.printf(" dataProviderTest————线程id : %s%n",Thread.currentThread().getId());
    }


    @org.testng.annotations.DataProvider(name = "data")    //1、通过DataProvider 传值
    public  Object[][] proderdata(){
        Object [][] o = new Object[][]{
                {"张三",12},
                {"李白",21}
        };
        return o;
    }

//    @Test(dataProvider = "method") //2、通过方法传值
//    public void t1(String name,int age){
//        System.out.println("t111111 方法 name="+name+";age="+age);
//        System.out.printf(" dataProviderTest(t1)————线程id : %s%n",Thread.currentThread().getId());
//    }
//    @Test(dataProvider = "method")
//    public void t2(String name,int age){
//        System.out.println("t222222 方法 name="+name+";age="+age);
//        System.out.printf(" dataProviderTest(t2)————线程id : %s%n",Thread.currentThread().getId());
//    }
//
//    @org.testng.annotations.DataProvider(name = "method")
//    public Object[][] dataTest(Method method){
//        Object[][] result = null;
//        if (method.getName().equals("t1")){
//            result = new Object[][]{
//                    {"高渐离",20},{"孙悟空",23}
//            };
//        }else if (method.getName().equals("t2")){
//            result = new  Object[][]{
//                    {"t2",22},{"t22",21}
//            };
//
//        }return result;
//    }


}
