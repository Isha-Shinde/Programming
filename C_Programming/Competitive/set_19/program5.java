//write a program to calculate the power of a number using loops.

class program5 {

    public static void main(String A[]) {

        Logic obj = new Logic();
        obj.CalculatePower(2,5);
    }
}

class Logic {

    void CalculatePower(int base, int exp) {

        int iCnt = 0;
        int iResult = 1;

        for(iCnt = 1;iCnt <= exp;iCnt++)
        {
            iResult = iResult * base;
        }
        System.out.println("Power is :"+iResult);
    }
}
