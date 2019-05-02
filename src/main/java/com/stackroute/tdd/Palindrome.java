package com.stackroute.tdd;

import java.util.Scanner;

public class Palindrome {
    int sum=0;

    public int checkPalindrome(int num)
    {
        int reverse= 0, remainder, originalInteger,x;

        originalInteger = num;

        // reversed integer is stored in variable
        while( num != 0 )
        {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num  = num/10;
        }
            if(originalInteger==reverse)//checks palindrome
            {
                do {
                    x = originalInteger % 10;
                    if ((x % 2) == 0) {

                    }
                    originalInteger = originalInteger / 10;
                }while (originalInteger!=0);
            }else
                {
                }


        return (sum);
    }

    public static boolean isPalindrome(String input) {
        int n = input.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (input.charAt(i) != input.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;

    }
}
