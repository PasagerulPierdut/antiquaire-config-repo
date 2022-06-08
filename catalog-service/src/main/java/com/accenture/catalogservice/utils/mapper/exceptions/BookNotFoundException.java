package com.accenture.catalogservice.utils.mapper.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException() {
    }

    public BookNotFoundException(String message) {
        super.getLocalizedMessage();
    }

    public BookNotFoundException(String message, Throwable err) {
        super(message, err);
    }
}
