package me.dio;

import me.dio.domain.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import me.dio.domain.model.Account;

import java.math.BigDecimal;

public class DataLoarder {


    @Component
    public class DataLoader implements CommandLineRunner {

        private final UserRepository repository;

        public DataLoader(UserRepository repository) {
            this.repository = repository;
        }

        @Override
        public void run(String... args) {
            if (repository.count() == 0) {
                Account conta = new Account();
                conta.setNumber("000000-0");
                conta.setAgency("0001");
                conta.setHolder("Venilton");
                conta.setBalance(new BigDecimal("1000.00"));
                repository.save(conta);
            }
        }
    }
}
