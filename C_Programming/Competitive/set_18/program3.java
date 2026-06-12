//write a program to print all odd numbers upto N.

class program3 {

    public static void main(String A[]) {

        Logic obj = new Logic();
        obj.PrintOddNumbers(20);
    }
}

class Logic {

    void PrintOddNumbers(int n) {

        int iCnt = 0;

        for(iCnt = 1;iCnt <= n;iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.println(iCnt);
            }
        }
        
        
    }
}
