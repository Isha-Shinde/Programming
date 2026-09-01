/*
    A fitness app records steps for 7 days. 
    It wants to show how many days user achieved the goal and what the highest step count was.    

    Input : 7 integers (steps)

    Validation : Steps must be >= 0

    Expected output : Goal Achieved Days: <count>
                      Maximum Steps in Week: <value>
*/

import java.util.*;
class Program3
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int Steps = 0;
        int GoalDays = 0;
        int MaxSteps = 0;

        for(int i = 1; i <= 7; i++)
        {
            System.out.println("Enter steps for day " + i + " : ");
            Steps = sobj.nextInt();

            if(Steps < 0)
            {
                System.out.println("Invalid Input");
                return;
            }

            if(Steps >= 10000)
            {
                GoalDays++;
            }

            if(Steps > MaxSteps)
            {
                MaxSteps = Steps;
            }
        }

        System.out.println("Goal Achieved Days: " + GoalDays);
        System.out.println("Maximum Steps in Week: " + MaxSteps);

    }
}