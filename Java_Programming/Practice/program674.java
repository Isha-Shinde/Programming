
class program674
{
    public static void main(String A[])
    {       
        String Data = "Marvellous Infosystems";
        
        // Converts String data into byte array
        byte Arr[] = Data.getBytes();
        
        // Returns the number of characters in the String
        System.out.println(Data.length());

        // Returns the number of bytes in the byte array
        System.out.println(Arr.length);
        
        // Traverses the byte array and accesses each byte
        for(int i = 0; i < Arr.length; i++)
        {
            // Displays the numeric value of each byte
            System.out.println(Arr[i]);
        }
    }
}