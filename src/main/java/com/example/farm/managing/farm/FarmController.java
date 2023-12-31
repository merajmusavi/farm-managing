package com.example.farm.managing.farm;

import com.example.farm.managing.customer.CustomerIdEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

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
    void updatePrice(@PathVariable("id") Long id, @RequestBody Map<String, String> price) {
        String newPrice = price.get("price");
        farmService.updatePrice(id, newPrice);
    }

    @DeleteMapping("/delete/{id}")
    void deleteProduct(@PathVariable("id") Long id) {
        farmService.deleteUser(id);
    }

    @PostMapping("rangeUpdate")
    void rangeUpdate(@RequestBody Map<Long, String> map) {
        farmService.rangeUpdate(map);
    }

    @GetMapping("/allDesc")
    List<FarmDataModel> farmDataModels() {
        return farmService.PriceASC();
    }

    @GetMapping("/page")
    Page<FarmDataModel> farmDataModelPage() {
        return farmService.farmDataModelPage();
    }


    @PostMapping("customer")
    void saveCustomerAndProduct(@RequestBody CustomerIdEntity customerIdEntity) {

        farmService.SaveCustomerWithProduct(customerIdEntity);

    }


    @GetMapping("findByCustomerId/{id}")
    Optional<String> customerIdEntity(@PathVariable Long id){

        return farmService.findUByCustomerIdCard(id);

    }


}
