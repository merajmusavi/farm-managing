package com.example.farm.managing.store;

import com.example.farm.managing.seller.Seller;
import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity(name = "store")
@Table(
        name = "storeEnNew"
)

public class Store {


    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "name",
            nullable = false,
            unique = true)
    String name;


    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    @ManyToOne(cascade = CascadeType.ALL)
            @JoinColumn(
                    name = "seller",
                    referencedColumnName = "id",
                    foreignKey = @ForeignKey(
                            name = "seller_fk"
                    )
            )
    Seller seller;
    public Store(String name){
        this.name = name;
    }

    public Store(){

    }

    public Store(String name,Seller seller) {
        this.name = name;
        this.seller = seller;
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
}
