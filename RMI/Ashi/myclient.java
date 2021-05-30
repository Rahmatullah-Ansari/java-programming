//myclient.java
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;
public class myclient{
    public static void main(String[] args)throws RemoteException {
        myclient cl=new myclient();
        cl.connect_remote_server();
    }
    private void connect_remote_server() throws RemoteException {
        try{
            Scanner sc=new Scanner(System.in);
            Registry reg=LocateRegistry.getRegistry("localhost",1900);//if client and server are on different machine then put ip address of sever instead of localhost.
            fact ad=(fact)reg.lookup("Ashi");
            System.out.println("Enter a number = ");
            int num=sc.nextInt();
            System.out.println("Factorial is = "+ad.find_fact(num));
        } 
        catch(RemoteException|NotBoundException rem){
            System.out.println("Exception = "+rem);
        }  
    }
}
