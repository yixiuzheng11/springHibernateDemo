package com.servlet;

import com.model.Contact;
import org.springframework.context.ApplicationContext;
import com.service.BookService;
import com.service.ContactService;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ContactServlet extends HttpServlet {

	private ApplicationContext context;

	private ContactService contactService;

	private BookService bookService;

	public void init() {
		context = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		contactService = (ContactService) context.getBean("contactService");
		bookService = (BookService) context.getBean("bookService");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		/*Contact contact = new Contact();
		contact.setName("谢飞");
		contact.setAge(32);
		contact.setEmail("谢飞@qq.com");

		Book book = new Book();
		book.setName("西游记");
		book.setPrice(new BigDecimal("28"));
		bookService.save(contact, book);*/
		List<Contact> list = contactService.query(null);
		System.out.println("list.size------"+list.size());
	}
}
