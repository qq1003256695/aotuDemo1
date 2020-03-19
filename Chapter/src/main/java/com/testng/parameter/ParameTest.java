package com.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameTest{
    @Test
    @Parameters({"name","age"})    //参数化所用注解
    public void stu(String name,int age){
        System.out.println("name="+name+"  age="+age);

    }
    @Test
    @Parameters({"name1","age1"})    //参数化所用注解
    public void stu1(String name1,int age1){
        System.out.println("name="+name1+"  age="+age1);

    }
    @Test
    @Parameters({"name2","age2"})    //参数化所用注解
    public void stu2(String name2,int age2){
        System.out.println("name="+name2+"  age="+age2);

    }
}
