/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package device;

/**
 *
 * @author Sara
 */
public class Trimmer {
    String brend;
    double greutate;
    int putere;
    String tipMotor;
    boolean acumulator;
    
public Trimmer(){
        brend="Bosch";
        greutate=0.0;
        putere=0;
        tipMotor="electric";
        acumulator=false;
    
}
public Trimmer(String brend, double greutate, int putere, String tipMotor, boolean acumulator){
        this.brend=brend;
        this.greutate=greutate;
        this.putere=putere;
        this.tipMotor=tipMotor;
        this.acumulator=acumulator;
    }
public Trimmer(Trimmer altObiect){
        this.brend=altObiect.brend;
        this.greutate=altObiect.greutate;
        this.putere=altObiect.putere;
        this.tipMotor=altObiect.tipMotor;
        this.acumulator=altObiect.acumulator;
    }
    @Override
    public String toString(){
        return " brend "+brend+" greutate "+greutate+" putere "+putere+ " tipMotor "+tipMotor +" acumulator "+ acumulator;
    }
    

}