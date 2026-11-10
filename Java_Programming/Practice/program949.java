
// java program949.java 10 11 

class program949
{
    public static void main(String A[])
    {
        int Ans = 0;

        if(A.length != 2)
        {
            System.out.println("Invalid Number of arguments");
            return;
        }

        //Ans = A[0] + A[1];  // ERROR

        System.out.println("Addistion is : "+(A[0] + A[1]));
        
    }
}