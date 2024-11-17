package device;

public class MasinaTunsIarba {
    String tipAlimentare;
    float putereMotor;
    String tipPornire;
    int greutate;
    String culoare;

    public MasinaTunsIarba() {
    }

    public MasinaTunsIarba(String tipAlimentare, float putereMotor, String tipPornire, int greutate, String culoare) {
        this.tipAlimentare = tipAlimentare;
        this.putereMotor = putereMotor;
        this.tipPornire = tipPornire;
        this.greutate = greutate;
        this.culoare = culoare;
    }
    public MasinaTunsIarba(MasinaTunsIarba masina) {
        this.tipAlimentare = masina.tipAlimentare;
        this.putereMotor = masina.putereMotor;
        this.tipPornire = masina.tipPornire;
        this.greutate = masina.greutate;
        this.culoare = masina.culoare;
    }

    @Override
    public String toString() {
        return "MasinaTunsIarba{" + "tipAlimentare=" + tipAlimentare + ", putereMotor=" + putereMotor + ", tipPornire=" + tipPornire + ", greutate=" + greutate + ", culoare=" + culoare + '}';
    }
    
}
