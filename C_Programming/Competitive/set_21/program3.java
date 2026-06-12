//write a program to display all factors of a given number.

class program3 {

    public static void main(String A[]) {

        Logic obj = new Logic();
        obj.DisplayFactors(12);
    }
}

class Logic {

    void DisplayFactors(int num) {

        int iCnt = 0;

        for(iCnt = 1; iCnt < num ;iCnt++)
        {
            if(num % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
