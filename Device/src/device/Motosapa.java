package device;

public class Motosapa extends Aparat{
      private String tipPornire;
      private String tipAlimentare;
      private int capacitateCilindrica;
      private int putereMotor;
      private int numarViteze;

    public Motosapa() {
    }

    public Motosapa(String tipPornire, String tipAlimentare, int capacitateCilindrica, int putereMotor, int numarViteze) {
        this.tipPornire = tipPornire;
        this.tipAlimentare = tipAlimentare;
        this.capacitateCilindrica = capacitateCilindrica;
        this.putereMotor = putereMotor;
        this.numarViteze = numarViteze;
    }
    
    public Motosapa(Motosapa motosapa) {
        this.tipPornire = motosapa.tipPornire;
        this.tipAlimentare = motosapa.tipAlimentare;
        this.capacitateCilindrica = motosapa.capacitateCilindrica;
        this.putereMotor = motosapa.putereMotor;
        this.numarViteze = motosapa.numarViteze;
    }   

    @Override
    public String toString() {
        return "Motosapa{" + "tipPornire=" + tipPornire + ", tipAlimentare=" + tipAlimentare + ", capacitateCilindrica=" + capacitateCilindrica + ", putereMotor=" + putereMotor + ", numarViteze=" + numarViteze + '}';
    }
    
}
