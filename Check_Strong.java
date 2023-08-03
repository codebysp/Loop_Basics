/*
write a program to check whether number is strong or not
*/

import java.io.*;

public class Check_Strong
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number: ");
        int iNo = Integer.parseInt(br.readLine());
        if(iNo<=0)
        {
            System.out.println("Please Enter Vaild Positive integer");
            System.exit(-1);
        }

        int iTemp = iNo;
        int iSum = 0;
        while(iTemp!=0)
        {
            int iFact = 1;
            int iLast = iTemp%10;
            for(int i = 1;i<=iLast;i++)
            {
                iFact = iFact*i;
            }
            iSum = iSum+iFact;
            iTemp = iTemp/10;
        }

        if(iSum == iNo)
        {
            System.out.println(iNo+" is Strong");
        }
        else
        {
            System.out.println(iNo+" is not Strong");
        }
    }
}