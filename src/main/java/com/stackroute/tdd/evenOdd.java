package com.stackroute.tdd;

public class evenOdd {

    int number = 0;
    Boolean result = true;


    public Boolean tomOdd() {

        if (number % 2 == 0) {
            if (number > 20 && number < 30) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public Boolean checkFloat() {

        if (number == Math.round(number)) {
            return result;
        } else{
            return result;
        }
    }
}