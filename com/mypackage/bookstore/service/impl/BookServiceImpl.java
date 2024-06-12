package com.mypackage.bookstore.service.impl;

import com.mypackage.bookstore.converter.BookConverter;
import com.mypackage.bookstore.dto.BookDTO;
import com.mypackage.bookstore.entity.BookEntity;
//import com.mypackage.bookstore.repository.BookRepository;
import com.mypackage.bookstore.repository.impl.BookRepositoryImpl;
import com.mypackage.bookstore.service.BookService;

public class BookServiceImpl implements BookService
{
    private BookRepositoryImpl bookRepository;
	
	public BookServiceImpl() {
		this.bookRepository = new BookRepositoryImpl();
	}
	
	@Override
	public Long add(BookDTO bookDTO) {
		//Convert the DTO to Repository compatible Entity class
		//Adapter Design Pattern
		BookEntity bookEntity = BookConverter.convertBookDTOtoBookEntity(bookDTO);
		return this.bookRepository.add(bookEntity);
	}

	@Override
	public BookDTO getBook(Long bookId) {
		//Convert the Entity to Service compatible DTO class
		//Adapter Design Pattern
		BookEntity bookEntity = this.bookRepository.getDetail(bookId);
		BookDTO bookDTO = BookConverter.convertBookEntitytoBookDTO(bookEntity);
		return bookDTO;
	}
}
