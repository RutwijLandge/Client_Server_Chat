import java.net.*;
import java.io.*;

class ChatClientX
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client is ready to connect with Server");

        Socket sobj = new Socket("localhost",5100);
        System.out.println("Marvellous client is sucessfully connected with server");
        

        PrintStream pobj = new PrintStream(sobj.getOutputStream());
        
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("-----------------------------------------");
        System.out.println("Marvellous Chat messenger is ready to use");
        System.out.println("-----------------------------------------");

        String str1 = null , str2 = null;

        while(!(str1 = bobj2.readLine()).equals("end")) 
        {
            pobj.println(str1);
            str2 = bobj1.readLine();
            System.out.println("Server says : "+str2);
            System.out.println("Enter Message for server : ");

        }
    }
}