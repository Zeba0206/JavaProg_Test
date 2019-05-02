package com.company;

import java.util.Scanner;

public class NthIteration {

    public static void main(String[] args) {


        System.out.println("Enter value for n : ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();


        for (int i = 1; i <=num; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i + " ");
            }

        }


    }
}
