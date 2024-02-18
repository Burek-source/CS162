/* 

Week 1

The deadline for this question is February 21st 2024 at 23:59 

Perfect Numbers

Write a program that determines whether or not a number is a perfect number. A perfect number is a number that can be written as a sum of its factors, excluding itself. 
For example: 6 is a perfect number since 1+ 2+ 3 = 6, where 1, 2, and 3 are all factors of 6 

Sample Input 1

num = 6

Sample Output 1

6 is a perfect number

Sample Input 2

num = 34

Sample Output 2

34 is not a perfect number

*/

import java.util.Scanner;

public class Perfect 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 1;

        for(int i = 2; i < num; i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
        }

        if(sum == num)
        {
            System.out.println(num + " is a perfect number");
        }
        else
        {
            System.out.println(num + " is not a perfect number");
        }
    }
}
