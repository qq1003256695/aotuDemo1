package com.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teach(){
        System.out.println("groupsclass中 teacher执行");
    }
}
