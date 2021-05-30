//TCP/IP socket programming.
import java.net.*;
import java.io.*;
public class sc {
    public static void main(String[] args)throws Exception {
        ServerSocket ss=new ServerSocket(1900);
        System.out.println("server is running..");
        Socket sk=ss.accept();
        System.out.println("Connected..");
        DataInputStream din=new DataInputStream(sk.getInputStream());
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream dout=new DataOutputStream(sk.getOutputStream());
        while(true){
            String str=din.readUTF();
            System.out.println("Client : "+str);
            String mystr=bf.readLine();
            dout.writeUTF(mystr);
            if(str.equalsIgnoreCase("exit")){
                break;
            }
        }
        sk.close();

    }
}
