import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;
public class client{
    public static void main(String[] args)throws RemoteException {
        client cl=new client();
        cl.connect_remote();
    }
    private void connect_remote() throws RemoteException {
        try{
            Scanner sc=new Scanner(System.in);
            Registry reg=LocateRegistry.getRegistry("localhost",1900);//if client and server are on different machine then put ip address of sever instead of localhost.
            adder add=(adder)reg.lookup("Haidar");
            System.out.println("Enter two numbers = ");
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println("Sum is = "+add.sum(x, y));
        } 
        catch(RemoteException|NotBoundException rem){
            System.out.println("Exception = "+rem);
        }  
    }
}