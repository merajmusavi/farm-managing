package com.example.farm.managing;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FarmInterfaceDb extends JpaRepository<FarmDataModel,Long> {

    @Query("SELECT f FROM farmnew f WHERE f.id = ?1 ")
    FarmDataModel farmDataModel(Long id);
    @Query("SELECT f FROM farmnew f")
    List<FarmDataModel> all();

    @Query("SELECT p from farmnew p WHERE p.id = ?1")
    FarmDataModel findProductById(Long id);

}
