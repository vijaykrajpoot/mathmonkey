package org.vkrajput.mathhmonkey;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

/**
 * Hello world!
 */
public class MathOperationApplication  implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello");
    }

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(MathOperationApplication.class);
        app.run(args);

    }
}
