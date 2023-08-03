/*
write a program to check whether a number is prime number or not
*/
import java.util.*;
import java.io.*;

public class Check_Prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean iPrime = false;
        System.out.print("Enter Number: ");
        int iNo = sc.nextInt();
        if(iNo<=0)
        {
            System.out.println("Please Enter Vaild Positive integer");
            System.exit(-1);
        }
        for(int i = 2;i<iNo/2;i++)
        {
            if(iNo%i==0)
            {
                iPrime=true;
                break;
            }

        }
        if(iPrime == false)
        {
            System.out.println(iNo+" is Prime");
        }
        else
        {
            System.out.println(iNo+" is not Prime");
        }
        

    }
}