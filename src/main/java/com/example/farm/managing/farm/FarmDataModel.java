package com.example.farm.managing.farm;

import jakarta.persistence.*;

@Entity(name = "farmnew")
@Table(
        name = "farmnew"
)

public class FarmDataModel {
    public FarmDataModel(){

    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(
                    name = "id",
                    nullable = false,
                    unique = true
            )
    Long id;

    @Column(
            name = "product",
            columnDefinition = "TEXT"
    )
    String product;
    @Column(name = "price", columnDefinition = "TEXT")
    String pricePerKg;
    @Column(
            name = "amount_per_kg",
            columnDefinition = "TEXT"
    )

    String amountPerKg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(String pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public String getAmountPerKg() {
        return amountPerKg;
    }

    public void setAmountPerKg(String amountPerKg) {
        this.amountPerKg = amountPerKg;
    }

    public FarmDataModel( String product, String pricePerKg, String amountPerKg) {
        this.product = product;
        this.pricePerKg = pricePerKg;
        this.amountPerKg = amountPerKg;
    }

    @Override
    public String toString() {
        return "FarmDataModel{" +
                "id=" + id +
                ", product='" + product + '\'' +
                ", pricePerKg='" + pricePerKg + '\'' +
                ", amountPerKg='" + amountPerKg + '\'' +
                '}';
    }
}
