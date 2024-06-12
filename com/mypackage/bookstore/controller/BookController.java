package com.mypackage.bookstore.controller;

import com.mypackage.bookstore.dto.BookDTO;
import com.mypackage.bookstore.service.BookService;
import com.mypackage.bookstore.service.impl.BookServiceImpl;

public class BookController 
{
     private BookService bookService;

    public BookController()
    {
        this.bookService = new BookServiceImpl();
    }

    public Long add(BookDTO bookDTO)
    {   //call service layer add method
        return this.bookService.add(bookDTO);
        
    }    
    public BookDTO getBook(Long bookId) {
		//Call to the Service layer get book method and return the book dto object
		return this.bookService.getBook(bookId);    
    }
}
