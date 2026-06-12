//write a program to find maximum of two numbers

class program3 {

    public static void main(String A[]) {

        Logic obj = new Logic();
        obj.FindMax(20, 15);
    }
}

class Logic {

    void FindMax(int a,int b) {

        if(a > b)
        {
            System.out.println("maximum number is :"+a);
        }
        else
        {
            System.out.println("maximum number is :"+b);
        }
     
    }
}
