package servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ExemploRMI {
        
    public static void main(String[] args) throws RemoteException{
        Registry registro=null;
        try {
            
            Jokenpo obj = new Jokenpo();
            Remote remote = UnicastRemoteObject.exportObject(obj,0);
            registro = LocateRegistry.createRegistry(1099);
            registro.rebind("calcula", remote);
        } catch (Exception e) {
            System.out.println("Erro no Servidor:" + e.getMessage());
        }
    }

}
