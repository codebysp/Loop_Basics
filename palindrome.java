/*
Write a C program to input number from user and check number is palindrome or not using loop. How to check whether a number is palindrome or not using loop in C programming. Logic to check palindrome number in C programming.

Input any number: 121
Output
121 is palindrome
*/
import java.util.*;

public class palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int iNo = sc.nextInt();
        int iLast = 0;
        int iReverse = 0;
        int iTemp = iNo;

        while(iNo>0)
        {
            iLast = iNo%10;
            iReverse = iReverse*10;
            iReverse = iReverse+iLast;
            iNo = iNo/10;
        }

        if(iReverse==iTemp)
        {
            System.out.println(iTemp+" is Palindrome");
        }
        else
        {
            System.out.println(iTemp+" is not palindrome");
        }
    }
}