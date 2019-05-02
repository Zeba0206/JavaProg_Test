package com.stackroute.tdd;

import java.util.Objects;
import java.util.Scanner;

public class ReverseString {

    String str = "zeba";
    char str1;

    String reverseStr() {
        String rev = "";
       /* System.out.println("Enter String: ");
        Scanner s = new Scanner(System.in);*/

        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        return rev;

    }

    public boolean checkNull() {

        if (str.equals(" ")) {
            return false;
        } else {
            return true;
        }


    /*public static void main(String args[])
    {
        ReverseString.reverseStr();
    }*/
    }

    public Boolean checkSpaces() {
        if (Objects.equals(str1, "_")){
            return false;
        }else{
            return true;
        }
    }
}
