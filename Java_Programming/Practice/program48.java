//Accept one number from user and return the summation of its factors.

import java.util.Scanner;

class program48 {

    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        nobj.SumFactors(iValue);

    }
}

class NumberX {

    public void SumFactors(int iNo) {
        int iCnt = 0;    //loop counter
        int iSum = 0;    //summation of factors

        for (iCnt = 1; iCnt <= (iNo / 2); iCnt++) {
            if ((iNo % iCnt) == 0) {
                iSum = iSum + iCnt;
            }
        }

        System.out.println("Summation of factors : " + iSum);
    }
}

// Time Complexity : O(N/2)
// Where N >= 0
