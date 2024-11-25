package Pachet;

public class AspiratorUmed extends AspiratorUscat{
	 private boolean suportaLichide;
	 private boolean areFunctieUscare;
	 private boolean functieSpalare;
	 private float capacitateApa;
	 
	 public AspiratorUmed() {
		 super();
	     this.suportaLichide = false;
	     this.areFunctieUscare = false;
	     this.functieSpalare = false;
	     this.capacitateApa = 0.0f;
	 }
	 public AspiratorUmed(String brand, String model, float pret, byte garantie, String categorie, byte putereAspirare, float capacitateRezervor, boolean areFiltruHEPA, boolean areSac, float capacitateSac) {
		 super();
		 this.suportaLichide = suportaLichide;
	     this.areFunctieUscare = areFunctieUscare;
	     this.functieSpalare = functieSpalare;
	     this.capacitateApa = capacitateApa;
	}
	 public AspiratorUmed(AspiratorUmed other) {
	        super(other);
	        this.suportaLichide = other.suportaLichide;
	        this.areFunctieUscare = other.areFunctieUscare;
	        this.functieSpalare = other.functieSpalare;
	        this.capacitateApa = other.capacitateApa;
	    }
	 public String toString() {
	        return "AspiratorUmed{" +
	                super.toString() +
	                ", suportaLichide=" + suportaLichide +
	                ", areFunctieUscare=" + areFunctieUscare +
	                ", functieSpalare=" + functieSpalare + ", capacitateApa=" + capacitateApa +
	                '}';
	    }

}
