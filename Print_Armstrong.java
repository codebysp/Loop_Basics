/*
Print all Armstrong number between 1 to n
*/
import java.io.*;

public class Print_Armstrong
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
            int itemp = i;
            int iCnt = 0;
            int iSum = 0;
            int iLast = 0;
            int iPow = 1;

            while(itemp!=0)
            {
                itemp = itemp/10;
                iCnt++;
            }

            itemp=i;

            while(itemp!=0)
            {
                iPow = 1;
                iLast = itemp%10;
                for(int j = 1;j<=iCnt;j++)
                {
                    iPow = iPow*iLast;
                }
                iSum = iSum+iPow;
                itemp = itemp/10;
            }

            if(iSum == i)
            {
                System.out.println(i);
            }

        }
    }
}