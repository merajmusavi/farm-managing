package com.example.farm.managing.customer;

import com.example.farm.managing.farm.FarmDataModel;
import jakarta.persistence.*;

@Entity(name = "customerIdCard")
@Table(name = "customer_id_card",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "customer_unique", columnNames = "card_number"
                )
        }
)
public class CustomerIdEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "id",
            nullable = false,
            unique = true
    )
    private Long id;


    @Column(
            name = "card_number",
            nullable = false,
            length = 10

    )
    private String cardNumber;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "farm_data_id",
            referencedColumnName = "id"
    )

    FarmDataModel farmDataModel;
    public CustomerIdEntity(){}

    public CustomerIdEntity(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CustomerIdEntity(String cardNumber,FarmDataModel farmDataModel){
        this.farmDataModel = farmDataModel;
        this.cardNumber = cardNumber;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
