/*
write a program to find power of number using loop
*/

import java.util.*;

public class power
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int iNo = sc.nextInt();
    System.out.print("Enter the index: ");
    int iInd = sc.nextInt();
    int iPow = 1;

    for(int i = 1;i <= iInd ;i++)
    {
        iPow = iPow*iNo;
    }

    
    System.out.println("The Power of number is: "+iPow);
    }

}