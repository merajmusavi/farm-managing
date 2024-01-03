package com.example.farm.managing.farm;

import com.example.farm.managing.customer.CustomerCardRepo;
import com.example.farm.managing.customer.CustomerIdEntity;
import com.example.farm.managing.seller.Seller;
import com.example.farm.managing.seller.SellerRep;
import com.example.farm.managing.store.Store;
import com.example.farm.managing.store.StoreRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsoleConfigure {

    @Bean
    CommandLineRunner commandLineRunner(FarmInterfaceDb farmInterfaceDb, CustomerCardRepo customerCardRepo, SellerRep sellerRep, StoreRepo storeRepo) {

        return args -> {

            CustomerIdEntity pineApple = new CustomerIdEntity("1234567892",
                    new FarmDataModel("pine apple", "34", "34"));

            Seller ahmad = new Seller("ahmad");

            ahmad.addStore(new Store("ofogh kourosh"));


            sellerRep.save(ahmad);
            System.out.println(sellerRep.findById(1L));
//            Faker faker = new Faker();
//
//            for (int i = 0; i < 1001; i++) {
//                String product = String.valueOf(faker.food().fruit());
//                String amount = String.valueOf(faker.number().numberBetween(1,100));
//                String price = String.valueOf(faker.number().numberBetween(2000,10000));
//
//                farmInterfaceDb.save(new FarmDataModel(
//                        product,price,amount
//                ));


            //         }
        };
    }

}
