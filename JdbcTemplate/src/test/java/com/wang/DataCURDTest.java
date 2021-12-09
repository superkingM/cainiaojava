package com.wang;

import com.wang.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DataCURDTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    //插入
    public void testInsert() {
        jdbcTemplate.update("insert into account values(?,?)", "xiaoming", 1000);
    }

    @Test
    //查询
    public void testQueryCount() {
        Long row = jdbcTemplate.queryForObject("select count(*) from account", Long.class);
        System.out.println(row);
    }

    @Test
    //单个查询
    public void testQueryOne() {
        Account account = jdbcTemplate.queryForObject("select * from account where name=?", new BeanPropertyRowMapper<Account>(Account.class), "tom");
        System.out.println(account);
    }

    @Test
    //查询所有
    public void testQueryAll() {
        List<Account> accountList = jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        System.out.println(accountList);
    }

    @Test
    //更新
    public void testUpdate() {
        int row = jdbcTemplate.update("update account set money=? where name=?", 10000, "tom");
        System.out.println(row);
    }

    @Test
    //删除
    public void testDelete() {
        int row = jdbcTemplate.update("delete from account where name=?", "xiaohong");
        System.out.println(row);
    }


}
