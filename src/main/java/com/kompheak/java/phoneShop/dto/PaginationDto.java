package com.kompheak.java.phoneShop.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaginationDto {

    private int pageSize;
    private int pageNumber;
    private int totalPages;
    private int totalElement;
    private long numberOfElement;

    private boolean first;
    private boolean last;
    private boolean empty;

}
