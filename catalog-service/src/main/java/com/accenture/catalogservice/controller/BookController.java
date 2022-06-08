package com.accenture.catalogservice.controller;

import com.accenture.catalogservice.model.dto.BookDto;
import com.accenture.catalogservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/catalog")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{code}")
    public ResponseEntity<BookDto> findByCode(@PathVariable String code) {
        return new ResponseEntity<>(bookService.findByCode(code), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<BookDto>> findAll() {
        return new ResponseEntity<>(bookService.findAll(), HttpStatus.OK);
    }
}
