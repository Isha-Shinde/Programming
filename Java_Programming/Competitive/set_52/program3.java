/*
    A University wants to generate student results automatically.
    Each student has marks in five subjects,each out of 100.
    The result should clearly show wheather the student failed in any subject and if passed,
    the final classification basedc on average marks.

    Rules:
    If marks in any subject < 35 -> student is Fail
    If student passes all subject,calculate average and classify:
               Average >= 75 -> Distinction
               Average >= 60 -> First Class 
               Average >= 50 -> Second Class
               Average < 50 -> Pass

    Input : Five integers(marks in 5 subjects)

    Validation : Each mark must be between 0 and 100

    Expected output : if fail : Result : Fail
                         else : Average Marks : <avg>
                                Final Result  : <Classification> 
*/

import java.util.*;
class Program3
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int Arr[] = new int[5];
        int i = 0;
        int iSum = 0;
        float Avg = 0.0f;

        System.out.println("Enter marks of 5 subjects :");
        
        for(i = 0; i < 5; i++)
        {
            Arr[i] = sobj.nextInt();

            if(Arr[i] < 0 || Arr[i] > 100)
            {
                System.out.println("Invalid marks");
                return;
            }
            iSum = iSum + Arr[i];
        }

        for(i = 0; i < 5; i++)
        {
            if(Arr[i] < 35)
            {
                System.out.println("Result : Fail");
                return;
            }
        }

        Avg = iSum / 5.0f;

        if(Avg >= 75)
        {
            System.out.println("Final Result : Distinction");
        }
        else if(Avg >= 60)
        {
            System.out.println("Final Result : First Class");
        }
        else if(Avg >= 50)
        {
            System.out.println("Final Result : Second Class");
        }
        else
        {
           System.out.println("Final Result : Pass"); 
        }
    }
}