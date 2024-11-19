package Pachet;

public class Aparat {
	private String brand;
    private String model;
    private double pret;
    private int garantie; 
    private String categorie;
    
    public Aparat() {
        this.brand = "Necunoscut";
        this.model = "Necunoscut";
        this.pret = 0.0;
        this.garantie = 0;
        this.categorie = "General";
    }
    
    public Aparat(String brand,String model, double pret, int garantie, String categorie) {
    	this.brand = brand;
    	this.model = model;
    	this.pret = pret;
    	this.garantie = garantie;
    	this.categorie = categorie;
    }
    public Aparat(Aparat other) {
    	this.brand = other.brand;
    	this.model = other.model;
    	this.pret = other.pret;
    	this.garantie = other.garantie;
    	this.categorie = other.categorie;
    }
    public String toString() {
    	return "Aparat{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", pret=" + pret + ", garantie=" + garantie +", categorie='" + categorie + '\'';
    }
}
