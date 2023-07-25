package com.kompheak.java.phoneShop.controller;

import com.kompheak.java.phoneShop.dto.ModelDTO;
import com.kompheak.java.phoneShop.service.ModelsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/models")
public class ModelController {

    //@Autowired when we use @RequiredArgsConstructor, so we don't need to use autowired
    private final ModelsService modelsService;

    //@PostMapping("/create")
    @PostMapping("/create")
    public ResponseEntity<?> createModel(@RequestBody ModelDTO modelDTO){
        //modelsService.save();
        modelsService.save(modelDTO);

        return ResponseEntity.ok(modelDTO);
    }
}
