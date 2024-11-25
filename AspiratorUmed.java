package Pachet;

public class AspiratorUmed extends AspiratorUscat{
	 private boolean suportaLichide;
	 private boolean areFunctieUscare;
	 
	 public AspiratorUmed() {
		 super();
	     this.suportaLichide = false;
	     this.areFunctieUscare = false;
	 }
	 public AspiratorUmed(String brand,String model, double pret, int garantie, String categorie, int putereAspirare, double capacitateRezervor, boolean areFiltruHEPA, boolean suportaLichide, boolean areFunctieUscare) {
		 super(brand, model, pret, garantie, categorie, putereAspirare, capacitateRezervor, areFiltruHEPA);
		 this.suportaLichide = suportaLichide;
	     this.areFunctieUscare = areFunctieUscare;
	}
	 public AspiratorUmed(AspiratorUmed other) {
	        super(other);
	        this.suportaLichide = other.suportaLichide;
	        this.areFunctieUscare = other.areFunctieUscare;
	    }
	 public String toString() {
	        return "AspiratorUmed{" +
	                super.toString() +
	                ", suportaLichide=" + suportaLichide +
	                ", areFunctieUscare=" + areFunctieUscare +
	                '}';
	    }

}
