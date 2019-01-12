package cn.luckyee.test.testng.jqh;

import cn.luckyee.test.testng.data.provider.UserProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 用信测试
 * Created by Jeff Lu on 2019/1/12.
 */
public class TestUseCredit {

    @Test(dataProvider = "userProvider", dataProviderClass = UserProvider.class)
    public void usetCredit(String username){
        Assert.assertEquals(username, "胡歌");
        System.out.println("usetCredit");
    }

}
