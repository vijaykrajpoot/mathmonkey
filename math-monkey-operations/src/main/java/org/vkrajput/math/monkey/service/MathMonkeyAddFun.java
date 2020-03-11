package org.vkrajput.math.monkey.service;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Component;

import java.io.Console;

import static org.vkrajput.math.monkey.utils.MathOperationUtils.*;


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

    private void show(StringBuilder stringBuilder, int num1, int num2) {
        clearTheLine(15);
        String str = stringBuilder.append(num1).append(" ").append("+").append(" ").append(num2).append(" ").append("=").append(" ").toString();
        cursorToWithMessage(15, 50, stringBuilder.toString());
        int answer = getValidInputAt(15, 50 + str.length() + 2);
        clearTheLine(36);
        cursorToWithMessage(15, str.length() + 4, "" + answer);
        if (num1 + num2 == answer) {
            cursorToWithMessage(36, 60, "Good Job - \uD83D\uDE0A");
        } else {
            cursorToWithMessage(36, 60, "Ahhh \uD83D\uDE44");
        }
        stringBuilder.setLength(0);
    }
}
