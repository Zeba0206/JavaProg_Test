package com.company;

import java.util.Scanner;

public class ConsoVowel
{
    public static void main(String args[])
    {
        System.out.println("Enter a Word :");

        Scanner scan = new Scanner(System.in);
        String s =scan.nextLine();

        int l=s.length();

        for(int i=0; i<=l;i++)
        {
          char ch=s.charAt(i);

            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'&& ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U')
            {
                System.out.println(ch+ " Given character is an vowel");
            }
            else if (Character.isDigit(ch))
            {
                System.out.println("Error: please enter characters only");

            }
            else
                {
                System.out.println(ch+ " Given character is a consonant");
                }
        }


    }
}