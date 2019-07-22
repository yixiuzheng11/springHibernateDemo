package com.dao.impl;

import java.util.List;

import com.dao.BaseDao;
import org.springframework.util.StringUtils;
import com.dao.BookDao;
import com.model.Book;

//@Repository
public class BookHibernateDao extends BaseDao implements BookDao {
	public void save(Book book) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(book);
	}

	public void delete(Book book) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(book);
	}

	public void update(Book book) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(book);
	}

	public List<Book> query(String whereSql) {
		// TODO Auto-generated method stub
		StringBuffer hql = new StringBuffer();
		hql.append(" from com.model.Book");
		if(!StringUtils.isEmpty(whereSql)) {
			hql.append(whereSql);
		}
		List<Book> list = (List<Book>) this.getHibernateTemplate().find(hql.toString());
		return list;
	}
}
