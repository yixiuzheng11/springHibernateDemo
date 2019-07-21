package com.dao;

import java.util.List;
import com.model.Book;

public interface BookDao {
	public void save(Book book);
	public void delete(Book book);
	public void update(Book book);
	public List<Book> query(String whereSql);
}
