package org.vkrajput.math.monkey.utils;

public class MathOperationUtils {


    public final static void clearConsole() throws InterruptedException {
        System.out.println("#### cleaning the screen....");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
