/*

Description

Write a java program that takes in a number N and finds the smallest palindrome prime greater than or equal to N. This should be done by creating two methods, one to check if the number is
prime and one to check if the number is a palindrome.

Sample Input 1

8
Sample Output 1

The next prime palindrome is 11 

*/

import java.util.Scanner;

public class PrimePalindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int prime = sc.nextInt();

        boolean num = isPrime(prime);

        while(num == false)
        {
            prime++;
            num = isPrime(prime);
        }

        String str = Integer.toString(prime);
        boolean result = isPalindrome(str);

        while(result == false)
        {
            prime++;
            num = isPrime(prime);

            if(num == true)
            {
                str = Integer.toString(prime);
                result = isPalindrome(str);
            }
        }

        System.out.println("The next prime palindrome is " + prime);
    }

    public static boolean isPrime(int prime)
    {
        int count = 0;

        for(int i = 1; i <= prime; i++)
        {
            if(prime % i == 0)
            {
                count++;
            }
        }

        if(count > 2)
        {
            //System.out.println(prime + " is NOT a Prime number");
            return false;
        }
        else
        {
            //System.out.println(prime + " is a Prime number");
            return true;
        }
    }

    public static boolean isPalindrome(String s)
    {
        s = s.toUpperCase();
        String reversed = new String("");

        for(int i = s.length()-1; i >= 0; i--)
        {
            char charAtI = s.charAt(i);
            reversed = reversed + charAtI;
        }

        if(s.equals(reversed))
        {
            //System.out.println(s + " is a Palindrome");
            return true;
        }
        else
        {
            //System.out.println(s + " is NOT a Palindrome");
            return false;
        }
    }
}
