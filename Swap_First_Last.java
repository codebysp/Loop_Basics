/*
Write a C program to input a number from user and swap first and last digit of the given number. How to swap first and last digits of a number in C programming. Logic to swap first and last digit of a number in C program.
Input
Input any number: 12345
Output
Number after swapping first and last digit: 52341
Logic to swap first and last digit of a number
Begin:
    read(num)
    lastDigit ← num % 10;
    digits ← log10(num);
    firstDigit ← num / pow(10, digits);
    
    swappedNum ← lastDigit * pow(10, digits);
    swappedNum ← swappedNum + num % pow(10, digits);
    swappedNum ← swappedNum - lastDigit;
    swappedNum ← swappedNum + firstDigit;
End
*/
import java.util.*;
import java.lang.math.*;

public class Swap_First_Last
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int iNo = sc.nextInt();

        int swappedNum = 0;
        int iTemp = iNo;
        int iLast = iNo%10;
        int iDigit = log10(iNo);
        int iFirst = iNo/pow(10,iDigit);

        swappedNum = iLast*pow(10,iDigit);
        swappedNum = swappedNum+iNo%pow(10,iDigit);
        swappedNum = swappedNum-iLast;
        swappedNum = swappedNum+iFirst;

        System.out.println("number after swapping first and last digit is: "+swappedNum);

    }
}
