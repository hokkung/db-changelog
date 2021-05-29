package com.example.dbchangelog;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class DbChangelogApplication implements ApplicationRunner {

    /**
     * Main entry.
     *
     * @param args
     *      arguments
     */
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DbChangelogApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
    }
}
