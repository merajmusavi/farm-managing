package com.example.farm.managing.customer;

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


}
