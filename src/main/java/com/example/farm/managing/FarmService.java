package com.example.farm.managing;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@Service
public class FarmService {
    FarmInterfaceDb interfaceDb;
    public FarmService(FarmInterfaceDb farmInterfaceDb){
        this.interfaceDb = farmInterfaceDb;
    }


    List<FarmDataModel> allProducts(){
       return interfaceDb.all();
    }
    FarmDataModel farmDataModel(Long id){
        return interfaceDb.farmDataModel(id);
    }

    void insertProduct(FarmDataModel farmDataModel){
        interfaceDb.save(farmDataModel);
    }
    @Transactional
    void updatePrice(Long id,String price){
        FarmDataModel productById = interfaceDb.findProductById(id);
        if (productById == null) {
            throw new ProductNotFoudnException();
        } else {
            productById.setPricePerKg(price);
            System.out.println("new price"+ price);
            interfaceDb.save(productById);
            interfaceDb.flush();
        }

    }

    public void deleteUser(Long id) {
    interfaceDb.deleteById(id);
    }
@Transactional
    public void rangeUpdate(Map<Long, String> map) {

        Set<Long> longs = map.keySet();
        for (Long aLong : longs) {
            FarmDataModel productById = interfaceDb.findProductById(aLong);

            if (productById==null){
                throw new ProductNotFoudnException();
            }else {
                productById.setPricePerKg(map.get(aLong));
                interfaceDb.save(productById);
            }

        }
    }
}
