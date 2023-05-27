package Client;

import java.rmi.Naming;
import java.util.Scanner;

public class StoreClient {
	public static void getPrice(int numIngrediant) throws Exception {
		Store stub1 = (Store) Naming.lookup("rmi://localhost:1097/mag1");
		Store stub2 = (Store) Naming.lookup("rmi://localhost:1098/mag2");
		Store stub3 = (Store) Naming.lookup("rmi://localhost:1097/mag3");
		float price1 = 0;
		float price2 = 0;
		float price3 = 0;
		switch (numIngrediant) {
		case 1:
			price1 = stub1.getPrice("cornichons");
			price2 = stub2.getPrice("cornichons");
			price3 = stub3.getPrice("cornichons");
			if ((price1 < price2) && (price1 < price3)) {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("cornichons");
				System.out.print(" » est de « ");
				System.err.print(price1);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag1 ");
				System.out.print(" ».");
				break;
			} else if ((price2 < price1) && (price2 < price3)) {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("cornichons");
				System.out.print(" » est de « ");
				System.err.print(price2);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag2 ");
				System.out.print(" ».");
				break;
			} else {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("cornichons");
				System.out.print(" » est de « ");
				System.err.print(price3);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag3 ");
				System.out.print(" ».");
				break;
			}
		case 2:
			price1 = stub1.getPrice("safran");
			price2 = stub2.getPrice("safran");
			price3 = stub3.getPrice("safran");
			if ((price1 < price2) && (price1 < price3)) {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("safran");
				System.out.print(" » est de « ");
				System.err.print(price1);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag1 ");
				System.out.print(" ».");
				break;
			} else if ((price2 < price1) && (price2 < price3)) {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("safran");
				System.out.print(" » est de « ");
				System.err.print(price2);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag2 ");
				System.out.print(" ».");
				break;
			} else {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("safran");
				System.out.print(" » est de « ");
				System.err.print(price3);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag3 ");
				System.out.print(" ».");
				break;
			}
		case 3:
			price1 = stub1.getPrice("sel");
			price2 = stub2.getPrice("sel");
			price3 = stub3.getPrice("sel");
			if ((price1 < price2) && (price1 < price3)) {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("sel");
				System.out.print(" » est de « ");
				System.err.print(price1);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag1 ");
				System.out.print(" ».");
				break;
			} else if ((price2 < price1) && (price2 < price3)) {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("sel");
				System.out.print(" » est de « ");
				System.err.print(price2);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag2 ");
				System.out.print(" ».");
				break;
			} else {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("sel");
				System.out.print(" » est de « ");
				System.err.print(price3);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag3 ");
				System.out.print(" ».");
				break;
			}
		case 4:
			price1 = stub1.getPrice("poivre");
			price2 = stub2.getPrice("poivre");
			price3 = stub3.getPrice("poivre");
			if ((price1 < price2) && (price1 < price3)) {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("poivre");
				System.out.print(" » est de « ");
				System.err.print(price1);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag1 ");
				System.out.print(" ».");
				break;
			} else if ((price2 < price1) && (price2 < price3)) {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("poivre");
				System.out.print(" » est de « ");
				System.err.print(price2);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag2 ");
				System.out.print(" ».");
				break;
			} else {
				System.out.print("Le prix le plus bas de l’ingrédient « ");
				System.err.print("poivre");
				System.out.print(" » est de « ");
				System.err.print(price3);
				System.out.print(" DT » et se trouve chez «");
				System.err.print(" Mag3 ");
				System.out.print(" ».");
				break;
			}

		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		Scanner scanner = new Scanner(System.in);
		System.out.println("Sélectionnez le numéro de l'ingrédient :");
		System.out.println("[1] cornichons");
		System.out.println("[2] safran");
		System.out.println("[3] sel");
		System.out.println("[4] poivre");
		int choice = scanner.nextInt();
		
			switch (choice) {
			case 1:
				getPrice(1);
				break;
			case 2:
				getPrice(2);
				break;
			case 3:
				getPrice(3);
				break;
			case 4:
				getPrice(4);
				break;
			default:
				System.out.println("Choix invalide !");
				scanner.close();
				return;
			}
		}


}

