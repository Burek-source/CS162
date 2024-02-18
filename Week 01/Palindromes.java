/*

Description

In a java program, write a method called isPalindrome() that accepts a String parameter and returns a Boolean. This method should check if the String is a Palindrome and return 
an appropriate boolean value. Your method should work irrespective of case. In the main method, you should call the method with a user inputted String being passed into isPalindrome().

Sample Input 1

NaVAn
Sample Output 1

NAVAN is a Palindrome

Sample Input 2

Cavan

Sample Output 2

Cavan is NOT a Palindrome 

*/

import java.util.Scanner;

public class Palindromes 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean result = isPalindrome(str);
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
            System.out.println(s + " is a Palindrome");
            return true;
        }
        else
        {
            System.out.println(s + " is NOT a Palindrome");
            return false;
        }
    }
}
