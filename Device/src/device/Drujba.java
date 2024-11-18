/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package device;

/**
 *
 * @author Sara
 */
public class Drujba {
		int anFabricatie;
		double putere;
		String model;
		String culoare;
		String tipAlimentare;

	public Drujba() {   //constructor fara parametrii
			anFabricatie=0;
			putere=0.0;
			model="Kamrad";
			culoare="galben";
			tipAlimentare="benzina";
		}
		
	public Drujba(int anFabricatie, double putere, String model, String culoare, String tipAlimentare) {
		this.anFabricatie=anFabricatie;
		this.putere=putere;
		this.model=model;                 //constructor cu parametrii
		this.culoare=culoare;
		this.tipAlimentare=tipAlimentare;
	}
	
	public Drujba(Drujba altObiect) {  //constructor de copiere
		this.anFabricatie=altObiect.anFabricatie;
		this.putere=altObiect.putere;
		this.model=altObiect.model;
		this.culoare=altObiect.culoare;
		this.tipAlimentare=altObiect.tipAlimentare;

	}
	  @Override
	public String toString() {
		  return " Drujba : " + " anFabricatie= " + anFabricatie + " putere= " + putere + " model= " + model + " culoare= " + culoare + " tipAlimentare= " + tipAlimentare;
	  
	  }

		
		
}
