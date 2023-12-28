package com.example.farm.managing;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsoleConfigure {

    @Bean
    CommandLineRunner commandLineRunner(FarmInterfaceDb farmInterfaceDb) {
        return args -> {
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
