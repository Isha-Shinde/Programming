/*
   A software project has dependencies :

   Database -> Backend
   Backend -> API
   API -> Frontend

   Determine a valid order in which modules should be initialized.
   Expected :
   Database
   Backend
   API
   Frontend

   for a more complex input :
   A -> C
   B -> C
   C -> D
   B -> E
   D -> F
   E -> F

   find a valid dependency order.

*/
import java.util.*;

class Program4
{
    public static void main(String A[])
    {
        String Arr[][] = {
            {"Database", "Backend"},
            {"Backend","API"},
            {"API","Frontend"},
        };

        HashMap<String, ArrayList<String>> graph = new HashMap<>();
        HashMap<String, Integer> indegree = new HashMap<>();

        // Create graph and initialize indegree
        for(String str[] : Arr)
        {
            String from = str[0];
            String to = str[1];

            graph.putIfAbsent(from, new ArrayList<>());
            graph.putIfAbsent(to, new ArrayList<>());

            indegree.putIfAbsent(from, 0);
            indegree.putIfAbsent(to, 0);

            graph.get(from).add(to);
            indegree.put(to, indegree.get(to) + 1);
        }

        Queue<String> queue = new LinkedList<>();

        // Add modules having no dependency
        for(Map.Entry<String, Integer> eobj : indegree.entrySet())
        {
            if(eobj.getValue() == 0)
            {
               queue.add(eobj.getKey());
            }
        }

        // Topological Sort
        while(!queue.isEmpty())
        {
            String current = queue.poll();

            System.out.println(current);

            for(String next : graph.get(current))
            {
                indegree.put(next, indegree.get(next) - 1);

                if(indegree.get(next) == 0)
                {
                    queue.add(next);
                }
            }
        }
    }
}