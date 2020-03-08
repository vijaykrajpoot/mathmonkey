package org.vkrajput.mathhmonkey.service;

import java.util.LinkedList;
import java.util.List;


public class OperationData {

    private List<Integer> numberList = new LinkedList<>();
    private int sumOfNumbers;

    void addNumberToList(int number) {
        numberList.add(number);
        sumOfNumbers += number;
    }


}
