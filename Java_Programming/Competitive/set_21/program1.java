//write a program to calculate the product of digits of a number.

class program1 {

    public static void main(String A[]) {

        Logic obj = new Logic();
        obj.ProductOfDigits(234);
    }
}

class Logic {

    void ProductOfDigits(int num) {
        
        int iDigit = 0;
        int iProduct = 1;

        while(num != 0)
        {
            iDigit = num % 10;

            iProduct = iProduct * iDigit;

            num = num / 10;
        }

        System.out.println("Product of digits is : " + iProduct);
    }
}
