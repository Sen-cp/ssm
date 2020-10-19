package com.itheima;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class DaoTest {

    @Test
    public void tt(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao itemsDao = (ItemsDao)applicationContext.getBean("itemsDao");
        System.out.println("商品列表：：："+itemsDao.findAll());
    }

}
