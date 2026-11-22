// Design Pattern - singleton
class program974
{
    public static void main(String A[])
    {
        ParkingLot pobj1 = ParkingLot.getInsatnce();
        ParkingLot pobj2 = ParkingLot.getInsatnce();    

        System.out.println(pobj1 == pobj2);    
    }
}

class ParkingLot
{
    private static ParkingLot instance;

    private ParkingLot()
    {
        System.out.println("ParkingLot object gets created");
    }
              // return type
    public static ParkingLot getInsatnce()
    {
        if(instance == null)
        {
            instance = new ParkingLot();
        }
        return instance;
    }    
}

 // Singleton -  private constructor ,private static reference, method that return the object reeference
 
