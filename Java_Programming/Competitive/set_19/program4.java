//write a program to print each diigit of a number seprately

class program4 {

    public static void main(String A[]) {

        Logic obj = new Logic();
        obj.PrintDigits(9876);
    }
}

class Logic {

    void PrintDigits(int num) {

        int iCnt = 0;
        int iDigit = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            System.out.println("digit is :" +iDigit);
            num = num / 10;
        }
    }
}
