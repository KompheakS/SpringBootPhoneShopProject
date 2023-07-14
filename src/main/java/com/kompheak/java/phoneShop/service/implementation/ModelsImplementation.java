package com.kompheak.java.phoneShop.service.implementation;

import com.kompheak.java.phoneShop.entity.Model;
import com.kompheak.java.phoneShop.repository.ModelsRepository;
import com.kompheak.java.phoneShop.service.ModelsService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class ModelsImplementation implements ModelsService {
    private ModelsRepository modelsRepository;
    @Override
    public Model save(Model model) {
        return modelsRepository.save(model);
    }
}
