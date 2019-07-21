package com.service.impl;

import java.util.List;

import com.dao.ContactDao;
import com.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BookDao;
import com.model.Book;
import com.service.BookService;

import javax.annotation.Resource;

@Service("bookService")
public class BookServiceImpl implements BookService {
	@Resource
	private ContactDao contactDao;

	@Resource
	private BookDao bookDao;

	public void save(Book book) {
		// TODO Auto-generated method stub
		bookDao.save(book);
	}

	public void save(Contact contact, Book book) {
		// TODO Auto-generated method stub
		contactDao.save(contact);
		//System.out.println(1/0);
		bookDao.save(book);
	}

	public void delete(Book book) {
		// TODO Auto-generated method stub

	}

	public void update(Book book) {
		// TODO Auto-generated method stub

	}

	public List<Book> query() {
		// TODO Auto-generated method stub
		return bookDao.query(null);
	}

}
