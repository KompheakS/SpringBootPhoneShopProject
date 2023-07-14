package com.kompheak.java.phoneShop.util;

import com.kompheak.java.phoneShop.dto.BrandDTO;
import com.kompheak.java.phoneShop.entity.Brand;

public class Mapper {

    public static Brand toBrand(BrandDTO dto){
        Brand brand = new Brand();

        brand.setName(dto.getName());

        return brand;
    }

    public static BrandDTO toBrandDTO(Brand brand){
        BrandDTO brandDTO = new BrandDTO();
        brandDTO.setName(brand.getName());

        return brandDTO;
    }
}
