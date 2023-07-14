package com.kompheak.java.phoneShop.mapper;

import com.kompheak.java.phoneShop.dto.ModelDTO;
import com.kompheak.java.phoneShop.entity.Model;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ModelMapper {
    ModelMapper INSTANCE = Mappers.getMapper(ModelMapper.class);

    @Mapping(target = "brand", source = "brandId")
    Model toModel(ModelDTO modelDTO);
    ModelDTO toModelDto(Model model);
}
