// Duplicate transaction detector
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

class program958
{
    public static void main(String A[])
    {
        String transactions[] = {"TX101","TX102","TX103","TX101","TX104","TX102"};

        HashSet <String> unique = new HashSet<>();
        HashSet <String> duplicate = new HashSet<>();

        for(String str : transactions)
        {
            if(!unique.add(str))
            {
                duplicate.add(str);
            }
        }
        System.out.println("unique : "+unique);
        System.out.println("duplicate : "+duplicate);
    }
}