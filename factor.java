/*
write a program to find all factor of number
*/
import java.util.*;

public class factor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int iNo = sc.nextInt();

        System.out.println("Factors of number are as Follows");
        for (int i = 1;i<=iNo/2; i++)
        {
            if(iNo%i==0)
            {
                System.out.println(i);
            }
        }
    }
}