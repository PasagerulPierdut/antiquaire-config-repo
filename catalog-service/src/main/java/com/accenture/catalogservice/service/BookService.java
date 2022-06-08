package com.accenture.catalogservice.service;

import com.accenture.catalogservice.model.dto.BookDto;
import com.accenture.catalogservice.repository.BookRepository;
import com.accenture.catalogservice.utils.mapper.BookMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@Transactional
@Slf4j
public class BookService {

    private final BookRepository bookRepository;

    private final BookMapper mapper;

    @Autowired
    public BookService(BookRepository bookRepository, BookMapper mapper) {
        this.bookRepository = bookRepository;
        this.mapper = mapper;
    }

    public BookDto findByCode(String code) {
        return mapper.toDto(bookRepository.findByCode(code)
                .orElseThrow(NoSuchElementException::new));
    }

    public List<BookDto> findAll() {
        return bookRepository.findAll().stream()
                .map(mapper::toDto)
                .toList();
    }
}

