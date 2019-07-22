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
		bookDao.save(book);
	}

	public void delete(Book book) {
		// TODO Auto-generated method stub
		bookDao.delete(book);
	}

	public void update(Book book) {
		// TODO Auto-generated method stub
		bookDao.update(book);
	}

	public List<Book> query(String whereSql) {
		// TODO Auto-generated method stub
		return bookDao.query(whereSql);
	}

}
