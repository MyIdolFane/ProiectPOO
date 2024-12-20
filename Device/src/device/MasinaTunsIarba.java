package device;
import java.io.Serializable;

public class MasinaTunsIarba extends Aparat implements Comportament,Serializable {
   private String tipAlimentare;
   private float putereMotor;
   private String tipPornire;
   private byte latimeTaiere;
   private String culoare;

    public MasinaTunsIarba() {
        super();
    }

    public MasinaTunsIarba(String brand, String model, String tipAlimentare, float putere, String tipPornire, byte latimeTaiere,String culoare, float pret, byte garantie, String categorie) {
        super( brand, model, pret, garantie, categorie);
        this.tipAlimentare = tipAlimentare;
        this.putereMotor = putere;
        this.tipPornire = tipPornire;
        this.latimeTaiere = latimeTaiere;
        this.culoare = culoare;
    }
    public MasinaTunsIarba(MasinaTunsIarba masina) {
        super(masina);
        this.tipAlimentare = masina.tipAlimentare;
        this.putereMotor = masina.putereMotor;
        this.tipPornire = masina.tipPornire;
        this.latimeTaiere = masina.latimeTaiere;
        this.culoare = masina.culoare;
    }

    public String getTipAlimentare() {
        return tipAlimentare;
    }

    public void setTipAlimentare(String tipAlimentare) {
        this.tipAlimentare = tipAlimentare;
    }

    public float getPutereMotor() {
        return putereMotor;
    }

    public void setPutereMotor(float putereMotor) {
        this.putereMotor = putereMotor;
    }

    public String getTipPornire() {
        return tipPornire;
    }

    public void setTipPornire(String tipPornire) {
        this.tipPornire = tipPornire;
    }

    public byte getLatimeTaiere() {
        return latimeTaiere;
    }

    public void setLatimeTaiere(byte latimeTaiere) {
        this.latimeTaiere = latimeTaiere;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    
    
    @Override
    public String toString() {
        super.toString();
        return " Masina de tuns iarba : \n" + "Tip alimentare = " + tipAlimentare + " ; " 
                + "Putere motor = " + putereMotor + " ; " + "Tip pornire = " + tipPornire + " ; " + "Latime taiere = " + latimeTaiere + " ; " 
                +  "Culoare = " + culoare + " ; " + super.toString();
    }
    public String afisare(){
    return super.getBrand() + "," + super.getModel() + "," + tipAlimentare + "," + putereMotor + "," + tipPornire + "," + latimeTaiere + "," + culoare + "," + super.getPret() + "," + super.getGarantie() + "," + super.getCategorie();
    }

    @Override
    public void estePornit() {
        System.out.println("Masina de tuns iarba este pornita si tunde iarba");
    }

    @Override
    public void esteInReparatii() {
        System.out.println("Masina de tuns iarba este stricata si are nevoie de reparatii");
    }
    
}