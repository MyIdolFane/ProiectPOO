package device;

public class Aparat {
    private String brand, model, categorie;
    private float pret;
    private byte garantie;
    private String nume;
    private String marca;
    private int putere; 
    private double greutate; 
    private String dimensiuni;
    private String tipAlimentare; 
    private boolean estePortabil;
    private String material;
    
    public Aparat() { 
        this.brand = "Necunoscut";
        this.model = "Necunoscut";
        this.pret = 0.0f;
        this.garantie = 0;
        this.categorie = "General";
    }
    public Aparat(String nume, String marca, int putere, double greutate, String dimensiuni,String tipAlimentare, boolean estePortabil, int garantie, float pret, String material){
    this.nume = nume;
        this.marca = marca;
        this.putere = putere;
        this.greutate = greutate;
        this.dimensiuni = dimensiuni;
        this.tipAlimentare = tipAlimentare;
        this.estePortabil = estePortabil;
        this.garantie = (byte) garantie;
        this.pret = (float) pret;
        this.material = material;
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

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPutereAparat() {
        return putere;
    }

    public void setPutereAparat(int putere) {
        this.putere = putere;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public String getDimensiuni() {
        return dimensiuni;
    }

    public void setDimensiuni(String dimensiuni) {
        this.dimensiuni = dimensiuni;
    }

    public String getTipAlimentare() {
        return tipAlimentare;
    }

    public void setTipAlimentare(String tipAlimentare) {
        this.tipAlimentare = tipAlimentare;
    }

    public boolean isEstePortabil() {
        return estePortabil;
    }

    public void setEstePortabil(boolean estePortabil) {
        this.estePortabil = estePortabil;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
