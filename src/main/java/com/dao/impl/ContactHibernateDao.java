package com.dao.impl;

import java.util.List;

import com.dao.BaseDao;
import org.springframework.util.StringUtils;
import com.dao.ContactDao;
import com.model.Contact;

//@Repository
public class ContactHibernateDao extends BaseDao implements ContactDao {

	public void save(Contact contact) {
		this.getHibernateTemplate().save(contact);
	}

	public void delete(Contact contact) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(contact);
	}

	public void update(Contact contact) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(contact);
	}

	public List<Contact> query(String whereSql) {
		// TODO Auto-generated method stub
		StringBuffer hql = new StringBuffer();
		hql.append(" from com.model.Contact");
		if(!StringUtils.isEmpty(whereSql)) {
			hql.append(whereSql);
		}
		List<Contact> list = (List<Contact>) this.getHibernateTemplate().find(hql.toString());
		return list;
	}
}
