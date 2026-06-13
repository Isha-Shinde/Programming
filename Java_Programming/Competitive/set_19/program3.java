//write a program to check wheather the number is divisible by 5 and 11 or not.

class program3 {

    public static void main(String A[]) {

        Logic obj = new Logic();
        obj.checkDivisible(55);
    }
}

class Logic {

    void checkDivisible(int num) {

        if((num % 5 == 0) && (num % 11 == 0))
        {
            System.out.println("Number is divisible by 5 and 11");
        }
        else
        {
            System.out.println("Number is not divisible by 5 and 11");
        }
    }
}
