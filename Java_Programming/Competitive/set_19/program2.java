//write a program to Display grade of a student based on marks.

class program2 {

    public static void main(String A[]) {

        Logic obj = new Logic();
        obj.DisplayGrade(82);
    }
}

class Logic {

    void DisplayGrade(int marks) {

        if(marks >= 90)
        {
            System.out.println("Grade A");
        }
        else if(marks >= 75)
        {
            System.out.println("Grade B");
        }
        else if(marks >= 60)
        {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Grade D");
        }
    }
}
