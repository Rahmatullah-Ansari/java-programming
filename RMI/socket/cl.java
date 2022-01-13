package RMI.socket;

//TCP/IP socket programming.
import java.net.*;
import java.io.*;
public class cl {
    public static void main(String[] args)throws Exception {
        Socket sc=new Socket("localhost",1900);//if server and client are on different machine the put ip address of server instead of localhost.
        //(100.72.63.45)(2401:4900:36a7:45f5:dd1e:8f02:3387:5214).
        DataOutputStream dout=new DataOutputStream(sc.getOutputStream());
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        DataInputStream din=new DataInputStream(sc.getInputStream());
        while(true){
            String s=bf.readLine();
            dout.writeUTF(s);
            String mystr=din.readUTF();
            System.out.println("Server : "+mystr);
            if(s.equalsIgnoreCase("exit")){
                break;
            }
        }
        sc.close();
    }
    
}
