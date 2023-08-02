/*Write a C program to input a number from user and count number of digits in the given integer using loop. How to find total digits in a given integer using loop in C programming. Logic to count digits in a given integer without using loop in C program.

Input num: 35419
Output
Number of digits: 5
Input a number from user. Store it in some variable say num.
Initialize another variable to store total digits say digit = 0.
If num > 0 then increment count by 1 i.e. count++.
Divide num by 10 to remove last digit of the given number i.e. num = num / 10.
Repeat step 3 to 4 till num > 0 or num != 0.
*/
import java.util.*;

public class digit_count
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int iNo = sc.nextInt();

        int iCnt = 0;
        while(iNo>0)
        {
            iNo=iNo/10;
            iCnt++;
        }
        
        System.out.println("Number of digit is "+iCnt);

    }
}