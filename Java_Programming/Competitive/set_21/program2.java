//write a program to count how many even and odd numbers are present between 1 and N.

class program2 {

    public static void main(String A[]) {

        Logic obj = new Logic();
        obj.CountEvenOddRange(50);
    }
}

class Logic {

    void CountEvenOddRange(int n) {
        
        int iCnt = 0;
        int iEvenCount = 0;
        int iOddCount = 0;

        for(iCnt = 1;iCnt <= n;iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEvenCount++;
            }
            else
            {
                iOddCount++;
            }
        }
        System.out.println("Even count is : " + iEvenCount);
        System.out.println("Odd count is : " + iOddCount);
    }
}
