/*
    A scholarship committee uses a strict checklist. Only students who meet all academic and financial conditions qualify.
    
    Conitions :
               Marks >= 80% 
               Attendance >= 75% 
               Family income <= 3,00,000
    Input : 
           Marks percent (integer)
           Attendance percent (integer) 
           Family income (integer)

    Validation : Marks and attendance must be 0-100 
                 Income cannot be negative

    Expected output : Scholarship Approved 
                            OR 
                      Scholarship Rejected: <Reason>
*/

import java.util.*;
class Program2
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int Marks = 0;
        int Attendance = 0;
        int FamilyIncome = 0;

        System.out.println("Enter Marks:");
        Marks = sobj.nextInt();

        System.out.println("Enter Attendence :");
        Attendance = sobj.nextInt();
        
        System.out.println("Enter Family Income :");
        FamilyIncome = sobj.nextInt();

        if((Marks < 0 || Marks > 100) || (Attendance < 0 || Attendance > 100))
        {
            System.out.println("Invalid Input");
            return;
        }

        if(FamilyIncome < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Marks < 80)
        {
            System.out.println("Scholarship Rejected : Percentage should be greater than 80%");
        }
        else if(Attendance < 75)
        {
            System.out.println("Scholarship Rejected : Attendance should be at least 75%");
        }
        else if(FamilyIncome > 300000)
        {
            System.out.println("Scholarship Rejected : Family income must be 300000");
        }
        else
        {
            System.out.println("Scholarship Approved");
        }
    }
}