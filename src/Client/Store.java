package Client;

import java.rmi.Remote;
import java.rmi.RemoteException;

	public interface Store extends Remote {
	    float getPrice(String ingredient) throws RemoteException;
	}



