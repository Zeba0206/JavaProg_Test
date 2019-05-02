package com.company;

import java.util.Scanner;

class RepeatChar{
    void Repeat(){
        Scanner s1=new Scanner(System.in);

        System.out.print("Enter String : ");
        String str1=s1.nextLine();

        System.out.print("Enter number : ");
        int n = s1.nextInt();

        String str2=str1.substring(n);

        System.out.print(str1);

        while(n!=0){
            System.out.print(str2);
            n--;
        }

    }
}

public class StringRepeat {
    public static void main(String[] args){

        RepeatChar r=new RepeatChar();
        r.Repeat();
    }


}

