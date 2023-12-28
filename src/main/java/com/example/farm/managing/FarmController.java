package com.example.farm.managing;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class FarmController {


    FarmService farmService;

    public FarmController(FarmService farmService) {
        this.farmService = farmService;
    }

    @GetMapping("/products")
    List<FarmDataModel> all() {
        return farmService.allProducts();

    }

    @GetMapping("{id}")
    FarmDataModel farmDataModel(@PathVariable("id") Long id) {
        return farmService.farmDataModel(id);
    }


    @PostMapping("add")
    void addProduct(@RequestBody FarmDataModel dataModel) {
        farmService.insertProduct(dataModel);
    }

    @PutMapping("/products/{id}")
    void updatePrice(@PathVariable("id") Long id, @RequestBody Map<String,String> price){
        String newPrice = price.get("price");
        farmService.updatePrice(id,newPrice);
    }

    @DeleteMapping("/delete/{id}")
    void deleteProduct(@PathVariable("id") Long id){
        farmService.deleteUser(id);
    }

    @PostMapping("rangeUpdate")
    void rangeUpdate(@RequestBody Map<Long,String> map){
        farmService.rangeUpdate(map);
    }




}
