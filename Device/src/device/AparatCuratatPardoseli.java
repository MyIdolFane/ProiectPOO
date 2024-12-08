package device;

public class AparatCuratatPardoseli extends Aparat {
    private boolean areRezervorApa;
    private int capacitateRezervor;
    private String tipPerii;

   
    public AparatCuratatPardoseli() {
        super();
        this.areRezervorApa = false;
        this.capacitateRezervor = 0;
        this.tipPerii = "";
    }

  
    public AparatCuratatPardoseli(String nume, String marca, int putere, double greutate, String dimensiuni,
                                  String tipAlimentare, boolean estePortabil, int garantie, float pret, String material,
                                  boolean areRezervorApa, int capacitateRezervor, String tipPerii) {
        super(nume, marca, putere, greutate, dimensiuni, tipAlimentare, estePortabil, garantie, pret, material);
        this.areRezervorApa = areRezervorApa;
        this.capacitateRezervor = capacitateRezervor;
        this.tipPerii = tipPerii;
    }

 
    public AparatCuratatPardoseli(AparatCuratatPardoseli other) {
        super(other);
        this.areRezervorApa = other.areRezervorApa;
        this.capacitateRezervor = other.capacitateRezervor;
        this.tipPerii = other.tipPerii;
    }

    
    public boolean isAreRezervorApa() {
        return areRezervorApa;
    }

    public void setAreRezervorApa(boolean areRezervorApa) {
        this.areRezervorApa = areRezervorApa;
    }

    public int getCapacitateRezervor() {
        return capacitateRezervor;
    }

    public void setCapacitateRezervor(int capacitateRezervor) {
        this.capacitateRezervor = capacitateRezervor;
    }

    public String getTipPerii() {
        return tipPerii;
    }

    public void setTipPerii(String tipPerii) {
        this.tipPerii = tipPerii;
    }

    
    public void afisare() {
        super.toString();
        System.out.println("Are rezervor apă: " + areRezervorApa);
        System.out.println("Capacitate rezervor: " + capacitateRezervor + " litri");
        System.out.println("Tip perii: " + tipPerii);
    }

    
    public String toString() {
        return super.toString() + ", AparatCuratatPardoseli{" +
                "areRezervorApa=" + areRezervorApa +
                ", capacitateRezervor=" + capacitateRezervor +
                ", tipPerii='" + tipPerii + '\'' +
                '}';
    }
}
