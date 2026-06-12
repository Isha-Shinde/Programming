//write a program to print numbers from N to down upto 1 in reverse order.

class program2 {

    public static void main(String A[]) {

        Logic obj = new Logic();
        obj.PrintReverse(10);
    }
}

class Logic {

    void PrintReverse(int n) {
        
        int iCnt = 0;

        for(iCnt = n;iCnt >= 0;iCnt--)
        {
            System.out.println(iCnt);
            
        }
    }
}
