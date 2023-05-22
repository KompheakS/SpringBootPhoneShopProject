package com.kompheak.java.phoneShop.service;

import com.kompheak.java.phoneShop.entity.Brand;

public interface BrandService {
    Brand create(Brand brand);

    Brand getById(Integer id);

    Brand update (Integer id, Brand brandToUpdate);
}
