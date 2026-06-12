//write a program to check wheather a given year is a leap year or not.
class program1 {

    public static void main(String A[]) {

        Logic obj = new Logic();
        obj.checkLeapYear(2024);
    }
}

class Logic {

    void checkLeapYear(int year) {
        
        if(year % 400 == 0)
        {
            System.out.println("Leap Year");
        }
        else if(year % 100 == 0)
        {
            System.out.println("Not a Leap Year");
        }
        else if(year % 4 == 0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}
