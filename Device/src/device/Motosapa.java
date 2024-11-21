package device;

public class Motosapa extends Aparat implements Comportament {
      private String tipPornire;
      private String tipAlimentare;
      private int capacitateCilindrica;
      private byte putereMotor;
      private byte numarViteze;

    public Motosapa() {
        super();
    }

    public Motosapa(String tipPornire, String tipAlimentare, int capacitateCilindrica, byte putereMotor, byte numarViteze, String brand,String model, float pret, byte garantie, String categorie) {
        super( brand, model, pret, garantie, categorie);
        this.tipPornire = tipPornire;
        this.tipAlimentare = tipAlimentare;
        this.capacitateCilindrica = capacitateCilindrica;
        this.putereMotor = putereMotor;
        this.numarViteze = numarViteze;
    }
    
    public Motosapa(Motosapa motosapa) {
        super(motosapa);
        this.tipPornire = motosapa.tipPornire;
        this.tipAlimentare = motosapa.tipAlimentare;
        this.capacitateCilindrica = motosapa.capacitateCilindrica;
        this.putereMotor = motosapa.putereMotor;
        this.numarViteze = motosapa.numarViteze;
    }   

    public String getTipPornire() {
        return tipPornire;
    }

    public void setTipPornire(String tipPornire) {
        this.tipPornire = tipPornire;
    }

    public String getTipAlimentare() {
        return tipAlimentare;
    }

    public void setTipAlimentare(String tipAlimentare) {
        this.tipAlimentare = tipAlimentare;
    }

    public int getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    public void setCapacitateCilindrica(int capacitateCilindrica) {
        this.capacitateCilindrica = capacitateCilindrica;
    }

    public int getPutereMotor() {
        return putereMotor;
    }

    public void setPutereMotor(byte putereMotor) {
        this.putereMotor = putereMotor;
    }

    public int getNumarViteze() {
        return numarViteze;
    }

    public void setNumarViteze(byte numarViteze) {
        this.numarViteze = numarViteze;
    }
    
    
    @Override
    public String toString() {
        return "Motosapa{" + "tipPornire=" + tipPornire + ", tipAlimentare=" + tipAlimentare + ", capacitateCilindrica=" + capacitateCilindrica + ", putereMotor=" + putereMotor + ", numarViteze=" + numarViteze + '}';
    }

    @Override
    public void estePornit() {
        System.out.println("Motosapa este pornita");
    }

    @Override
    public void esteInReparatii() {
        System.out.println("Motosapa este in hambar si trebuie reparata");
    }
    
}