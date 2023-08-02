/*Write a C program to input a number and calculate sum of digits using for loop. How to find sum of digits of a number in C program. Logic to find sum of digits of a given number in C programming.

Input any number: 1234
Output
Sum of digits: 10
*/
import java.io.*;
import java.util.*;


public class sum_of_digits
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        int iSum  = 0;
        int iNo = 0;

        System.out.print("Enter the number: ");
        iNo = sc.nextInt();

        while(iNo>0)
        {
            iSum = iSum+(iNo%10);
            iNo = iNo/10;
        }

        System.out.println("Sum of didgit is :"+iSum);

         
    }
}