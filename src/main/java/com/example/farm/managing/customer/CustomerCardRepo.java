package com.example.farm.managing.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CustomerCardRepo extends JpaRepository<CustomerIdEntity,Long> {

    @Query("SELECT c.cardNumber FROM customerIdCard c where c.farmDataModel.id = ?1")
    Optional<String> customerIdEntity(Long id);



}
