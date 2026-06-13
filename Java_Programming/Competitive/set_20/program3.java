//write a program to check wheather the number is perfect or not.

class program3 {

    public static void main(String A[]) {

        Logic obj = new Logic();
        obj.CheckPerfect(6);
    }
}

class Logic {

    void CheckPerfect(int num) {

        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= num / 2; iCnt++)
        {
            if(num % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == num)
        {
            System.out.println("Number is perfect");
        }
        else
        {
            System.out.println("Number is not perfect");
        }
    }
}
