package com.example.farm.managing.seller;

import com.example.farm.managing.store.Store;
import jakarta.persistence.*;

@Entity(name = "sellerEntity")
@Table(name = "sellerNew")
public class Seller {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;

public Seller(){

}


    public Seller(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
