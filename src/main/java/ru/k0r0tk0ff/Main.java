package ru.k0r0tk0ff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.k0r0tk0ff.domain.City;
import ru.k0r0tk0ff.mapper.CityMapper;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
        findByStateTest();
    }

    void findByStateTest() {
        CityMapper cityMapper = context.getBean(CityMapper.class);
        City city = cityMapper.findByState("KRD");
        System.out.println(city);
    }
}
