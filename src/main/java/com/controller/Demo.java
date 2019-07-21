package com.controller;

import com.dao.impl.BookHibernateDao;
import com.model.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:spring/applicationContext.xml"})
public class Demo {
    @Autowired
    private BookHibernateDao bookHibernateDao;

    @Test
    public void testAdd() {
        List<Book> list = bookHibernateDao.query(null);
        System.out.println("----------------"+list.size());
    }
}
