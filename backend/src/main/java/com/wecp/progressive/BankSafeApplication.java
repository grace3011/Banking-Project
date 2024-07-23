package com.wecp.progressive;
<<<<<<< HEAD

public class BankSafeApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to BankSafe Project!");
    }
}
=======
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
 
@SpringBootApplication
@EnableJpaRepositories
public class BankSafeApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to BankSafe Project!");
        SpringApplication.run(BankSafeApplication.class, args);
    }
}
>>>>>>> b59c1594ec22c506fd61e577027a81b044d1a42f
