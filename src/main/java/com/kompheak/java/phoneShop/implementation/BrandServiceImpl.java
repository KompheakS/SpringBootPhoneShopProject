package com.kompheak.java.phoneShop.implementation;

import com.kompheak.java.phoneShop.entity.Brand;
import com.kompheak.java.phoneShop.repository.BrandRepository;
import com.kompheak.java.phoneShop.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;
    @Override
    public Brand create(Brand brand) {

        return brandRepository.save(brand);
    }
}
