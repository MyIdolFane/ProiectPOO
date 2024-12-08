package device;

public class AparatCuratatGeamuri extends Aparat {
    private double lungimeLamela; 
    private boolean areRezervorDetergent;
    private String tipDetergent; 
    
   
    public AparatCuratatGeamuri() {
        super();
        this.lungimeLamela = 0.0;
        this.areRezervorDetergent = false;
        this.tipDetergent = "";
    }
    
   
    public AparatCuratatGeamuri(String nume, String marca, int putere, double greutate, String dimensiuni,
                                String tipAlimentare, boolean estePortabil, int garantie, float pret, String material,
                                double lungimeLamela, boolean areRezervorDetergent, String tipDetergent) {
        super(nume, marca, putere, greutate, dimensiuni, tipAlimentare, estePortabil, garantie, pret, material);
        this.lungimeLamela = lungimeLamela;
        this.areRezervorDetergent = areRezervorDetergent;
        this.tipDetergent = tipDetergent;
    }
    
    
    public AparatCuratatGeamuri(AparatCuratatGeamuri other) {
        super(other);
        this.lungimeLamela = other.lungimeLamela;
        this.areRezervorDetergent = other.areRezervorDetergent;
        this.tipDetergent = other.tipDetergent;
    }
    
    
    public double getLungimeLamela() {
        return lungimeLamela;
    }

    public void setLungimeLamela(double lungimeLamela) {
        this.lungimeLamela = lungimeLamela;
    }

    public boolean isAreRezervorDetergent() {
        return areRezervorDetergent;
    }

    public void setAreRezervorDetergent(boolean areRezervorDetergent) {
        this.areRezervorDetergent = areRezervorDetergent;
    }

    public String getTipDetergent() {
        return tipDetergent;
    }

    public void setTipDetergent(String tipDetergent) {
        this.tipDetergent = tipDetergent;
    }

   
    public void afisare() {
        super.toString();
        System.out.println("Lungime lamelă: " + lungimeLamela + " cm");
        System.out.println("Are rezervor detergent: " + areRezervorDetergent);
        System.out.println("Tip detergent: " + tipDetergent);
    }
}
