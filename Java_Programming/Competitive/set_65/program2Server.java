/*
   Extend the existing client-server application by implementing commands that provide information about
   the server.

   Implement : DATE         
               TIME         
               SERVERNAME         
               HELP         
               QUIT

   Example    client :
               DATE

   Server :
   27-08-2026

   Client :
   HELP

   Server : Available Commands :
                        DATE 
                        TIME
                        SERVERNAME
                        HELP
                        QUIT

   Requirements
   - HELP should display all commands supported by the server.
   - QUIT should terminate the connection with the current client without terminating the server.
*/


// server

import java.io.*;
import java.net.*;
import java.util.*;

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

            if(parts.length != 1)
            {
               dos.writeUTF("Invalid command format");
            
               continue;
            }

            if(operation.equals("DATE"))
            {
               Date dobj = new Date();

               dos.writeUTF(dobj.toString());
            }
            else if(operation.equals("TIME"))
            {
               Date dobj = new Date();

               dos.writeUTF(dobj.toString());
            }
            else if(operation.equals("SERVERNAME"))
            {
               dos.writeUTF("Marvellous Server");
            }
            else if(operation.equals("HELP"))
            {
               dos.writeUTF("Available Commands :\n" +
                            "DATE\n" +
                            "TIME\n" +
                            "SERVERNAME\n" +
                            "HELP\n" +
                            "QUIT");
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
} // End of class

