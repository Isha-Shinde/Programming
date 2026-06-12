//write a program to find the sum of all even numbers up to N.

class program1 {

    public static void main(String A[]) {

        Logic obj = new Logic();
        obj.SumEvenNumbers(10);
    }
}

class Logic {

    void SumEvenNumbers(int n) {
        
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 0;iCnt <= n;iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        System.out.println("sum of even number is :"+iSum);
    }
}
