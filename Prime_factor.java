/*
write a program to print all prime factor of a number
*/
import java.io.*;

public class Prime_factor
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

        for(int i = 2;i<iNo/2;i++)
        {
            if(iNo%i==0)
            {
                boolean iPrime = true;
                for(int j = 2;j<i;j++)
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
}