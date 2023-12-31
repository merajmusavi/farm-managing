package com.example.farm.managing.farm;

import com.example.farm.managing.customer.CustomerCardRepo;
import com.example.farm.managing.customer.CustomerIdEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsoleConfigure {

    @Bean
    CommandLineRunner commandLineRunner(FarmInterfaceDb farmInterfaceDb, CustomerCardRepo customerCardRepo) {

        return args -> {

            CustomerIdEntity pineApple = new CustomerIdEntity("1234567892",
                    new FarmDataModel("pine apple", "34", "34"));

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
