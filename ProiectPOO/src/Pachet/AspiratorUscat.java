	package Pachet;
	
	public class AspiratorUscat extends Aparat {
		private byte putereAspirare; 
	    private float capacitateRezervor; 
	    private boolean areFiltruHEPA;
	    private boolean areSac;
	    private float capacitateSac;

	    public AspiratorUscat() {
	    	  super();
	          this.putereAspirare = 0;
	          this.capacitateRezervor = 0.0f;
	          this.areFiltruHEPA = false;
	          this.areSac = false;
	          this.capacitateSac = 0.0f;
	          
	    }
	    public AspiratorUscat(String brand, String model, float pret, byte garantie, String categorie, byte putereAspirare, float capacitateRezervor, boolean areFiltruHEPA) {
	    	super();
	    	this.putereAspirare = putereAspirare;
	    	this.capacitateRezervor = capacitateRezervor;
	    	this.areFiltruHEPA = areFiltruHEPA;
	    	this.areSac = areSac;
	    	this.capacitateSac = capacitateSac;
	    }
	    public AspiratorUscat(AspiratorUscat other) {
	    	super(other);
	        this.putereAspirare = other.putereAspirare;
	        this.capacitateRezervor = other.capacitateRezervor;
	        this.areFiltruHEPA = other.areFiltruHEPA;
	        this.areSac = areSac;
	    	this.capacitateSac = capacitateSac;
	    } 
	    public String toString() {
	        return "Aspirator{" +
	                super.toString() +
	                ", putereAspirare=" + putereAspirare +
	                ", capacitateRezervor=" + capacitateRezervor +
	                ", areFiltruHEPA=" + areFiltruHEPA +
	                ", areSac=" + areSac + "capacitateSac=" + capacitateSac +
	                '}'; 
	}
	}