// Design Pattern - Factory
class program978
{
    public static void main(String A[])
    {
        Vehicle v1 = VehicleFactory.createVehicle(VehicleType.BIKE, "MH12VL9080");
        Vehicle v2 = VehicleFactory.createVehicle(VehicleType.CAR, "MH12WZ9080");
        Vehicle v3 = VehicleFactory.createVehicle(VehicleType.TRUCK, "MH12ML9080");

        v1.Display();
        v2.Display();
        v3.Display();
    }
}

enum VehicleType
{
    BIKE,
    CAR,
    TRUCK
}

abstract class Vehicle
{
    private String number;

    public Vehicle(String number)
    {
        this.number = number;
    }

    public String getNumber()
    {
        return this.number;
    }

    public abstract void Display();
}

class Bike extends Vehicle
{
    public Bike(String number)
    {
        super(number);
    }

    public void Display()
    {
        System.out.println("Bike : "+ getNumber());
    }

}

class Car extends Vehicle
{
    public Car(String number)
    {
        super(number);
    }

    public void Display()
    {
        System.out.println("Car : "+ getNumber());
    }   
}

class Truck extends Vehicle
{
    public Truck(String number)
    {
        super(number);
    }

    public void Display()
    {
        System.out.println("Truck : "+ getNumber());
    }  
}

class VehicleFactory
{
    public static Vehicle createVehicle(VehicleType type, String number)
    {
        switch(type)
        {
            case BIKE :
                return new Bike(number);

            case CAR :
                return new Car(number);

            case TRUCK :
                return new Truck(number);

                // default missing Error
        }
    }
}