//write a program to find the sum of even and odd digits seprately in a number.

class program4 {

    public static void main(String A[]) {

        Logic obj = new Logic();
        obj.SumEvenOddDigits(123456);
    }
}

class Logic {

    void SumEvenOddDigits(int num) {

        int iCnt = 0;
        int iDigit = 0,EvenSum = 0,OddSum = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            if(iDigit % 2 == 0)
            {
                EvenSum = EvenSum + iDigit;
            }
            else
            {
                OddSum = OddSum + iDigit;
            }
            num = num /10;
        }
        System.out.println("Sum of even digit is :" +EvenSum);
        System.out.println("Sum of odd digit is :" +OddSum);

    }
}
