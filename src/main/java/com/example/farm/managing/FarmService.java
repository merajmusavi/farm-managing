package com.example.farm.managing;

import org.springframework.stereotype.Service;

import java.util.List;

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
}
