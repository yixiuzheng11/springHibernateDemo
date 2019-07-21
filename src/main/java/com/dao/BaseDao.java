package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseDao {
	@Autowired
	private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    // 获取 Session，注意：没有使用openSession(),使用getCurrentSession()才能被Spring管理事务
    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }
}
