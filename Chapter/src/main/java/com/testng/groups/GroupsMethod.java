package com.testng.groups;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsMethod {
    @Test(groups = "server")
    public  void test3(){
        System.out.println("3这是group---后端测试用例");
    }
    @Test(groups = "server")
    public  void test4(){
        System.out.println("4这是group---后端测试用例");
    }
    @Test(groups = "Client用例")
    public  void test5(){
        System.out.println("5这是Client用例");
    }
    @Test(groups = "Client后端用例")
    public  void test6(){
        System.out.println("6这是Client用例");
    }
    @BeforeGroups("server")
    public void BeforeGroups(){
        System.out.println("这是服务端用例组 执行【之前】的方法");
    }
    @AfterGroups("server")
    public void AfterGroups(){
        System.out.println("这是服务端用例组 执行【之后】的方法");
    }


}
