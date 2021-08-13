package com.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class CalcuService {
    public int sum(int number1, int number2){
        return number1 + number2;
    }

    public int sub(int number1, int number2){
        return number1 - number2;
    }

    public int multi(int number1, int number2){
        if (number1 == 0 | number2 == 0){
            return 0;
        }
        return number1 * number2;
    }

    public int div(int number1, int number2){
        if (number1 == 0 | number2 == 0){
            return 0;
        }
        return number1 / number2;
    }
}
