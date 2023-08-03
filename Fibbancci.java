/*
write a program to print all fibbanacci series up to n
*/
import java.io.*;

public class Fibbancci
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

        int iNum1 = 0;
        int iNum2 = 1;
        
        for(int i = 1;i<iNo;i++)
        {
            int iNum3 = iNum2+iNum1;
            iNum1 = iNum2;
            iNum2 = iNum3;
            System.out.println(iNum3);
        }
    }
}