
import java.util.*;

class program90 {

    public static void main(String[] A) {

        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        iRet = dobj.SumDigits(iValue);

        System.out.println("Summation of Digits is : " + iRet);

    }
}

class DigitX {

    public int SumDigits(int iNo) {
        int iDigit = 0;       // to split digits
        int iSum = 0;       //to count digit

        while (iNo != 0) {
            iSum = iSum + (iNo % 10);
            iNo = iNo / 10;
        }
        return iSum;
    }
}
