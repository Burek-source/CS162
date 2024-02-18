/*

Description

Write a java program called Primes. This program should contain a method called isPrime() that accepts an integer parameter and returns a boolean value. 
This method should check if the integer is a prime number or not and return an appropriate boolean value. The main method should call the isPrime() method and print an appropriate messge to the screen.

Sample Input 1

12
Sample Output 1

12 is NOT a Prime number

Sample Input 2

13

Sample Output 2

13 is a Prime number 

*/

import java.util.Scanner;

public class Primes 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int prime = sc.nextInt();

        boolean num = isPrime(prime);
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
            System.out.println(prime + " is NOT a Prime number");
            return false;
        }
        else
        {
            System.out.println(prime + " is a Prime number");
            return true;
        }
    }
}
