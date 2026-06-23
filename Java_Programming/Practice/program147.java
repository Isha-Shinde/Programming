
class ArrayX {

    public static void Update(int Arr[]) {
        int iCnt = 0;

        for (iCnt = 0; iCnt < Arr.length; iCnt++) {
            Arr[iCnt]++;
        }
    }
}

class program147 {

    public static void main(String A[]) {
        int Brr[] = {10, 20, 30, 40, 50};
        int iCnt = 0;

        System.out.println("Array elements before function call : ");

        for (iCnt = 0; iCnt < 5; iCnt++) {
            System.out.println(Brr[iCnt]);
        }

        ArrayX aobj = new ArrayX();
        aobj.Update(Brr);

        System.out.println("Array elements after function call : ");

        for (iCnt = 0; iCnt < 5; iCnt++) {
            System.out.println(Brr[iCnt]);
        }

    }
}
