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
                
                Motosapa motosapaProduceNumber1 = new Motosapa("sfoara", "benzina", 225, (byte)2.9, (byte)4, "Stihl ", "MH 445", 4999.9f, (byte)4, "Aparat de gradinarit");
                Motosapa motosapaProduceNumber2 = new Motosapa("buton", "motorina", 125, (byte)2, (byte)3, "Husqvarna ", "TF 338", 1299.9f, (byte)2, "Aparat de gradinarit");
                Motosapa motosapaProduceNumber3 = new Motosapa("sfoara", "benzina", 250, (byte)3.9, (byte)4, "Bertolini ", "451 S", 2999.9f, (byte)3, "Aparat de gradinarit");
                Motosapa motosapaProduceNumber4 = new Motosapa("buton", "motorina", 300, (byte)5, (byte)5, "McCulloch ", "MFT 44", 2593.9f, (byte)3, "Aparat de gradinarit");
                Motosapa motosapaProduceNumber5 = new Motosapa("sfoara", "motorina", 125, (byte)3.2, (byte)2, "Oleo-Mac", "MH 175", 999.9f, (byte)1, "Aparat de gradinarit");
                Motosapa motosapaProduceNumber6 = new Motosapa("buton", "benzina", 225, (byte)4.5, (byte)3, "Grillo ", "G 85", 1239.9f, (byte)2, "Aparat de gradinarit");
                Motosapa motosapaProduceNumber7 = new Motosapa("sfoara", "benzina", 400, (byte)3.4, (byte)5, "Echo ", "MTP 850", 3999.9f, (byte)4, "Aparat de gradinarit");
                Motosapa motosapaProduceNumber8 = new Motosapa("sfoara", "motorina", 125, (byte)5, (byte)2, "Kasei ", "KMS 400", 1599.9f, (byte)3, "Aparat de gradinarit");
                Motosapa motosapaProduceNumber9 = new Motosapa("sfoara", "motorina", 225, (byte)4.9, (byte)3, "WOLF-Garten", "A 560", 1499.9f, (byte)3, "Aparat de gradinarit");
                Motosapa motosapaProduceNumber10 = new Motosapa("sfoara", "benzina", 225, (byte)4, (byte)3, "Honda", "F220", 1299.9f, (byte)2, "Aparat de gradinarit"); 
                
                ArrayList<Motosapa> listaMotosape = new ArrayList<>();
                listaMotosape.add(motosapaProduceNumber1);
                listaMotosape.add(motosapaProduceNumber2);
                listaMotosape.add(motosapaProduceNumber3);
                listaMotosape.add(motosapaProduceNumber4);
                listaMotosape.add(motosapaProduceNumber5);
                listaMotosape.add(motosapaProduceNumber6);
                listaMotosape.add(motosapaProduceNumber7);
                listaMotosape.add(motosapaProduceNumber8);
                listaMotosape.add(motosapaProduceNumber9);
                listaMotosape.add(motosapaProduceNumber10);

                for (int i =0; i<listaMotosape.size();i=i+3)
                    System.out.println(listaMotosape.get(i));
                
                
                for(Motosapa item: listaMotosape )
                    System.out.println(item);
                
                
                
                //Teste Sara
                Drujba drujbaMea= new Drujba(); //String brand,String model, float pret, byte garantie, String categorie
                Drujba drujbaVeche=new Drujba(2009, 5.6, "Kamrad", "violet", "motorina", "Campion", "nou", 200.0f, (byte)3, "aparata de gradinarit");
                Drujba drujbaNoua=new Drujba(drujbaVeche);
                System.out.println(drujbaMea);
                System.out.println(drujbaVeche);
                System.out.println(drujbaNoua);
        
                Trimmer  myTrimmer = new Trimmer();
                Trimmer yourTrimmer = new Trimmer( 32, 1.7, 280, "electric", false, "Fujitsu", "vechi", 299.99f,(byte) 2, "aparat de gradinarit");
                Trimmer hisTrimmer = new Trimmer(yourTrimmer);
                System.out.println(myTrimmer);
                System.out.println(yourTrimmer);
                System.out.println(hisTrimmer);
                
                //lista 10 drujbe
                //int anFabricatie, double putere, String modelDrujba, String culoare, String tipAlimentare, String brand,String model, float pret, byte garantie, String categorie
                Drujba numarul1 = new Drujba(2004, 2.3, "Stihl MS 170 ", "albastru", "gaz", "Stihl", "noua", 3000f, (byte) 2, "aparat de taiat lemne" );
                Drujba numarul2 = new Drujba( 2005, 2.9, " Dolmar PS-6100", "negru", "benzina","Dolmar", "veche", 1679f, (byte) 3, "aparat de taiat lemne" );
                Drujba numarul3 = new Drujba (2006, 1.8, "Husqvarna 120 Mark II","verde", "motorina","Husqvarna","noua", 2392f, (byte) 1, "aparat de taiat lemne" );
                Drujba numarul4 = new Drujba(2007, 2.4, "Makita EA6100P53E ", "galben", "electrică ", "Makita", "noua", 1790f, (byte) 4, "aparat de taiat lemne" );
                Drujba numarul5 = new Drujba(2008, 2.5, "Echo CS-590 Timber Wolf", "rosu", "pe baterie ", "Echo", "noua", 1990f, (byte) 5, "aparat de taiat lemne" );
                Drujba numarul6 = new Drujba(numarul2);
                Drujba numarul7 = new Drujba(2010, 3.3, "Oleo-Mac GS 451 ", "gri", "pneumatică", "Oleo-Mac", "noua", 1289f, (byte) 1, "aparat de taiat lemne" );
                Drujba numarul8 = new Drujba(2011, 3.0, "McCulloch CS 450 Elite ", "violet", "bioetanol", "McCulloch", "noua", 2372f, (byte) 3, "aparat de taiat lemne" );
                Drujba numarul9 = new Drujba(2012, 3.5, "Ryobi RCS5145B ", "mov", "Combustibil sintetic", "Ryobi", "noua", 3278f, (byte) 4, "aparat de taiat lemne" );
                Drujba numarul10 = new Drujba(2013, 1.3, "Poulan Pro PR4218", "alb", "Combustibil sintetic", "Poulan Pro", "noua", 1590f, (byte) 2, "aparat de taiat lemne" );

                List<Drujba> drujbaList=new ArrayList<>();
                drujbaList.add(numarul1);
                drujbaList.add(numarul2);
                drujbaList.add(numarul3);
                drujbaList.add(numarul4);
                drujbaList.add(numarul5);
                drujbaList.add(numarul6);
                drujbaList.add(numarul7);
                drujbaList.add(numarul8);
                drujbaList.add(numarul9);
                drujbaList.add(numarul10);
                
               for(Drujba i : drujbaList){
                    System.out.println(i);
                }
                for (Drujba i : drujbaList){
                   if(i.getAnFabricatie()>=2011 && i.getPutere()>3)
                     System.out.println(i);
                }
                
                
                List<Trimmer> trimmerList =new ArrayList<>();
                
                Trimmer trimmer1 = new Trimmer ( 42, 2.0, 280, "electric", true, "Stihl", "FS 55", 299.99f,(byte) 2, "aparat de gradinarit");
                Trimmer trimmer2 = new Trimmer ( 32, 1.7, 1000, "benzina", false, "Husqvarna", "128R", 349.99f,(byte) 4, "aparat de gradinarit");
                Trimmer trimmer3 = new Trimmer ( 36, 1, 320, "motorina", false, "Makita", "UR3000", 599.99f,(byte) 3, "aparat de gradinarit");
                Trimmer trimmer4 = new Trimmer ( 40, 1.3, 500, "benzina", false, "Echo", "SRM-225", 299.99f,(byte) 2, "aparat de gradinarit");
                Trimmer trimmer5 = new Trimmer ( 39, 3.2, 405, "electric", true, "Honda", " UMS425", 342.99f,(byte) 1, "aparat de gradinarit");
                Trimmer trimmer6 = new Trimmer ( 45, 2.3, 459, "benzina", false, "Bosch", "GL7033", 449.99f,(byte) 5, "aparat de gradinarit");
                Trimmer trimmer7 = new Trimmer ( 37, 2.1, 439, "motorina", false, "Ryobi", "ART 30-36 LI", 554.99f,(byte) 3, "aparat de gradinarit");
                Trimmer trimmer8 = new Trimmer ( 23, 1.9, 640, "electric", true, "Gardena", "RBC30SB", 279.99f,(byte) 4, "aparat de gradinarit");
                Trimmer trimmer9 = new Trimmer ( 29, 3.5, 499, "benzina", false, "Oleo-Mac", "450", 329.99f,(byte) 5, "aparat de gradinarit");
                Trimmer trimmer10 = new Trimmer ( 27, 1.6, 180, "motorina", false, "Black+Decker", "Sparta 2500", 300.00f,(byte) 2, "aparat de gradinarit");
                
                trimmerList.add(trimmer1);
                trimmerList.add(trimmer2);
                trimmerList.add(trimmer3);
                trimmerList.add(trimmer4);
                trimmerList.add(trimmer5);
                trimmerList.add(trimmer6);
                trimmerList.add(trimmer7);
                trimmerList.add(trimmer8);
                trimmerList.add(trimmer9);
                trimmerList.add(trimmer10);
                
               for (Trimmer i : trimmerList)
                   System.out.println(i);
               for (Trimmer i : trimmerList){
                   if(i.getDiametruDeTaiere()>=40 && i.getGreutate()<=2.0)
                       System.out.println(i);
                       }
	}
}
/*
for (Drujba i : drujbaList){
         if(i.getModelDrujba().equals("un model") && i.getCuloare().equals("albastru"))
         System.out.println(i);
           }
*/