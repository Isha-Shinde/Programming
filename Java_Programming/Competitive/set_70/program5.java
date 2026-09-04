/*
   Social Network shortest Connection

   A social networking application contains friendships:

   Amit -> Rahul,Pooja
   Rahul -> Neha
   Pooja -> Kiran
   Neha -> Riya
   Kiran -> Riya

   Find the minimum number of connections required to reach from :

   Amit -> Riya

   one possible path : Amit -> Rahul -> Neha -> Riya
   Number of Connections : 3
*/

import java.util.*;

class Program4
{
    public static void main(String A[])
    {
        String Arr[][] = {
            {"Amit", "Rahul"},
            {"Amit", "Pooja"},
            {"Rahul", "Neha"},
            {"Pooja", "Kiran"},
            {"Neha", "Riya"},
            {"Kiran", "Riya"}
        };

        HashMap<String, ArrayList<String>> graph = new HashMap<>();

        // Create graph
        for(String str[] : Arr)
        {
            String from = str[0];
            String to = str[1];

            graph.putIfAbsent(from, new ArrayList<>());
            graph.putIfAbsent(to, new ArrayList<>());

            graph.get(from).add(to);
        }

        Queue<String> queue = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();

        HashMap<String, Integer> distance = new HashMap<>();

        String start = "Amit";
        String target = "Riya";

        queue.add(start);
        visited.add(start);
        distance.put(start, 0);

        while(!queue.isEmpty())
        {
            String current = queue.poll();

            if(current.equals(target))
            {
                System.out.println("Number of Connections : " 
                                   + distance.get(current));
                break;
            }

            for(String friend : graph.get(current))
            {
                if(!visited.contains(friend))
                {
                    visited.add(friend);
                    queue.add(friend);

                    distance.put(friend, distance.get(current) + 1);
                }
            }
        }
    }
}