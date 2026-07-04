//Input : 9
//Output: 1 * 2 * 3 * 4 * 5 
import java.util.*;
class program177
{
    public static void Display(int iNo) 
    {
        int iCnt = 0,iCount = 0;

        for(iCnt = 1,iCount = 1;iCnt <= iNo ;iCnt++)
        {
            if(iCnt %2 == 0)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print(iCount);
                iCount++;
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