/*
Write a C program to input a number from user and find reverse of the given number using for loop. How to find reverse of any number using loop in C program. Logic to find reverse of a number in C programming.

Input number: 12345
Output
Reverse of 12345 = 54321
Step by step descriptive logic to find reverse of a number.

Input a number from user to find reverse. Store it in some variable say num.
Declare and initialize another variable to store reverse of num, say reverse = 0.
Extract last digit of the given number by performing modulo division. Store the last digit to some variable say lastDigit = num % 10.
Increase the place value of reverse by one. To increase place value multiply reverse variable by 10 i.e. reverse = reverse * 10.
Add lastDigit to reverse i.e. reverse = reverse + lastDigit.
Since last digit of num is processed hence, remove last digit of num. To remove last digit divide num by 10 i.e. num = num / 10.
Repeat step 3 to 6 till num is not equal to (or greater than) zero.
Let us implement the above logic in C program.
*/
import java.util.*;

public class reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int iNo = sc.nextInt();
        int iLast = 0;
        int iReverse = 0;

        while(iNo>0)
        {
            iLast = iNo%10;
            iReverse = iReverse*10;
            iReverse = iReverse+iLast;
            iNo = iNo/10;
        }

        System.out.println("Reverse of "+iNo+"is "+iReverse);

         
    }
}