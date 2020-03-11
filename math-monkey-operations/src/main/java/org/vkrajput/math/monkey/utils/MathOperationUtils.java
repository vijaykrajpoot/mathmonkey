package org.vkrajput.math.monkey.utils;


import java.io.Console;
import java.util.Arrays;
import java.util.List;

public class MathOperationUtils {
    private static Console input = System.console();
    private static List<String> optionsList = Arrays.asList(new String[]{"yes", "y"});

    public final static void clearConsole() throws InterruptedException {
        System.out.println("#### cleaning the screen....");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void printEmptyLines(int numOfLines) {
        for (int i = 0; i < numOfLines; i++) {
            System.out.println();
        }
    }

    public static int getValidInput() {
        while (true) {
            String answer = input.readLine();
            if (answer.equalsIgnoreCase("x")) {
                System.out.println("Are you sure you want to exit(Yes/No)? : \r");
                cursorTo(11, "Are you sure you want to exit(Yes/No)? : ".length());
                if (optionsList.contains(input.readLine().toLowerCase())) {
                    System.out.println("Thanks!!! Hope you have fun. Bye - Bye....");
                    System.out.println("_______________________________________________");
                    printEmptyLines(1);
                    System.exit(0);
                }
            }
            try {
                return Integer.parseInt(answer);
            } catch (Exception ex) {
                continue;
            }
        }
    }

    public static void cursorTo(int x, int y) {
        char escCode = 0x1B;
        System.out.print(String.format("%c[%d;%df", escCode, x, y));

//        if (x > 0) {
//            String MOVE_RIGHT = "\033[" + x + "C";
//            System.out.println(MOVE_RIGHT);
//        }
//        if (y > 0) {
//            String MOVE_UP = "\033[" + y + "A";
//            System.out.println(MOVE_UP);
//        }
        // String MOVE_UP_2="\033[3A";
    }
}
