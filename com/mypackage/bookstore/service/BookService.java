package com.mypackage.bookstore.service;

import com.mypackage.bookstore.dto.BookDTO;

public interface BookService 
{
    public Long add(BookDTO bookDTO);
    public BookDTO getBook(Long bookId);
}
