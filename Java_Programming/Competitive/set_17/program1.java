//write a program to find the sum of digits of number.

class program17 {

    public static void main(String A[]) {
        Logic obj = new Logic();
        obj.SumOfDigits(1234);
    }
}

class Logic {

    void SumOfDigits(int num) {
        int iDigit = 0;
        int iSum = 0;

        while (num != 0) {
            iDigit = num % 10;
            iSum = iSum + iDigit;
            num = num / 10;
        }

        System.out.println("Sum of digits is :" + iSum);
    }
}
