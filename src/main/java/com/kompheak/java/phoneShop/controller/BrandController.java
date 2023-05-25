package com.kompheak.java.phoneShop.controller;

import com.kompheak.java.phoneShop.dto.BrandDTO;
import com.kompheak.java.phoneShop.entity.Brand;
import com.kompheak.java.phoneShop.mapper.BrandMapper;
import com.kompheak.java.phoneShop.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("brands")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO){
        //Brand brand = Mapper.toBrand(brandDTO);

        Brand brand = BrandMapper.INSTANCE.toBrand(brandDTO);

        brand = brandService.create(brand);

        return ResponseEntity.ok(brand);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getOneBrand(@PathVariable("id") Integer brandId){

        Brand brand = brandService.getById(brandId);

        return ResponseEntity.ok(BrandMapper.INSTANCE.toBrandDto(brand));
    }

    @PutMapping("{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer brandId,@RequestBody BrandDTO brandDTO){

        Brand brand = BrandMapper.INSTANCE.toBrand(brandDTO);
        Brand updatedBrand = brandService.update(brandId, brand);

        return ResponseEntity.ok(BrandMapper.INSTANCE.toBrandDto(updatedBrand));
    }
}
