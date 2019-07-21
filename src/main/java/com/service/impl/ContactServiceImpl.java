package com.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ContactDao;
import com.model.Contact;
import com.service.ContactService;

import javax.annotation.Resource;

@Service("contactService")
public class ContactServiceImpl implements ContactService {
	@Resource
	private ContactDao contactDao;

	public void save(Contact contact) {
		// TODO Auto-generated method stub
		contactDao.save(contact);
	}

	public void delete(Contact contact) {
		// TODO Auto-generated method stub

	}

	public void update(Contact contact) {
		// TODO Auto-generated method stub

	}

	public List<Contact> query(String whereSql) {
		// TODO Auto-generated method stub
		return contactDao.query(whereSql);
	}

}
