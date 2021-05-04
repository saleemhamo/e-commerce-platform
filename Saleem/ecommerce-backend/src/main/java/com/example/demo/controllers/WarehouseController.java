package com.example.demo.controllers;
import com.example.demo.models.Warehouse;
import com.example.demo.services.WarehouseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/warehouses")
public class WarehouseController {

    private WarehouseService warehouseService;


    public WarehouseController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }


    @GetMapping
    public List<Warehouse> getAllWarehouses() {
        return warehouseService.getAllWarehouse();
    }

    @GetMapping("/{id}")
    public Warehouse getWarehouse(@PathVariable int id) {
        return warehouseService.findWarehouseById(id);
    }

    @PostMapping
    public Warehouse addProduct(@RequestBody Warehouse warehouse) {
        return warehouseService.addWarehouse(warehouse);
    }


    @PutMapping
    public Warehouse updateWarehouse(@RequestBody Warehouse warehouse) {
        return warehouseService.updateWarehouse(warehouse);
    }

    @DeleteMapping("/{id}")
    public Warehouse deleteWarehouse(@PathVariable int id) {
        return warehouseService.deleteWarehouse(id);
    }

}
