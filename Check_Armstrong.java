/*write a program to check whether number is Armstron or not
*/
import java.io.*;

public class Check_Armstrong
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

        int itemp = iNo;
        int iCnt = 0;
        int iSum = 0;
        int iLast = 0;
        int iPow = 1;
        while(itemp!=0)
        {
            itemp = itemp/10;
            iCnt++;
        }

        itemp=iNo;

        while(itemp!=0)
        {
            iPow = 1;
            iLast = itemp%10;
            for(int i = 1;i<=iCnt;i++)
            {
                iPow = iPow*iLast;
            }
            iSum = iSum+iPow;
            itemp = itemp/10;
        }

        if(iSum == iNo)
        {
            System.out.println(iNo+" is Armstrong");
        }
        else
        {
            System.out.println(iNo+" is not Armstrong");
        }

    }
}