import java.io.*;
import java.net.*;

class SampleClient extends Thread
{
    public static void main(String args[])
    {
        try
        {
            Socket socket = new Socket("localhost", 3128);

            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);
            
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            
            System.out.println("Write the message and press enter");
            line = keyboard.readLine(); 
            System.out.println("Sent to server: "+line);
            out.writeUTF(line); 
            out.flush(); 
            line = in.readUTF(); 
            System.out.println("Server sent: " + line);
            
            socket.close();
        }
        catch(Exception e)
        {System.out.println("init error: "+e);}
    }
}