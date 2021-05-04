
package com.example.demo.services;
import com.example.demo.models.Warehouse;
import com.example.demo.models.Product;

import com.example.demo.repositories.WarehouseRepository;
import com.example.demo.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {


    @Autowired
    private WarehouseRepository warehouseRepository;
    @Autowired
    private ProductRepository productRepository;

    public boolean increaseProduct(int wareHouseId, int productId, int number) {


//        List<Product> products = warehouseRepository.findById(wareHouseId).orElse(null).getProducts();
//        Product product = null;
//
//        for (int i = 0; i < products.size(); i++)
//            if (products.get(i).getId() == productId)
//                product = products.get(i);
//
//        if (product == null)
//            return false;
//
//        if (number < 0 && (number * -1) > product.getNumberOfItems())
//            return false;
//
//        product.setNumberOfItems(product.getNumberOfItems() + number);

//        productRepository.save(product);

        return true;
    }

    public List<Product> getAllProductInWarehouse(int warehouseId) {
//        Warehouse wareHouse = warehouseRepository.findById(warehouseId).orElse(null);
//
//        return warehouse.getProducts();
        return null;
    }

    public Warehouse getWarehouse(int warehouseId) {
        Warehouse warehouse = warehouseRepository.findById(warehouseId).orElse(null);

        return warehouse;
    }

    public List<Warehouse> getAllWarehouse() {
        List<Warehouse> warehouses = warehouseRepository.findAll();

        return warehouses;
    }

    public Warehouse addWarehouse(Warehouse warehouse) {
        if (warehouse == null)
            return null;

        return warehouseRepository.save(warehouse);
    }

    public Warehouse deleteWarehouse(int id) {
        return warehouseRepository.findById(id).orElse(null);
    }

    /* Exception */
    public Warehouse updateWarehouse(Warehouse warehouse) {
        Warehouse wh = findWarehouseById(warehouse.getId());

        if (wh == null)
            return null;

        return warehouseRepository.save(warehouse);
    }

    public Warehouse findWarehouseById(int id) {
        return warehouseRepository.findById(id).orElse(null);
    }


}
