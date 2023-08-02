/*Write a C program to input a number and find sum of first and last digit of the number using for loop. How to find sum of first and last digit of a number in C programming using loop. Logic to find sum of first and last digit of a number without using loop in C program.

Input number: 12345
Output
Sum of first and last digit: 6
*/
import java.util.*;

public class Program3
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

        System.out.println("sum of first and last digit "+(iFirst+iLast));
    }
}