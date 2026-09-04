/*
    Customers submit support requests :
    R101
    R102
    R103
    R104

    Requests must normally be handled in the same order in which they arrive.

    Implement : addRequest()
                processRequest()
                showPendingRequests()
*/
import java.util.*;

class program2
{
    public static void main(String A[])
    {
        addRequest("R101");
        addRequest("R102");
        addRequest("R103");
        addRequest("R104");

        addRequest("R105");

        processRequest();

        showPendingRequests();
    }
    
    static Queue<String> qobj = new ArrayDeque<>();

    static void addRequest(String request)
    {
        qobj.add(request);
    }

    static void processRequest()
    {
        System.out.println("Process Request : " + qobj.poll());
    }

    static void showPendingRequests()
    {
        System.out.println("Pending Requests :");

        for(String str : qobj)
        {
            System.out.println(str);
        }
    }
}