package magasin3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import Magasin1.Store;

public class StoreManager3 extends UnicastRemoteObject implements Store{
	protected StoreManager3() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	Ingrediant  cornichons = new Ingrediant("cornichons",50);
	Ingrediant  safran = new Ingrediant("safran",6);
	Ingrediant  sel = new Ingrediant("sel",30);
	Ingrediant  poivre = new Ingrediant("poivre",50);
	@Override
	public float getPrice(String ingredient) throws RemoteException {
		switch(ingredient) 
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
