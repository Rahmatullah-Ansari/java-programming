//myserver.java
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class myserver extends UnicastRemoteObject implements fact{
    public myserver()throws RemoteException{

    }
    @Override
    public int find_fact(int num)throws RemoteException{
        int f=1;
        while(num>1){
            f*=num;
            num--;
        }
        return f;
    }
    public static void main(String[] args)throws RemoteException{
        try{
            Registry reg=LocateRegistry.createRegistry(1900);
            reg.rebind("Ashi",new myserver());
            System.out.println("Server is ready!!");
        }
        catch(Exception ex){
            System.out.println("Exception = "+ex);
        }
        
    }
    
}
