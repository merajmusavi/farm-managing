package com.example.farm.managing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FarmController {


    FarmService farmService;
    public FarmController(FarmService farmService){
        this.farmService = farmService;
    }
    @GetMapping("/products")
    List<FarmDataModel> all(){
       return farmService.allProducts();

    }

    @GetMapping("{id}")
    FarmDataModel farmDataModel(@PathVariable("id") Long id){
        return farmService.farmDataModel(id);
    }







}
