package com.kompheak.java.phoneShop.util;

import org.springframework.data.domain.PageRequest;

import org.springframework.data.domain.Pageable;

public interface PageUtil {

    int DEFAULT_PAGE_LIMIT = 10;
    int DEFAULT_PAGE_NUMBER = 1;
    String PAGE_LIMIT = "_page";
    String PAGE_NUMBER = "_limit";

    static Pageable getPageable(int pageNumber, int pageSize){
         if(pageNumber < DEFAULT_PAGE_NUMBER){
            pageNumber = DEFAULT_PAGE_NUMBER;
         }

         if (pageSize < 1){
             pageSize = DEFAULT_PAGE_LIMIT;
         }
        return (Pageable) PageRequest.of(pageNumber - 1, pageSize);
    }
}
