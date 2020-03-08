package org.vkrajput.math.monkey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.vkrajput.math.monkey.service.MathMonkeyService;
import org.vkrajput.math.monkey.utils.Cursor;
import org.vkrajput.math.monkey.utils.MathOperationUtils;

import java.io.Console;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Main Class to start the process
 *
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
        Console console = System.console();
        MathOperationUtils.clearConsole();
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Enter Which Operation You want to Play :");
        System.out.println("########################################");
        System.out.println("1 - ADD Two Different numbers");
        System.out.println("2 - ADD Two Same Numbers");
        System.out.println("X - Exit");
        List<String> optionsList = Arrays.asList(new String[]{"1", "2", "X"});

        while (true) {
            String strNum = console.readLine("Enter Valid Option [ 1, 2 or X ]: ");
            if (strNum == null || strNum.isEmpty() || !optionsList.contains(strNum.toUpperCase())) {
                System.out.println("[" + strNum + "] is not a valid input. ");
                System.out.println(Cursor.MOVE_UP_2);
                continue;
            }
            if (strNum.equalsIgnoreCase("X")) {
                MathOperationUtils.printEmptyLines(2);
                System.out.println("Thanks!!! Hope you have fun. Bye - Bye....");
                System.out.println("_______________________________________________");
                MathOperationUtils.printEmptyLines(1);
                System.exit(0);
            } else if (strNum.equalsIgnoreCase("1")) {
                mathMonkeyService.addOperation();
            } else if (strNum.equalsIgnoreCase("2")) {
                mathMonkeyService.addSameNumberOperation();
            }
        }
    }
}
