/*
    Longest Consecutive Employee ID Sequence

    Given IDs :
    100
    4
    200
    1
    3
    2
    5

    Find the longest consecutive sequence.

    Output : 1 2 3 4 5
             length : 5
             
*/
import java.util.*;

class Program6
{
    public static void main(String A[])
    {
        int Arr[] = {100, 4, 200, 1, 3, 2, 5};

        HashSet<Integer> set = new HashSet<>();

        for(int id : Arr)
        {
            set.add(id);
        }

        int max = 0;
        int start = 0;

        for(int id : set)
        {
            if(!set.contains(id - 1))
            {
                int count = 1;
                int current = id;

                while(set.contains(current + 1))
                {
                    current++;
                    count++;
                }

                if(count > max)
                {
                    max = count;
                    start = id;
                }
            }
        }

        System.out.print("Sequence : ");

        for(int i = 0; i < max; i++)
        {
            System.out.print((start + i) + " ");
        }

        System.out.println();
        System.out.println("Length : " + max);
    }
}