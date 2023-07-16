package com.kompheak.java.phoneShop.dto;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;

@Data
public class PageDto {

    private List<?> list;
    private PaginationDto paginationDto;

    public PageDto(Page<?> pages){
        list = pages.getContent();
        this.paginationDto = PaginationDto.builder()
                .empty(pages.isEmpty())
                .first(pages.isFirst())
                .last(pages.isLast())
                .pageSize(pages.getPageable().getPageSize())
                .pageNumber(pages.getPageable().getPageNumber())
                .totalPages(pages.getTotalPages())
                .totalElement((int) pages.getTotalElements())
                .numberOfElement(pages.getNumberOfElements())
                .build();
    }
}
