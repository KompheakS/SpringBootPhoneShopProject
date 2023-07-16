package com.kompheak.java.phoneShop.service;

import com.kompheak.java.phoneShop.entity.Brand;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

public interface BrandService {
    Brand create(Brand brand);

    Brand getById(Integer id);

    Brand update (Integer id, Brand brandToUpdate);

    List<Brand> getBrands(String name);

    Page<Brand> getBrands(Map<String, String> params);
}
