//write a program to find the smallest digit in a given number.

class program5 {

    public static void main(String A[]) {

        Logic obj = new Logic();
        obj.FindLargestDigit(83429);
    }
}

class Logic {

    void FindLargestDigit(int num) {

        int iCnt = 0;
        int iDigit = 0;
        int iMin = 9;

        while(num != 0)
        {
            iDigit = num % 10;
            if(iDigit < iMin)
            {
                iMin = iDigit;
            }
            num = num / 10;
        }
        System.out.println("Smallest digit is:"+iMin);
    }
}
