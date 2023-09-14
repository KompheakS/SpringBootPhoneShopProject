package com.kompheak.java.phoneShop.service.implementation;

import com.kompheak.java.phoneShop.dto.ModelDTO;
import com.kompheak.java.phoneShop.entity.Model;
import com.kompheak.java.phoneShop.mapper.ModelEntityMapper;
import com.kompheak.java.phoneShop.repository.ModelsRepository;
import com.kompheak.java.phoneShop.service.ModelsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@AllArgsConstructor
public class ModelsImplementation implements ModelsService {

    private final ModelsRepository modelsRepository;
    private final ModelEntityMapper modelEntityMapper;
    @Override
    public Model save(ModelDTO modelDTO) {
        Model model = modelEntityMapper.toModel(modelDTO);

        return modelsRepository.save(model);
    }
}
