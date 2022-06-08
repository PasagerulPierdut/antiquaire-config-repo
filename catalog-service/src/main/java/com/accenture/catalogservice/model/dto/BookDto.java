package com.accenture.catalogservice.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookDto {

    private String code;
    private String name;
    private String description;
    private int price;
}
