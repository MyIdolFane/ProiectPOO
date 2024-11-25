/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package device;

/**
 *
 * @author Sara
 */
public class Drujba  extends Aparat implements Comportament{
        private int anFabricatie;
	private double putere;
	private String modelDrujba;
	private String culoare;
	private String tipAlimentare;

	public Drujba() {   //constructor fara parametrii
            super();
	    anFabricatie=0;
	    putere=0.0;
	    modelDrujba="Kamrad";
	    culoare="galben";
            tipAlimentare="benzina";
	}
		
    public Drujba(int anFabricatie, double putere, String modelDrujba, String culoare, String tipAlimentare, String brand,String model, float pret, byte garantie, String categorie) {
            super(brand,model, pret, garantie, categorie);
            this.anFabricatie=anFabricatie;
            this.putere=putere;
            this.modelDrujba=modelDrujba;                 //constructor cu parametrii
            this.culoare=culoare;
            this.tipAlimentare=tipAlimentare;
	}
	
	public Drujba(Drujba altObiect) {  //constructor de copiere
            super(altObiect);
            this.anFabricatie=altObiect.anFabricatie;
            this.putere=altObiect.putere;
            this.modelDrujba=altObiect.modelDrujba;
            this.culoare=altObiect.culoare;
            this.tipAlimentare=altObiect.tipAlimentare;

	}

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public double getPutere() {
        return putere;
    }

    public void setPutere(double putere) {
        this.putere = putere;
    }

    public String getModelDrujba() {
        return modelDrujba;
    }

    public void setModelDrujba(String modelDrujba) {
        this.modelDrujba = modelDrujba;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getTipAlimentare() {
        return tipAlimentare;
    }

    public void setTipAlimentare(String tipAlimentare) {
        this.tipAlimentare = tipAlimentare;
    }
        
        
        
    @Override
    public String toString() {
        return " Drujba : " + " anFabricatie= " + anFabricatie + " putere= " + putere + " modelDrujba= " + modelDrujba + " culoare= " + culoare + " tipAlimentare= " + tipAlimentare;
	  
	  }

    @Override
    public void estePornit() {
        System.out.println("Drujba este pornita");
    }

    @Override
    public void esteInReparatii() {
        System.out.println("Drujba este in reparatii");
    }

		
		
}
