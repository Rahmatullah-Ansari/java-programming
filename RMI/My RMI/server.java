import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class server extends UnicastRemoteObject implements adder{
    public server()throws RemoteException{

    }
    @Override
    public int sum(int a,int b)throws RemoteException{
        return a+b;
    }
    public static void main(String[] args)throws RemoteException{
        try{
            Registry reg=LocateRegistry.createRegistry(1900);
            reg.rebind("Haidar",new server());
            System.out.println("Server is ready!!");
        }
        catch(Exception ex){
            System.out.println("Exception = "+ex);
        }
        
    }
    
}
