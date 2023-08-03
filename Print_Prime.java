/*
write a program to print all prime number from 1 to n
*/
import java.io.*;

public class Print_Prime
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int iNo = Integer.parseInt(br.readLine());
        if(iNo<=0)
        {
            System.out.println("Please Enter Vaild Positive integer");
            System.exit(-1);
        }
        for(int i = 1;i<=iNo;i++)
        {
            boolean iPrime = true;
            for(int  j = 2;j<i;j++)
            {
                if(i%j==0)
                {
                    iPrime = false;
                    break;
                }
            }
            
            if(iPrime==true)
            {
                System.out.println(i);
            }
        }
    }
}