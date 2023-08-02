/* write a program to print all natural number fro 1 to n*/

import java.util.*;


public class Program1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int N;
        System.out.println("Enter the Number");
        N  = in.nextInt();

        System.out.println("Natural number from 1 to "+N+" is");
        for(int i = 1; i<=N; i++)
        {
            System.out.println(i);
        }
    }
}