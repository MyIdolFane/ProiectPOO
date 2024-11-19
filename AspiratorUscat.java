	package Pachet;
	
	public class AspiratorUscat extends Aparat {
		private int putereAspirare; 
	    private double capacitateRezervor; 
	    private boolean areFiltruHEPA;
	    
	    public AspiratorUscat() {
	    	  super();
	          this.putereAspirare = 0;
	          this.capacitateRezervor = 0.0;
	          this.areFiltruHEPA = false;	
	    }
	    public AspiratorUscat(String brand,String model, double pret, int garantie, String categorie, int putereAspirare, double capacitateRezervor, boolean areFiltruHEPA) {
	    	super(brand, model, pret, garantie, categorie);
	    	this.putereAspirare = putereAspirare;
	    	this.capacitateRezervor = capacitateRezervor;
	    	this.areFiltruHEPA = areFiltruHEPA;
	    }
	    public AspiratorUscat(AspiratorUscat other) {
	    	super(other);
	        this.putereAspirare = other.putereAspirare;
	        this.capacitateRezervor = other.capacitateRezervor;
	        this.areFiltruHEPA = other.areFiltruHEPA;
	    } 
	    public String toString() {
	        return "Aspirator{" +
	                super.toString() +
	                ", putereAspirare=" + putereAspirare +
	                ", capacitateRezervor=" + capacitateRezervor +
	                ", areFiltruHEPA=" + areFiltruHEPA +
	                '}';
	}
	}
