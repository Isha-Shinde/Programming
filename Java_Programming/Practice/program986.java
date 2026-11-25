// Builder design pattern
class program986
{
    public static void main(String A[])
    {
        
    }
}

class ParkingTicket
{
    private int ticketNumber;
    private String VehicleNumber;
    private int floorNumber;
    private int spotNumber;
    private String entryTime;

    private ParkingTicket(Builder builder)
    {
        this.ticketNumber = builder.TicketNumber;
        this.VehicleNumber = builder.VehicleNumber;
        this.floorNumber = builder.floorNumber;
        this.spotNumber = builder.spotNumber;
        this.entryTime = builder.entryTime;
    }

    public void Display()
    {
        System.out.println("Ticket Number : "+this.ticketNumber);
        System.out.println("vehicle Number : "+this.VehicleNumber);
        System.out.println("floor Number : "+this.floorNumber);
        System.out.println("spot Number : "+this.spotNumber);
        System.out.println("entry time : "+this.entryTime);
    }

}

public static class Builder
{
    private int ticketNumber;
    private String VehicleNumber;
    private int floorNumber;
    private int spotNumber;
    private String entryTime;

    public Builder setTicketNumber(int ticketNumber)
    {
        this.ticketNumber = ticketNumber;
        return this;
    }

    public Builder setVehicleNumber(String VehicleNumber)
    {
        this.VehicleNumber = VehicleNumber;
        return this;
    }
    public Builder setfloorNumber(int floorNumber)
    {
        this.floorNumber = floorNumber;
        return this;
    }
    public Builder setspotNumber(int spotNumber)
    {
        this.spotNumber = spotNumber;
        return this;
    }
    public Builder setentryTime(String entryTime)
    {
        this.entryTime = entryTime;
        return this;
    }

    public ParkingTicket build()
    {
       return new ParkingTicket(this);
    }

}