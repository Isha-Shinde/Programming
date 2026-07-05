//Input : 7
//Output:  A b C d E f G
import java.util.*;
class program187
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        char ch1 = '\0';
        char ch2 = '\0';

        for(iCnt = 1,ch1 = 'A',ch2 = 'a';iCnt <= iNo ;iCnt++)     
        {
            if(iCnt % 2 == 0)
            {
                System.out.println(ch2);
                ch1++;
            }
            else
            {
                System.out.println(ch1);
                ch2++;
            }
        }
        System.out.println();
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the numbers of elements");
        iValue = sobj.nextInt();

        Display(iValue);
    }
}