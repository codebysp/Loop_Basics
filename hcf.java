/*
write a program to find hcf(GCD) of two number
*/
import java.util.*;

public class hcf
{                    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int iNo1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int iNo2 = sc.nextInt();
        int iMin = 0;
        int iHcf = 1;
        
       iMin=(iNo1>iNo2)?iNo2:iNo1;

        for(int i =1;i<=iMin;i++)
        {
            if(iNo1%i==0&&iNo2%i==0)
            {
                iHcf = i;
            }
        }

        System.out.println("Highest Commen Factor of(GCD) "+iNo1+" & "+iNo2+" is "+iHcf);
    }
}