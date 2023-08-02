/*
write a program to find factorial of the number
*/
import java.util.*;

public class factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int iNo = sc.nextInt();
        if(iNo<=0)
        {
            System.out.println("Please Enter Positive Value");

        }

        int iFact = iNo;

        for(int i = 1;i<iNo;i++)
        {
            iFact = iFact*i;
        }

        System.out.println("Factorial for following number is: "+iFact);
    }
}