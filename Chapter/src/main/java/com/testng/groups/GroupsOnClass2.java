package com.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsOnClass2 {
    public void stu2(){
        System.out.println("groupsclass中 stu2执行");
    }
}
