package com.stackroute.tdd;

public class EvenOdd {

    public Boolean TomOdd() {
      /* System.out.println("Enter any number : ");
        Scanner x = new Scanner(System.in);
*/

        int num=0;

        Boolean result = true;
        if (num % 2 == 0) {
            if (num > 20 && num < 30) {
                result = true;
            } else {
                result=false;
            }
        }
        return result;
    }
}