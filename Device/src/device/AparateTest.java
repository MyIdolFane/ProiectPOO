package device;

public class AparateTest {

	public static void main(String[] args) {
		//Masini de tuns iarba 
                MasinaTunsIarba myMachine = new MasinaTunsIarba("benzina",3.4f,"buton", 12, "rosie");
		MasinaTunsIarba myMachineCopy = new MasinaTunsIarba(myMachine);
		MasinaTunsIarba hisMachine = new MasinaTunsIarba();
                System.out.println("Afisare masini de tuns iarba : ");
                System.out.println(" myMachine : " + myMachine);
                System.out.println(" myMachineCopy : " + myMachineCopy );
                System.out.println(" hisMachine : " + hisMachine);
                // motosape 
                Motosapa myMotosapa = new Motosapa("sfoara", "benzina", 225, 4,4);
                Motosapa myMotosapaCopy = new Motosapa(myMotosapa);
                Motosapa yourMotosapa = new Motosapa();
                System.out.println("Afisare motosape : ");
                System.out.println(" myMotosapa : " + myMotosapa);
                System.out.println(" myMotosapaCopy : " + myMotosapaCopy );
                System.out.println(" yourMotosapa : " + yourMotosapa);
                


                
                
	}

}
