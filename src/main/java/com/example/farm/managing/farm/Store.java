package com.example.farm.managing.farm;


import com.example.farm.managing.customer.CustomerIdEntity;
import jakarta.persistence.*;

@Entity(name = "Store")
@Table(name = "store")
public class Store {


    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    @Column(
            name = "store_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    String store_name;




    @ManyToOne
            @JoinColumn(
                    name = "customerIdEntity",
                    nullable = false,
                    referencedColumnName = "id",
                    foreignKey = @ForeignKey(
                            name = "store"
                    )
            )
    CustomerIdEntity customerIdEntity;

    public Store(){

    }

    public Store(Long id, String store_name, CustomerIdEntity customerIdEntity) {
        this.id = id;
        this.store_name = store_name;
        this.customerIdEntity = customerIdEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public CustomerIdEntity getCustomerIdEntity() {
        return customerIdEntity;
    }

    public void setCustomerIdEntity(CustomerIdEntity customerIdEntity) {
        this.customerIdEntity = customerIdEntity;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", store_name='" + store_name + '\'' +
                ", customerIdEntity=" + customerIdEntity +
                '}';
    }
}
