// Design Pattern - singletone

class program973
{
    public static void main(String A[])
    {
        // ParkingLot pobj1 = new ParkingLot(); // error

        ParkingLot pobj1 = ParkingLot.getInstance();
        ParkingLot pobj2 = ParkingLot.getInstance();
        ParkingLot pobj3 = ParkingLot.getInstance();
        
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
    public static ParkingLot getInstance()
    {
        if(instance == null)
        {
            instance = new ParkingLot();
        }
        return instance;
    }
    
}