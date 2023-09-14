package com.kompheak.java.phoneShop.mapper;

import com.kompheak.java.phoneShop.dto.ModelDTO;
import com.kompheak.java.phoneShop.entity.Brand;
import com.kompheak.java.phoneShop.entity.Model;
import com.kompheak.java.phoneShop.service.BrandService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper( componentModel = "spring", uses = {BrandService.class})
public interface ModelEntityMapper {
    ModelEntityMapper INSTANCE = Mappers.getMapper(ModelEntityMapper.class);

    @Mapping(target = "brand", source = "brandId")
    Model toModel(ModelDTO modelDTO);

/*    default Brand toBrand(Integer brandId){
        Brand brand = new Brand();
        brand.setId(brandId);

        return brand;
        }*/
}
