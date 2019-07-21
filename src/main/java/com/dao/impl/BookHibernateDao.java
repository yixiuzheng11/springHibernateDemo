package com.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.util.StringUtils;
import com.dao.BookDao;
import com.model.Book;

//@Repository
public class BookHibernateDao extends HibernateDaoSupport implements BookDao {
	public void save(Book book) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(book);
	}

	public void delete(Book book) {
		// TODO Auto-generated method stub

	}

	public void update(Book book) {
		// TODO Auto-generated method stub

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
