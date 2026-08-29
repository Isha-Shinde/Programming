/*
   Deploy a multithreaded client-server application in java that performs mathematical
   Operations remotely.

   The client should accept a command from the user and send that comand to the server.
   The server should parse the received command, perform the requested mathematical operration, and return the result to client.

   The server should support the following commands :

   ADD <no1> <no2>
   SUB <no1> <no2>
   MULT <no1> <no2>
   DIV <no1> <no2>
   MOD <no1> <no2>
   MAX <no1> <no2>
   MIN <no1> <no2>
   QUIT

   Example
   client :
   Enter command : MULT 10 20

   Server :
   Result is : 200

   Client :
   Enter Command : MAX 50 80

   Server :
   Maximum number is : 80

   Requirements
   - Server should run continously
   - Multiple clients should be handled using threads.
   - Invalid commands should be handled properly.
   - Divison by zero should be handled.
   - QUIT should disconnect only the current client.
 
*/

// server

import java.io.*;
import java.net.*;
class program1Server
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

                if(parts.length != 3)
                {
                    dos.writeUTF("Invalid command format");
                
                    continue;
                }

                double no1 = Double.parseDouble(parts[1]);
                double no2 = Double.parseDouble(parts[2]);
                
                double result = 0.0;

                if(operation.equals("ADD"))
                {
                    result = no1 + no2;

                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equals("SUB"))
                {
                    result = no1 - no2;

                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equals("MULT"))
                {
                    result = no1 * no2;

                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equals("DIV"))
                {
                    if(no2 == 0)
                    {
                        dos.writeUTF("Cannot divide by zero");
                    }
                    else
                    {
                        result = no1 / no2;

                        dos.writeUTF("Result is : "+result);
                    }
                }
                else if(operation.equals("MOD"))
                {
                    result = no1 % no2;

                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equals("MAX"))
                {
                    if(no1 > no2)
                    {
                        result = no1;
                    }
                    else
                    {
                        result = no2;
                    }

                    dos.writeUTF("Maximum Number is : "+result);
                }
                else if(operation.equals("MIN"))
                {
                    if(no1 < no2)
                    {
                        result = no1;
                    }
                    else
                    {
                        result = no2;
                    }

                    dos.writeUTF("Minimum Number is : "+result);
                }
                else
                {
                    dos.writeUTF("Invalid operation");
                }
            }// End of while

            socket.close();

            System.out.println("Client disconnected");
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }
    }

} // End of class