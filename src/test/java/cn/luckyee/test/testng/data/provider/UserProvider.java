package cn.luckyee.test.testng.data.provider;

import org.testng.annotations.DataProvider;

/**
 * 用户数据提供者
 * Created by Jeff Lu on 2019/1/12.
 */
public class UserProvider {

    @DataProvider(name = "userProvider")
    public Object[][] provideDbConfig() {
        return new Object[][] { {"刘德华"}, {"吴京"}, {"胡歌"} };
    }

}
