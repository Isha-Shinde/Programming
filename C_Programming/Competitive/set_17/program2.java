//write a program to check wheather a number is palindrome or not.

class program2 {

    public static void main(String A[]) {

        Logic lobj = new Logic();

        boolean bRet = lobj.CheckPalindrome(121);

           if(bRet == true)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is not Palindrome");
        }
    }
}

class Logic {

    public boolean CheckPalindrome(int num) {
        int iDigit = 0;
        int iRev = 0;
        int iTemp = 0;

        iTemp = num;

        while (num != 0) {
            iDigit = num % 10;
            iRev = (iRev * 10) + iDigit;
            num = num / 10;
        }

        if(iRev == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
