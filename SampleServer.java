import java.io.*;
import java.net.*;

class SampleServer extends Thread
{
    Socket s;
    int num;

    public static void main(String args[])
    {
        try
        {
            int i = 0; 
            ServerSocket server = new ServerSocket(3128, 0,
                    InetAddress.getByName("localhost"));

            System.out.println("Server is started");
            while(true)
            {
                new SampleServer(i, server.accept());
                i++;
            }
        }
        catch(Exception e)
        {System.out.println("init error: "+e);} // вывод исключений
    }

    public SampleServer(int num, Socket s)
    {
        this.num = num;
        this.s = s;

        // и запускаем новый вычислительный поток (см. ф-ю run())
        setDaemon(true);
        setPriority(NORM_PRIORITY);
        start();
    }

    public void run()
    {
        try
        {
            InputStream sin = s.getInputStream();
            OutputStream sout = s.getOutputStream();
            
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);
            
            String line = null;
            line = in.readUTF(); 
            System.out.println("Client sent : " + line);
            out.writeUTF(line); 
            out.flush(); 
            s.close();
        }
        catch(Exception e)
        {System.out.println("init error: "+e);} 
    }
}