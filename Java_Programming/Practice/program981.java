// Design Pattern - singleton
class program981
{
    public static void main(String A[])
    {
        ParkingLot pobj1 = ParkingLot.getInsatnce();
        ParkingLot pobj2 = ParkingLot.getInsatnce();
        ParkingLot pobj3 = ParkingLot.getInsatnce();
    }
}

class ParkingLot
{
    private static ParkingLot instance; // reference of a class(reference should be private and static)

    private ParkingLot() //(constructor should be private)
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
 
