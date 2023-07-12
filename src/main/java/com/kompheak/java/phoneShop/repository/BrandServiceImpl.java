package com.kompheak.java.phoneShop.repository;

import com.kompheak.java.phoneShop.entity.Brand;
import com.kompheak.java.phoneShop.exception.ResourceNotFoundException;
import com.kompheak.java.phoneShop.service.BrandService;
import com.kompheak.java.phoneShop.spec.BrandFilter;
import com.kompheak.java.phoneShop.spec.BrandSpec;
import com.kompheak.java.phoneShop.util.PageUtil;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
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

    @Override
    public List<Brand> getBrands(String name) {

        return brandRepository.findByNameLike("%"+name+"%");
    }

    @Override
    public Page<Brand> getBrands(Map<String, String> params) {
        BrandFilter brandFilter = new BrandFilter();

        if(params.containsKey("name")){
            String name = params.get("name");

            brandFilter.setName(name);
        }

        if (params.containsKey("id")){
            String id = params.get("id");
            brandFilter.setId(Integer.parseInt(id));
        }

        int pageLimit = 1;
        if (params.containsKey(PageUtil.PAGE_LIMIT)){
            pageLimit = Integer.parseInt(params.get(PageUtil.PAGE_LIMIT));
        }

        int pageNumber = 1;
        if (params.containsKey(PageUtil.PAGE_NUMBER)){
            pageNumber = Integer.parseInt(params.get(PageUtil.PAGE_NUMBER));
        }

        //BrandSpec brandSpec = new BrandSpec(brandFilter);

        BrandSpec brandSpec = new BrandSpec(brandFilter);

        Pageable pageable = PageUtil.getPageable(pageNumber, pageLimit);

        Page<Brand> page = brandRepository.findAll(brandSpec, pageable);

        return page;
    }

    /*@Override
    public List<Brand> getBrands(Map<String, String> params) {
        BrandFilter brandFilter = new BrandFilter();

        if(params.containsKey("name")){
            String name = params.get("name");

            brandFilter.setName(name);
        }

        if (params.containsKey("id")){
            String id = params.get("id");
            brandFilter.setId(Integer.parseInt(id));
        }
        BrandSpec brandSpec = new BrandSpec(brandFilter);

        return brandRepository.findAll(brandSpec);
    }*/
}
