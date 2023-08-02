/*
Write a C program to input a number from user and find first and last digit of number using loop. How to find first and last digit of a number in C programming. Logic to find first and last digit of a given number without using loop in C program
Input number: 1234
Output
First digit: 1
Last digit: 4
*/
import java.util.*;

public class First_last_Digit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int iNo = sc.nextInt();

        int iFirst = 0;
        int iLast = iNo%10;
        int iTemp = iNo;

        while(iTemp>10)
        {
            iTemp = iTemp/10;
        }

        iFirst = iTemp;

        System.out.println("First digit: "+iFirst);
        System.out.println("Last digit: "+iLast);

    }
}