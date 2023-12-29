package com.example.farm.managing.farm;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FarmInterfaceDb extends JpaRepository<FarmDataModel,Long> {

    @Query("SELECT f FROM farmnew f WHERE f.id = ?1 ")
    FarmDataModel farmDataModel(Long id);
    @Query("SELECT f FROM farmnew f")
    List<FarmDataModel> all();

    @Query("SELECT p from farmnew p WHERE p.id = ?1")
    FarmDataModel findProductById(Long id);

    @Transactional
    @Modifying
    @Query("DELETE FROM farmnew p WHERE p.id = ?1")
    void deleteProductById(Long id);

}
