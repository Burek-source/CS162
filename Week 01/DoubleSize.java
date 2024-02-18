/*

Description

Write a static method called determineSize() that accepts two doubles. The method should print a message to the screen that states which number is the smallest, which is the biggest 
or that they are the same number. Test the method by calling it from the main method using user input. 

Sample Input 1

3.5
9.8

Sample Output 1

Largest = 9.8
Smallest = 3.5

Sample Input 2

3.5
3.5
Sample Output 2

Numbers are the same. 

*/

import java.util.Scanner;

public class DoubleSize 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        determineSize(num1, num2);
    }

    public static void determineSize(double num1, double num2)
    {
        if(num1 < num2)
        {
            System.out.println("Largest = " + num2);
            System.out.println("Largest = " + num1);
        }
        else if(num2 < num1)
        {
            System.out.println("Largest = " + num1);
            System.out.println("Largest = " + num2);
        }
        else
        {
            System.out.println("Numbers are the same");
            
        }
    }
}
