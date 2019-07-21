package com.dao;

import java.util.List;
import com.model.Contact;

public interface ContactDao {
	public void save(Contact contact);
	public void delete(Contact contact);
	public void update(Contact contact);
	public List<Contact> query(String whereSql);
}
