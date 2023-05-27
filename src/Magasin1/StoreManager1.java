package Magasin1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StoreManager1 extends UnicastRemoteObject implements Store {

	protected StoreManager1() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	Ingrediant1  cornichons = new Ingrediant1("cornichons",10);
	Ingrediant1  safran = new Ingrediant1("safran",1000);
	Ingrediant1  sel = new Ingrediant1("sel",1);
	Ingrediant1  poivre = new Ingrediant1("poivre",100);

	@Override
	public float getPrice(String ingrediant) throws RemoteException {
		switch(ingrediant) 
		{
		case "cornichons":
			return cornichons.getPrix();
		case "safran":
			return safran.getPrix();
		case "sel":
			return sel.getPrix();
		case "poivre":
			return poivre.getPrix();
		}
		return 0;
	}
}