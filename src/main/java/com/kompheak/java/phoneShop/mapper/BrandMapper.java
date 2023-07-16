package com.kompheak.java.phoneShop.mapper;

import com.kompheak.java.phoneShop.dto.BrandDTO;
import com.kompheak.java.phoneShop.entity.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BrandMapper {

    BrandMapper INSTANCE = Mappers.getMapper(BrandMapper.class);
    Brand toBrand(BrandDTO brandDTO);

    BrandDTO toBrandDto(Brand entity);

}
