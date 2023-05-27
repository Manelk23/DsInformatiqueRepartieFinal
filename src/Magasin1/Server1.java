package Magasin1;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import Magasin2.StoreManager2;

public class Server1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Registry registry = LocateRegistry.createRegistry(1097);
		registry.bind("mag1", new StoreManager1());
		System.out.println("server magasin 2 is runing.....");

	}

}

