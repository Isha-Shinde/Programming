/*
    Group Employees Department-wise
    Employee records :

    Amit IT
    Rahul HR
    Pooja IT
    Neha Finance
    Kiran HR
    Riya IT

    Expected Output :
    IT :
    Amit
    Pooja
    Riya

    HR:
    Rahul
    Kiran

    Finance :
    Neha
*/

import java.util.*;
class Program3
{
    public static void main(String A[]) 
    {
        String Arr[][] = {{"Amit","IT"},{"Rahul","HR"},{"pooja","IT"},{"neha","Fianace"},{"kiran","HR"},{"riya","IT"}};

        LinkedHashMap<String, ArrayList<String>> lobj = new LinkedHashMap<>();

        for(String[] str : Arr)
        {
            if(!lobj.containsKey(str[1]))
            {
                lobj.put(str[1], new ArrayList<>());
            }

            lobj.get(str[1]).add(str[0]);
        }

        for(Map.Entry<String, ArrayList<String>> eobj : lobj.entrySet())
        {
            System.out.println(eobj.getKey() +" : ");

            for(String name : eobj.getValue())
            {
                System.out.println(name);
            }

            System.out.println();
        }
    }
}

