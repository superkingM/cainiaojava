package cn.wang.test;

import cn.wang.dao.UserDao;
import cn.wang.domain.User;
import org.junit.Test;



public class UserDaoTest {
    @Test
    public void testLogin() {
        User loginuser = new User();
        loginuser.setUsername("admin");
        loginuser.setPassword("123456");


        UserDao dao = new UserDao();
        User user = dao.login(loginuser);

        System.out.println(user);
    }
}