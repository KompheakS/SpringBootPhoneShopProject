package com.kompheak.java.phoneShop.repository;

import com.kompheak.java.phoneShop.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelsRepository extends JpaRepository<Model, Integer> {
}
