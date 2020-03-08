package org.vkrajput.math.monkey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.vkrajput.math.monkey.service.MathMonkeyService;
import org.vkrajput.math.monkey.utils.MathOperationUtils;

import java.util.Scanner;

/**
 * Hello world!
 */
@SpringBootApplication
public class MathOperationApplication implements CommandLineRunner {

    @Autowired
    private MathMonkeyService mathMonkeyService;


    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MathOperationApplication.class);
        app.run(args);
    }


    @Override
    public void run(String... args) throws Exception {

        MathOperationUtils.clearConsole();
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Enter Which Operation You want to Play :");
        System.out.println("########################################");
        System.out.println("1-ADD Two Different numbers");
        System.out.println("2-ADD Two Same Numbers");
        Scanner input = new Scanner(System.in);
        int option=input.nextInt();
        if (option == 1) {
            mathMonkeyService.addOperation();
        }
        if(option==2){
            mathMonkeyService.addSameNumberOperation();
        }

    }


}
