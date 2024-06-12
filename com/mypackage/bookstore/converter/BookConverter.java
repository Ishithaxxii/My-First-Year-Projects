package com.mypackage.bookstore.converter;

import com.mypackage.bookstore.dto.BookDTO;
import com.mypackage.bookstore.entity.BookEntity;

public class BookConverter 
{
    public static BookEntity convertBookDTOtoBookEntity(BookDTO bookDTO)
    {
        BookEntity be = new BookEntity();

        be.setAuthorEmail(bookDTO.getAuthorEmail());
        be.setAuthorName(bookDTO.getAuthorName());
        be.setAvailableQty(bookDTO.getAvailableQty());
        be.setBookId(bookDTO.getBookId());
        be.setDescription(bookDTO.getDescription());
        be.setName(bookDTO.getName());
        be.setPriceperQty(bookDTO.getPriceperQty());

        return be;
    }
    public static BookDTO convertBookEntitytoBookDTO(BookEntity bookEntity) {
		
		BookDTO bookDTO = new BookDTO();
		bookDTO.setAuthorEmail(bookEntity.getAuthorEmail());
		bookDTO.setAuthorName(bookEntity.getAuthorName());
		bookDTO.setAvailableQty(bookEntity.getAvailableQty());
		bookDTO.setBookId(bookEntity.getBookId());
		bookDTO.setDescription(bookEntity.getDescription());
		bookDTO.setName(bookEntity.getName());
		bookDTO.setPriceperQty(bookEntity.getPriceperQty());
		
		return bookDTO;
    }
}
