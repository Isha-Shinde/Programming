//write a program to find count total number of factors of a given number.

class program4 {

    public static void main(String A[]) {

        Logic obj = new Logic();
        obj.CountFactors(20);
    }
}

class Logic {

    void CountFactors(int num) {

        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 1; iCnt < num ;iCnt++)
        {
            if(num % iCnt == 0)
            {
                iCount++;
            }
        }
        System.out.println("Total factors are : " + iCount);
    }
}
