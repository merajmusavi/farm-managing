package com.example.farm.managing.seller;

import com.example.farm.managing.store.Store;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "sellerEntity")
@Table(name = "sellerNew")
public class Seller {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;

    @OneToMany(mappedBy = "seller",
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    List<Store> list = new ArrayList<>();

    public Seller() {

    }


    public void AddStore(Store store){
        if (!list.contains(store)){
            list.add(store);
            store.setSeller(this);
        }
    }

    public void removeStore(Store store){
        if (list.contains(store)){
            list.remove(store);
            store.setSeller(null);
        }
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
