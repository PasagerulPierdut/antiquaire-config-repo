package com.accenture.catalogservice.utils.mapper;

import com.accenture.catalogservice.model.Book;
import com.accenture.catalogservice.model.dto.BookDto;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public BookDto toDto(Book book) {
        return BookDto.builder()
                .code(book.getCode())
                .name(book.getName())
                .description(book.getDescription())
                .price(book.getPrice())
                .build();
    }

    public Book toEntity(BookDto bookDto) {
        return Book.builder()
                .code(bookDto.getCode())
                .name(bookDto.getName())
                .description(bookDto.getDescription())
                .price(bookDto.getPrice())
                .build();
    }
}
