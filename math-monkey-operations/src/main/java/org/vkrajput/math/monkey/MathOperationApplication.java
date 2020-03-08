package org.vkrajput.math.monkey;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.vkrajput.mathhmonkey.service.MathMonkeyService;

import java.util.Scanner;

/**
 * Hello world!
 */
public class MathOperationApplication implements CommandLineRunner {

    @Autowired
    private MathMonkeyService mathMonkeyService;

    Scanner input= new Scanner(System.in);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MathOperationApplication.class);
        app.run(args);
    }


    @Override
    public void run(String... args) throws Exception {


        this.clearConsole();
        System.out.println("Enter Which Operation You want to Play :");
        System.out.println("1. ADD");
        System.out.println("1. SUBTRACTED");
        if(input.nextInt()==1){
            int num1=RandomUtils.nextInt(1,10);
            int num2=RandomUtils.nextInt(1,10);
            System.out.println(num1 +"+"+num2 +"= " );
            int answer= input.nextInt();
            if(num1+num2==answer){
                System.out.println("Good Job!!!");
            }
        }





    }

    public final static void clearConsole() throws InterruptedException {
        System.out.println("#### cleaning the screen....");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
