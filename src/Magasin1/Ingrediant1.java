package Magasin1;

public class Ingrediant1 {
	private String nom;
	private float prix;
	public Ingrediant1() {
		super();
	}
	public Ingrediant1(String nom, float prix) {
		super();
		this.nom = nom;
		this.prix = prix;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}

}
