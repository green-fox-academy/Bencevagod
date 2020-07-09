package com.greenfox.dependency_injection;

import com.greenfox.dependency_injection.hello_bean_world.Service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionApplication implements CommandLineRunner {

    private Printer printer;

    @Autowired
    public DependencyInjectionApplication(Printer printer) {
        this.printer = printer;
        printer.log("vazze");
    }

    public static void main(String[] args) {
        SpringApplication.run(DependencyInjectionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
