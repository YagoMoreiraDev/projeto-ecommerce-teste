package com.cloud.yagodev.backend.services;

import com.cloud.yagodev.backend.domain.dtos.ProductDTO;
import com.cloud.yagodev.backend.domain.entities.Product;
import com.cloud.yagodev.backend.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Product product = productRepository.findById(id).get();
        return new ProductDTO(product);
    }
}
