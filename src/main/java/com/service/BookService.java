package com.service;

import java.util.List;
import com.model.Book;
import com.model.Contact;

public interface BookService {
	public void save(Book book);
	public void save(Contact contact, Book book);
	public void delete(Book book);
	public void update(Book book);
	public List<Book> query();
}
