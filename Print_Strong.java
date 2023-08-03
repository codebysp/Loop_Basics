/*
write a program to print all strong number from 1 to n
*/


import java.io.*;

public class Print_Strong
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

        for(int i = 1;i<=iNo;i++)
        {
            int iTemp = i;
            int iSum = 0;

            while(iTemp!=0)
            {
                int iFact = 1;
                int iLast = iTemp%10;
                for(int j = 1;j <= iLast;j++)
                {
                    iFact = iFact*j;
                }
                    iSum = iSum+iFact;
                    iTemp = iTemp/10;
            }

            if(iSum == i)
            {
                System.out.println(i);
            }
        }
    }
}