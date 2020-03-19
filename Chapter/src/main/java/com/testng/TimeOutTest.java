package com.testng;

import org.testng.annotations.Test;
/*
超时测试

 */
public class TimeOutTest {
    @Test(timeOut = 3000)   // 设置 1000毫秒内返回结果
    public void  testSuccess() throws InterruptedException {
        Thread.sleep(2000);  //此处若> 上面的时间 则运行超时测试
    }
}
