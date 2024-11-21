package device;
import java.util.*;
public class AparateTest {

	public static void main(String[] args) {
		//Masini de tuns iarba 
                MasinaTunsIarba myMachine = new MasinaTunsIarba("benzina",3.4f,"buton", (byte)12, "rosie", "Grunman" , "ASMR3", 345.9f, (byte)3, "Aparat de gradinarit"  );
		MasinaTunsIarba myMachineCopy = new MasinaTunsIarba(myMachine);
		MasinaTunsIarba hisMachine = new MasinaTunsIarba();
                System.out.println("Afisare masini de tuns iarba : ");
                System.out.println(" Afrisare myMachine : " + myMachine);
                System.out.println(" Afisare myMachineCopy : " + myMachineCopy );
                System.out.println(" Afisare hisMachine : " + hisMachine);
                // motosape 
                Motosapa myMotosapa = new Motosapa("sfoara", "benzina", 225, (byte)4, (byte)4, "Honda", "F560KV", 8533.9f, (byte)4, "Aparat de gradinarit");
                Motosapa myMotosapaCopy = new Motosapa(myMotosapa);
                Motosapa yourMotosapa = new Motosapa();
                System.out.println("Afisare motosape : ");
                System.out.println(" Afisare myMotosapa :\n " + myMotosapa);
                System.out.println(" Afisare myMotosapaCopy :\n " + myMotosapaCopy );
                System.out.println(" Afisare yourMotosapa :\n " + yourMotosapa);
                //TEMA 2 DENIS 
                MasinaTunsIarba grassCutterProduceNumber1 = new MasinaTunsIarba("benzina",3.4f,"sfoara", (byte)41, "red", "Grunman" , "ASMR3", 1749.90f, (byte)4, "Aparat de gradinarit"  );
                MasinaTunsIarba grassCutterProduceNumber2 = new MasinaTunsIarba("motorina",3.5f,"sfoara", (byte)56, "green", "Honda" , "LMO", 899.99f, (byte)2, "Aparat de gradinarit"  );
                MasinaTunsIarba grassCutterProduceNumber3 = new MasinaTunsIarba("benzina",4.2f,"sfoara", (byte)60, "yellow", "Wolfson" , "Stanley", 792.96f, (byte)2, "Aparat de gradinarit"  );
                MasinaTunsIarba grassCutterProduceNumber4 = new MasinaTunsIarba("curent electric",3.0f,"buton", (byte)45, "rosie", "Bosch" , "ARM 3400", 649.90f, (byte)2, "Aparat de gradinarit"  );
                MasinaTunsIarba grassCutterProduceNumber5 = new MasinaTunsIarba("motorina",4.5f,"buton", (byte)50, "blue", "Karcher" , "", 2999.99f, (byte)5, "Aparat de gradinarit"  );
                MasinaTunsIarba grassCutterProduceNumber6 = new MasinaTunsIarba("benzina",3.4f,"buton", (byte)52, "black", "Dewalt" , "T400I", 3164.73f, (byte)4, "Aparat de gradinarit"  );
                MasinaTunsIarba grassCutterProduceNumber7 = new MasinaTunsIarba("curent electric",2.8f,"buton", (byte)38, "yellow", "Riobi" , "R46", 2195.00f, (byte)3, "Aparat de gradinarit"  );
                MasinaTunsIarba grassCutterProduceNumber8 = new MasinaTunsIarba("motorina",5f,"sfoara", (byte)65, "green", "Samsung" , "ProGarden S421-T6", 1855.99f, (byte)2, "Aparat de gradinarit"  );
                MasinaTunsIarba grassCutterProduceNumber9 = new MasinaTunsIarba("benzina",3.9f,"sfoara", (byte)40, "red", "IHunt" , "E148C", 1899.90f, (byte)3, "Aparat de gradinarit"  );
                MasinaTunsIarba grassCutterProduceNumber10 = new MasinaTunsIarba("curent electric",3.2f,"buton", (byte)40, "black", "Hyundai" , "HY-LM4601 GT", 1478.00f, (byte)3, "Aparat de gradinarit"  );
                
                System.out.println("Vectorul de masini de tuns iarba este : ");
                Set<MasinaTunsIarba> listaMasiniTunsIarba = new HashSet<>();
                listaMasiniTunsIarba.add(grassCutterProduceNumber1);
                listaMasiniTunsIarba.add(grassCutterProduceNumber2);
                listaMasiniTunsIarba.add(grassCutterProduceNumber3);
                listaMasiniTunsIarba.add(grassCutterProduceNumber4);
                listaMasiniTunsIarba.add(grassCutterProduceNumber5);
                listaMasiniTunsIarba.add(grassCutterProduceNumber6);
                listaMasiniTunsIarba.add(grassCutterProduceNumber7);
                listaMasiniTunsIarba.add(grassCutterProduceNumber8);
                listaMasiniTunsIarba.add(grassCutterProduceNumber9);
                listaMasiniTunsIarba.add(grassCutterProduceNumber10);
                for(MasinaTunsIarba item :listaMasiniTunsIarba)
                    System.out.println(item);
                
                //Teste Sara
                Drujba drujbaMea= new Drujba();
                Drujba drujbaVeche=new Drujba(2009, 5.6, "Kamrad", "violet", "motorina");
                Drujba drujbaNoua=new Drujba(drujbaVeche);
                System.out.println(drujbaMea);
                System.out.println(drujbaVeche);
                System.out.println(drujbaNoua);
        
                Trimmer  myTrimmer = new Trimmer();
                Trimmer yourTrimmer = new Trimmer( "Trimmer", 1.7, 280, "electric", false);
                Trimmer hisTrimmer = new Trimmer(yourTrimmer);
                System.out.println(myTrimmer);
                System.out.println(yourTrimmer);
                System.out.println(hisTrimmer);


                
                
	}

}