package com.example.demo.services;

import com.example.demo.models.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product deleteProduct(int id) {
        Product product = productRepository.findById(id).orElse(null);
//        product.setNumberOfItems(0);
        return product;
    }


    /* Exception */
    public Product updateProduct(Product product) {
        Product p = findProductById(product.getId());

        if (p == null)
            return null;

        return productRepository.save(product);
    }

    public Product findProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }


}

