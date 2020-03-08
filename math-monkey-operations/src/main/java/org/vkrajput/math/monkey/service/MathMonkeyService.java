package org.vkrajput.math.monkey.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Setter
@Getter
public class MathMonkeyService {

    @Autowired
    private MathMonkeyAddFun mathMonkeyAddFun;
    private int addElementLowerBound = 1;
    private int subtractElementLowerBound = 10;


    public void addOperation() {
        mathMonkeyAddFun.startMathAddFunc();

    }

    public void addSameNumberOperation() {
        mathMonkeyAddFun.startMathSameNumberFun();

    }

    void addNumbers(List<Integer> numberList) {
        numberList.forEach(number -> {
            new OperationData().addNumberToList(number);
        });

    }


}
