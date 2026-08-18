/*
    In your college library,students borrow books for exams and assignments.
    The librarian wants an automatic fine calculator so that staff dont need to calculate fines manually
    for every student.
    As per policy,a student can keep a borrowes book for up to 7 days without any penalty.
    If the book is returned late,the fine depends on how many days the stuudent kept the book in total.

    Fine Rules:
    If the book is returned within 7 days -> no fine
    If total days are 8 to 12 -> rs.5per day for each day beyond 7
    If total days are more than 12 -> rs.5 per day for days 8-12
                                      rs.10 per day for each day beyond 12

    Input : one integer:total number of days the book was kept(daysKept)
    Validation : if daysKept  < 0 -> Invalid input

    Expected output : if daysKept <= 7: Returned on time. No fine applicable.
                      else : Total fine to be paid : RS<fineAmount>
*/

import java.util.*;
class Program1
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int daysKept = 0;

        System.out.println("Enter number of days the book kept : ");
        daysKept = sobj.nextInt();

        int fineAmount = 0;

        if(daysKept < 0)
        {
            System.out.println("Invalid Input");
        }
        else if(daysKept <= 7)
        {
            System.out.println("Returned on time.No fine applicable");
        }
        else if(daysKept <= 12)
        {
            fineAmount = (daysKept - 7)*5;
            System.out.println("Total fine to be paid : RS."+fineAmount);            
        }
        else
        {
            fineAmount = ((12 - 7) * 5) + ((daysKept - 12) * 10);
            System.out.println("Total fine to be paid : RS."+fineAmount);
        }
    }

}