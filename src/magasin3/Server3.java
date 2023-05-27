package magasin3;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import Magasin2.StoreManager2;

public class Server3 {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Registry  registry = LocateRegistry.createRegistry(1099);
		registry.bind("mag3", new StoreManager3());
		System.out.println("server magasin 3 is runing.....");
	}

}


