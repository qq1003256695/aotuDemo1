package com.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println("groupsclass中 stu1执行");
    }
}
