package com.mypackage.bookstore.repository.impl;

import java.util.ArrayList;
import java.util.List;

import com.mypackage.bookstore.entity.BookEntity;
import com.mypackage.bookstore.repository.BookRepository;
import com.mypackage.bookstore.serdeser.BookSerializer;

public class BookRepositoryImpl implements BookRepository 
{
    private List<BookEntity> bookList;

    public BookRepositoryImpl()
    {
        this.bookList = new ArrayList<>();
    }
    public Long add(BookEntity bookEntity)
    {
        BookSerializer.serializeBook(bookEntity);
         this.bookList.add(bookEntity);
         System.out.println(this.bookList.get(0).getName());
        return bookEntity.getBookId();
    }    
    public BookEntity getDetail(Long bookId) {
		BookEntity be = BookSerializer.deSerializeBook(bookId);
		return be;
	}
}
