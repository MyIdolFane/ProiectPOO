package Pachet;

public class Aparat {
	private String brand, model, categorie;
    private float pret;
    private byte garantie; 
    
    public Aparat() { 
        this.brand = "Necunoscut";
        this.model = "Necunoscut";
        this.pret = 0.0f;
        this.garantie = 0;
        this.categorie = "General";
    }
    
    public Aparat(String brand,String model, float pret, byte garantie, String categorie) {
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
    public void setBrand(String brand) {
    	this.brand = brand;	
    }
    public String getBrand() {
    	return brand;
    }
    public void setModel(String model) {
    	this.model = model;
    }
    public String getModel() {
    	return model;
    }
    public void setPret(float pret) {
    	this.pret = pret;
    }
    public float getPret() {
    	return pret;
    }
    public void setGarantie(byte garantie) {
    	this.garantie = garantie;
    }
    public byte getGarantie() {
    	return garantie;
    }
    public void setCategorie(String categorie) {
    	this.categorie = categorie;
    }
    public String getCategorie() {
    	return categorie;
    }
   
    public String toString() { 
    	return "Aparat{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", pret=" + pret + ", garantie=" + garantie +", categorie='" + categorie + '\'';
    }

}
