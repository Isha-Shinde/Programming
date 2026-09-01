/*
    An online election system stores votes by voter ID. 
    Every voter can vote only once. If the same ID appears again,
    the vote must be rejected and counted as duplicate.
        
    Input : 
           Number of votes N
           N voter IDs

    Validation : N >= 0
                 IDs must be non-negative integers

    Expected output : Valid Votes: <count>
                      Rejected Duplicate Votes: <count>
*/

import java.util.*;
class Program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int N = 0;
        int VoterID = 0;
        int ValidVotes = 0;
        int DuplicateVotes = 0;
        boolean bFlag = false;

        System.out.println("Enter number of votes : ");
        N = sobj.nextInt();

        if(N < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[] = new int[N];

        for(int i = 0; i < N; i++)
        {
            System.out.println("Enter voter ID : ");
            VoterID = sobj.nextInt();

            if(VoterID < 0)
            {
                System.out.println("Invalid Input");
                return;
            }

            bFlag = false;

            for(int j = 0; j < ValidVotes; j++)
            {
                if(Arr[j] == VoterID)
                {
                    bFlag = true;
                    break;
                }
            }

            if(bFlag == true)
            {
                DuplicateVotes++;
            }
            else
            {
                Arr[ValidVotes] = VoterID;
                ValidVotes++;
            }
        }

        System.out.println("Valid Votes : " + ValidVotes);
        System.out.println("Rejected Duplicate Votes : " + DuplicateVotes);
    }
}