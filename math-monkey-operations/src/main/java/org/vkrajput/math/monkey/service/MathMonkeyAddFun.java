package org.vkrajput.math.monkey.service;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Component;

import java.io.Console;

@Component
public class MathMonkeyAddFun {

    Console input = System.console();
    StringBuilder stringBuilder = new StringBuilder();

    void startMathAddFunc() {
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            int num1 = RandomUtils.nextInt(1, 10);
            int num2 = RandomUtils.nextInt(1, 10);
            show(stringBuilder, num1, num2);
        }

    }


    void startMathSameNumberFun() {
        while (true) {
            int num = RandomUtils.nextInt(1, 10);
            show(stringBuilder, num, num);
        }

    }

    private int getValidInput() {
        while (true) {
            String answer = input.readLine();
            try {
                return Integer.parseInt(answer);
            } catch (Exception ex) {
                continue;
            }
        }

    }

    private void show(StringBuilder stringBuilder, int num1, int num2) {
        stringBuilder.append(num1).append("\t").append("+").append("\t").append(num2).append("\t").append("=").append("\t");
        System.out.print(stringBuilder.toString());
        int answer = getValidInput();
        if (num1 + num2 == answer) {
            System.out.print("    ==>Good Job!!!");
        } else {
            System.err.print("    ==>Ahhhh :-(");
        }
        System.out.println();
        System.out.println();
        stringBuilder.setLength(0);
    }
}
