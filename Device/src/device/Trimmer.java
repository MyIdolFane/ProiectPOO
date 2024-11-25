/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package device;

/**
 *
 * @author Sara
 */
public class Trimmer extends Aparat implements Comportament{
    private String brend;
    private double greutate;
    private int putere;
    private String tipMotor;
    private boolean acumulator;
    
public Trimmer(){
        super();
        brend="Bosch";
        greutate=0.0;
        putere=0;
        tipMotor="electric";
        acumulator=false;
}

public Trimmer(String brend, double greutate, int putere, String tipMotor, boolean acumulator, String brand,String model, float pret, byte garantie, String categorie){
        super(brand,model, pret, garantie, categorie);
        this.brend=brend;
        this.greutate=greutate;
        this.putere=putere;
        this.tipMotor=tipMotor;
        this.acumulator=acumulator;
    }

public Trimmer(Trimmer altObiect){
        super(altObiect);
        this.brend=altObiect.brend;
        this.greutate=altObiect.greutate;
        this.putere=altObiect.putere;
        this.tipMotor=altObiect.tipMotor;
        this.acumulator=altObiect.acumulator;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }

    public String getTipMotor() {
        return tipMotor;
    }

    public void setTipMotor(String tipMotor) {
        this.tipMotor = tipMotor;
    }

    public boolean isAcumulator() {
        return acumulator;
    }

    public void setAcumulator(boolean acumulator) {
        this.acumulator = acumulator;
    }


    @Override
    public String toString(){
        return " brend "+brend+" greutate "+greutate+" putere "+putere+ " tipMotor "+tipMotor +" acumulator "+ acumulator;
    }

    @Override
    public void estePornit() {
        System.out.println("Trimmerul este pornit");
    }

    @Override
    public void esteInReparatii() {
        System.out.println("Trimmerul este in reparatii");

    }
    
}