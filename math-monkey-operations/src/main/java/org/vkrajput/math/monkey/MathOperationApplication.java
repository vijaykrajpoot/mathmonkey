package org.vkrajput.math.monkey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.vkrajput.math.monkey.service.MathMonkeyService;
import org.vkrajput.math.monkey.utils.MathOperationUtils;

import java.io.Console;
import java.util.Arrays;
import java.util.List;

import static org.vkrajput.math.monkey.utils.MathOperationUtils.*;

/**
 * Main Class to start the process
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
        int row = 10;
        StringBuilder stringBuilder = new StringBuilder();
        int col = 30;
        cursorToWithMessage(row++, col, ("Enter Which Operation You want to Play :"));
        cursorToWithMessage(row++, col, ("______________________________________"));
        cursorToWithMessage(row++, col, ("1 - ADD Two Different numbers"));
        cursorToWithMessage(row++, col, ("2 - ADD Two Same Numbers"));
        cursorToWithMessage(row++, col, ("X - Exit"));
        cursorToWithMessage(row++, col, ("______________________________________"));
        cursorToWithMessage(row++, col, ("Enter Valid Option [ 1, 2 or X ]: "));
        List<String> optionsList = Arrays.asList(new String[]{"1", "2", "X"});

        while (true) {
            String strNum = console.readLine();
            if (strNum == null || strNum.isEmpty() || !optionsList.contains(strNum.toUpperCase())) {
                cursorToWithMessage(row + 1, col, "[" + strNum + "] is not a valid input. ");
                cursorTo(--row, "Enter Valid Option [ 1, 2 or X ]: ".length() + col);
                row++;
                continue;
            }
            if (strNum.equalsIgnoreCase("X")) {
                printEmptyLines(2);
                cursorToWithMessage(row++, col, "Thanks!!! Hope you have fun. Bye - Bye....");
                cursorToWithMessage(row++, col, "_______________________________________________");
                printEmptyLines(1);
                System.exit(0);
            } else if (strNum.equalsIgnoreCase("1")) {
                cursorToWithMessage(row++, col, "Here you go! Start having Funnnnnn");
                cursorToWithMessage(row++, col, "_______________________________________________");
                mathMonkeyService.addOperation();
            } else if (strNum.equalsIgnoreCase("2")) {
                cursorToWithMessage(row++, col, "Here you go! Start having Funnnnnn");
                cursorToWithMessage(row++, col, "_______________________________________________");
                mathMonkeyService.addSameNumberOperation();
            }
        }
    }
}
