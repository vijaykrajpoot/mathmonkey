package org.vkrajput.math.monkey.utils;

public class MathOperationUtils {


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

    public static void cursorTo(int x, int y) {
        char escCode = 0x1B;
        System.out.print(String.format("%c[%d;%df",escCode,x,y));

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
