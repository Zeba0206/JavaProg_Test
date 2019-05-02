package com.company;

import java.util.Scanner;

public class IntegerAdd {
    public static void main(String args[])
    {
        int i=0;

        System.out.println("Enter Number: ");
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();
        int a[]=new int[n];
        int sum=0;

        System.out.println("Enter elements of array: ");




        for(i=0; i<n; i++)
        {
            a[i]=s.nextInt();
        }

        for(i=0; i<a.length; i++)
        {
            sum=sum + a[i];
        }
        if (a[i] == (int)a[i])
        {
            System.out.println(sum);
        }else{}

    }
}
