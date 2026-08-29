/*
   Develop a client-server application where the server perform different number-related operations
   requested by the client.

   The client should send commands in the following format :
   
   EVEN <number>
   ODD <number>
   PRIME <number>
   PERFECT <number>
   FACTORIAL <number>
   REVERSE <number>

   Example
   client :
   PRIME 11

   Server :
   11 is a prime number.

   Client :
   FACTORIAL 5

   Server :
   FACTORIAL is : 120

   Requirements
   - write seprate methods for different mathematical operations.
   - Server should identify the requested operation.
   - Invalid commands should generate an appropriate message.
   - Server should support multiple clients.
 
*/

// server

import java.io.*;
import java.net.*;
class program2Server
{
    public static void main(String A[])
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(9000);

            System.out.println("-------------------------------------");
            System.out.println("----- Marvellous Server Started -----");
            System.out.println("-------------------------------------");

            // Loop for multiple client requests
            while(true)
            {
                System.out.println("Server is waiting for client request");

                Socket clientsocket = serversocket.accept();
                
                System.out.println("Client connected sucesfully");

                // Thread gets created for client
                Thread t = new Thread(() -> HandleClientRequest(clientsocket));

                t.start();
            } // End of while
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }
    } // End of main

    public static void HandleClientRequest(Socket socket)
    {
        try
        {
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to Marvellous Server");
        
            while(true)
            {
                String command = dis.readUTF();

                System.out.println("Command received from clinet : "+command);

                String parts[] = command.split(" ");

                String operation = parts[0].toUpperCase();

                if(operation.equals("QUIT"))
                {
                    dos.writeUTF("Disconneced from server");
                
                    break;
                }

                if(parts.length != 2)
                {
                    dos.writeUTF("Invalid command format");
                
                    continue;
                }

                int no1 = Integer.parseInt(parts[1]);
                
                if(operation.equals("EVEN"))
                {
                    boolean bFlag = isEven(no1);

                    if(bFlag == true)
                    {
                        dos.writeUTF(no1+" is an even number");
                    }
                    else
                    {
                        dos.writeUTF(no1+" is not an even number");
                    }
                }
                else if(operation.equals("ODD"))
                {
                    boolean bFlag = isOdd(no1);

                    if(bFlag == true)
                    {
                        dos.writeUTF(no1+" is an odd number");
                    }
                    else
                    {
                        dos.writeUTF(no1+" is not an odd number");
                    }
                }
                else if(operation.equals("PRIME"))
                {
                    boolean bFlag = isPrime(no1);

                    if(bFlag == true)
                    {
                        dos.writeUTF(no1+" is a prime number");
                    }
                    else
                    {
                        dos.writeUTF(no1+" is not a prime number");
                    }
                }
                else if(operation.equals("PERFECT"))
                {
                    boolean bFlag = isPerfect(no1);

                    if(bFlag == true)
                    {
                        dos.writeUTF(no1+" is a perfect number");
                    }
                    else
                    {
                        dos.writeUTF(no1+" is not a perfect number");
                    }
                }
                else if(operation.equals("FACTORIAL"))
                {
                    int iFact = factorial(no1);

                    dos.writeUTF("Factorial is : "+iFact);
                }
                else if(operation.equals("REVERSE"))
                {
                    int iRev = reverse(no1);

                    dos.writeUTF("Reverse is : "+iRev);
                }
                else
                {
                    dos.writeUTF("Invalid operation");
                }
            }

            socket.close();

            System.out.println("Client disconnected");
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }
    }

    public static boolean isEven(int no)
    {
        boolean bFlag = false;

        if(no % 2 == 0)
        {
            bFlag = true;
        }

        return bFlag;
    }

    public static boolean isOdd(int no)
    {
        boolean bFlag = false;

        if(no % 2 != 0)
        {
            bFlag = true;
        }

        return bFlag;
    }

    public static boolean isPrime(int no)
    {
        int i = 0;
        int iCount = 0;
        boolean bFlag = false;

        for(i = 1; i <= no; i++)
        {
            if(no % i == 0)
            {
                iCount++;
            }
        }

        if(iCount == 2)
        {
            bFlag = true;
        }

        return bFlag;
    }

    public static boolean isPerfect(int no)
    {
        int i = 0;
        int iSum = 0;
        boolean bFlag = false;

        for(i = 1; i < no; i++)
        {
            if(no % i == 0)
            {
                iSum = iSum + i;
            }
        }

        if(iSum == no)
        {
            bFlag = true;
        }

        return bFlag;
    }

    public static int factorial(int no)
    {
        int i = 0;
        int iFact = 1;

        for(i = 1; i <= no; i++)
        {
            iFact = iFact * i;
        }

        return iFact;
    }

    public static int reverse(int no)
    {
        int iRev = 0;
        int iDigit = 0;

        while(no != 0)
        {
            iDigit = no % 10;

            iRev = iRev * 10 + iDigit;

            no = no / 10;
        }

        return iRev;
    }
} // End of class