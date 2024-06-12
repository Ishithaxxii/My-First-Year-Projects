package com.mypackage.bookstore.repository;

import com.mypackage.bookstore.entity.BookEntity;

public interface BookRepository 
{
    public Long add(BookEntity bookEntity);  
}
