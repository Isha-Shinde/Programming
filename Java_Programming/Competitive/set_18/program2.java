//write a program to print all even numbers upto N.

class program2 {

    public static void main(String A[]) {

        Logic obj = new Logic();
        obj.PrintEvenNumbers(20);
    }
}

class Logic {

    void PrintEvenNumbers(int n) {

        int iCnt = 0;

        for(iCnt = 1;iCnt <= n;iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.println(iCnt);
            }
        }
        
        
    }
}
