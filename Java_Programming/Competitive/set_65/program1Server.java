/*
   Develop a client-server appliaction that performs different string operations.

   The client should send a command containing an operation and a string.

   Supported comands :

   LENGTH <string>
   UPPER <string>
   POWER <string>
   REVERSE <string>
   PALINDROME <string>
   VOWELS <string>

   Example
   client :
   REVERSE Marvellous

   Server :
   suollevraM


   Client :
   VOWELS Marvellous

   Server :
   Number of vowels : 4

   Requirements
   - The server should perform all string processing. The client should only accept input and display the response.
 
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

            if(parts.length != 2)
            {
               dos.writeUTF("Invalid command format");
            
               continue;
            }

            String str = (parts[1]);
            
            if(operation.equals("LENGTH"))
            {
               dos.writeUTF("Length : " + str.length());
            }
            else if(operation.equals("UPPER"))
            {
               dos.writeUTF(str.toUpperCase());
            }
            else if(operation.equals("UPPER"))
            {
               dos.writeUTF(str.toUpperCase());
            }
            else if(operation.equals("POWER"))
            {
               String result = "";
            
               for(int i = 0; i < str.length(); i++)
               {
                  result = result + str.charAt(i) + str.charAt(i);
               }
            
               dos.writeUTF(result);
            }
            else if(operation.equals("REVERSE"))
            { 
               int i = 0; 
               String strRev = "";  
               
               for(i = str.length() -1 ; i >= 0; i--) 
               { 
                  strRev = strRev + str.charAt(i);
               } 

               dos.writeUTF(strRev);
            }
            else if(operation.equals("PALINDROME"))
            { 
               int i = 0; 
               String iRev = "";  
               
               for(i = str.length() -1 ; i >= 0; i--) 
               { 
                  iRev = iRev + str.charAt(i);
               } 

               if(str.equals(iRev))
               {
                  dos.writeUTF("it is palindrome");
               }
               else
               {
                  dos.writeUTF("It is not palindrome");
               }
            }
            else if(operation.equals("VOWELS"))
            {
                  int Count = 0;
         
                  for(int i = 0; i < str.length(); i++)
                  {
                     char ch = str.charAt(i);
            
                     if(ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' ||
                        ch == 'O' || ch == 'U')
                     {
                        Count++;
                     }
                  }
         
                  dos.writeUTF("Number of vowels : " + Count);
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

