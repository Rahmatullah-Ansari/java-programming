import java.rmi.*;
public interface fact extends Remote {
    public int find_fact(int num)throws RemoteException;
}
