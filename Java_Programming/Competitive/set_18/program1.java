//write a program to check wheather a number is prime or not

class program1 {

    public static void main(String A[]) {

        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}

class Logic {

    void checkPrime(int num) {
        
        int iCnt = 0;
        for(iCnt = 2;iCnt < num;iCnt++)
        {
            if(num % iCnt == 0)
            {
                break;
            }
        }

        if(iCnt == num)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
}
