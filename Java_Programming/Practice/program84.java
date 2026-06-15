
import java.util.*;

class program84 {

    public static void main(String[] A) {

        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        iRet = dobj.CountDigits(iValue);

        System.out.println("Number of Digits are : " + iRet);

    }
}

class DigitX {

    public int CountDigits(int iNo) {

        int iCount = 0;       //to count digit

        while (iNo != 0) {
            iCount++;
            iNo = iNo / 10;
        }
        return iCount;
    }
}
