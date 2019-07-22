package com.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

//@Component
public abstract class BaseDao<T> extends HibernateDaoSupport {
    private static Logger logger = LoggerFactory.getLogger(BaseDao.class);

}
