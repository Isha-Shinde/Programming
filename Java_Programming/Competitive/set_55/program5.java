/*
  Cinema Seat Booking with Row Pricing + Group Discount

Seats have different prices per row. User tries booking multiple seats; reject if already booked. If group size 2 6 give 10% discount.

    Input : rows, cols, booked SeatList, requested SeatList

    Expected output : 
                      success/fail + total cost + remaining seats
*/

import java.util.*;
class Program5
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int rows = 0;
        int cols = 0;
        int bookedCount = 0;
        int requestedCount = 0;

        System.out.println("Enter number of rows : ");
        rows = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        cols = sobj.nextInt();

        int[][] seats = new int[rows][cols];

        // 0 = Available
        // 1 = Booked

        System.out.println("Enter number of already booked seats : ");
        bookedCount = sobj.nextInt();

        System.out.println("Enter booked seats (row column) : ");

        for(int i = 0; i < bookedCount; i++)
        {
            int r = sobj.nextInt();
            int c = sobj.nextInt();

            seats[r - 1][c - 1] = 1;
        }

        System.out.println("Enter number of requested seats : ");
        requestedCount = sobj.nextInt();

        int[][] requestedSeats = new int[requestedCount][2];

        boolean canBook = true;

        System.out.println("Enter requested seats (row column) : ");

        for(int i = 0; i < requestedCount; i++)
        {
            int r = sobj.nextInt();
            int c = sobj.nextInt();

            requestedSeats[i][0] = r;
            requestedSeats[i][1] = c;

            if(seats[r - 1][c - 1] == 1)
            {
                canBook = false;
            }
        }

        if(!canBook)
        {
            System.out.println("Booking Failed : Seat already booked");
            return;
        }

        double totalCost = 0.0;
        double discount = 0.0;
        double finalCost = 0.0;

        // Calculate price
        for(int i = 0; i < requestedCount; i++)
        {
            int r = requestedSeats[i][0];

            if(r == 1)
            {
                totalCost = totalCost + 200;
            }
            else if(r == 2)
            {
                totalCost = totalCost + 300;
            }
            else
            {
                totalCost = totalCost + 400;
            }
        }

        // Group discount
        if(requestedCount >= 2 && requestedCount <= 6)
        {
            discount = totalCost * 0.10;
        }

        finalCost = totalCost - discount;

        // Mark seats as booked
        for(int i = 0; i < requestedCount; i++)
        {
            int r = requestedSeats[i][0];
            int c = requestedSeats[i][1];

            seats[r - 1][c - 1] = 1;
        }

        // Count remaining seats
        int remainingSeats = 0;

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(seats[i][j] == 0)
                {
                    remainingSeats++;
                }
            }
        }

        System.out.println("Booking Successful");
        System.out.println("Total Cost : Rs." + finalCost);
        System.out.println("Remaining Seats : " + remainingSeats);   
    }
}