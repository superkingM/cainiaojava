package com.wang.test;

import com.wang.Demo;
import com.wang.ValueDemo;
import com.wang.controller.FruitController;
import com.wang.controller.UserController;
import com.wang.dao.UserDao;
import com.wang.domain.Person;
import com.wang.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoTest {
    @Test
    //Component注解
    public void test1() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Demo demo = (Demo) app.getBean("demo");
        demo.show();
    }

    @Test
    //Value注解
    public void test2() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ValueDemo valueDemo = (ValueDemo) app.getBean("valueDemo");
        valueDemo.show();
    }

    @Test
    //Repository注解
    public void test3() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.show();
    }

    @Test
    //Service注解
    public void test4() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.show();
    }

    @Test
    //Controller注解
    public void test5() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = (UserController) app.getBean("userController");
        userController.show();
    }

    @Test
    //Autowired注解
    public void test6() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = (UserController) app.getBean("userController");
        userController.run();
    }

    @Test
    //Qualifier注解
    public void test7() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        FruitController fruitController = (FruitController) app.getBean("fruitController");
        fruitController.show();
    }

    @Test
    //原始配置文件xml
    public void test8() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) app.getBean("person");
        person.show();
    }
}
