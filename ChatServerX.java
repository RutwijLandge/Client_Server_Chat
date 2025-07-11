import java.net.*;
import java.io.*;

class ChatServerX
{
    public static void main(String A[]) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(5100); //no need to specify ip address
        System.out.println("Marvellous Server is waiting at PORT no 5100");

        Socket sobj = ssobj.accept();
        System.out.println("Marvellous Server successfully connect with client");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());
        
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("-----------------------------------------");
        System.out.println("Marvellous Chat messenger is ready to use");
        System.out.println("-----------------------------------------");

        String str1 = null , str2 = null;

        while((str1 = bobj1.readLine()) != null)
        {
            System.out.println("Client Says:"+str1);
            System.out.println("Enter the message for Client : ");
            str2 = bobj2.readLine();
            pobj.println(str2);
        }
    }
}