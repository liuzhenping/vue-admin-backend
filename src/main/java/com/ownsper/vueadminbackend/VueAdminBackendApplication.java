package com.ownsper.vueadminbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class VueAdminBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueAdminBackendApplication.class, args);
    }

}
