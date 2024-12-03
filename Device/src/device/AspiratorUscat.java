	package device;
	
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
	    public void setPutereAspirare(byte putereAspirare) {
	        this.putereAspirare = putereAspirare;
	    }
	    public byte getPutereAspirare() {
	        return putereAspirare;
	    }
	    public void setCapacitateRezervor(float capacitateRezervor) {
	        this.capacitateRezervor = capacitateRezervor;
	    } 
	    public float getCapacitateRezervor() {
	        return capacitateRezervor;
	    }
	    public void setAreFiltruHEPA(boolean areFiltruHEPA) {
	        this.areFiltruHEPA = areFiltruHEPA;
	    }
	    public boolean isAreFiltruHEPA() {
	        return areFiltruHEPA;
	    }
	    public void setAreSac(boolean areSac) {
	        this.areSac = areSac;
	    }
	    public boolean isAreSac() {
	        return areSac;
	    }
	    public void setCapacitateSac(float capacitateSac) {
	        this.capacitateSac = capacitateSac;
	    }
	    public float getCapacitateSac() {
	        return capacitateSac;
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