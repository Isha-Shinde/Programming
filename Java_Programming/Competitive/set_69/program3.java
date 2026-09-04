/*
    A hospital receives patients with severity levels :

    Rahul 2
    Amit 5
    Pooja 1
    Neha 4

    Higher severity should be treated first.
    Expected order :
    Amit
    Neha
    Rahul
    Pooja

    create a Patient class containing
    String name;
    int severity
*/
import java.util.*;

class program2
{
    public static void main(String A[])
    {
        Patient p1 = new Patient("Rahul",2);
        Patient p2 = new Patient("Amit",5);
        Patient p3 = new Patient("Pooja",1);
        Patient p4 = new Patient("Neha",4);

        PriorityQueue<Patient> pqobj = new PriorityQueue<>(new Comparator<Patient>()
        {
            public int compare(Patient p1, Patient p2)
            {
                return p2.severity - p1.severity;
            }
        });

        pqobj.add(p1);
        pqobj.add(p2);
        pqobj.add(p3);
        pqobj.add(p4);

        while(!pqobj.isEmpty())
        {
            System.out.println(pqobj.poll());
        }
    }
}

class Patient
{
    String name;
    int severity;

    public Patient(String a, int b)
    {
        this.name = a;
        this.severity = b;
    }

    public String toString()
    {
        return this.name +" "+this.severity;
    }
}