package com.kompheak.java.phoneShop.repository;

import com.kompheak.java.phoneShop.entity.Brand;
import com.kompheak.java.phoneShop.exception.ResourceNotFoundException;
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

    @Override
    public Brand getById(Integer id) {
//        Optional<Brand> brandOptional = brandRepository.findById(id);
//        if (brandOptional.isPresent()) {
//            return brandOptional.get();
//        }
//        throw new HttpClientErrorException(HttpStatus.NOT_FOUND, String.format("Brand with = %d not found", id));

        return brandRepository.findById(id)
                //.orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND, String.format("Brand with = %d not found", id)));
                .orElseThrow(() ->new ResourceNotFoundException("Brand",id));

    }

    @Override
    public Brand update(Integer id, Brand brandToUpdate) {
        Brand brand = getById(id);
        brand.setName(brandToUpdate.getName());

        return brandRepository.save(brand);
    }

}
