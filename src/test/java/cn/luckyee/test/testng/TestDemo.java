package cn.luckyee.test.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jeff Lu on 2019/1/12.
 */
public class TestDemo {

    /**
     * 简单测试
     */
    @Test
    public void testcase1(){
        Assert.assertTrue(false);
        System.out.println("testcase1");
    }



}