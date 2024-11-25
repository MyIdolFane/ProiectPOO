package Pachet;

import java.util.ArrayList;

public class TestAparate {
    public static void main(String[] args) {
        Aparat aparat1 = new Aparat();
        Aparat aparat2 = new Aparat("Samsung", "X100", 1500.5f, (byte)2, "Electrocasnice");
        Aparat aparat3 = new Aparat(aparat2);

        AspiratorUscat aspiratorUscat1 = new AspiratorUscat();
        AspiratorUscat aspiratorUscat2 = new AspiratorUscat("Dyson", "V15", 2500.99f, (byte)3, "Aspirator", (byte)400, 2.5f, true);
        AspiratorUscat aspiratorUscat3 = new AspiratorUscat(aspiratorUscat2);

        AspiratorUmed aspiratorUmed1 = new AspiratorUmed();
        AspiratorUmed aspiratorUmed2 = new AspiratorUmed("Karcher", "WD6", 3500.0f, (byte)5, "Aspirator Umed", (byte)800, 5.0f, true, true, 10.0f);
        AspiratorUmed aspiratorUmed3 = new AspiratorUmed(aspiratorUmed2);

        System.out.println("Aparate:");
        System.out.println(aparat1);
        System.out.println(aparat2);
        System.out.println(aparat3);

        System.out.println("\nAspiratoare Uscate:");
        System.out.println(aspiratorUscat1);
        System.out.println(aspiratorUscat2);
        System.out.println(aspiratorUscat3);

        System.out.println("\nAspiratoare Umede:");
        System.out.println(aspiratorUmed1);
        System.out.println(aspiratorUmed2);
        System.out.println(aspiratorUmed3);

        ArrayList<Aparat> aparate = new ArrayList<>();
        ArrayList<AspiratorUscat> aspiratoareUscate = new ArrayList<>();
        ArrayList<AspiratorUmed> aspiratoareUmede = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            aparate.add(new Aparat("Brand" + i, "Model" + i, 1000.0f + i * 100, (byte)(1 + i % 5), "Categorie" + i));
            aspiratoareUscate.add(new AspiratorUscat("Aspirator" + i, "Model" + i, 2000.0f + i * 150, (byte)(2 + i % 4), "CategorieAspirator", (byte)(100 + i * 20), 1.5f + i * 0.2f, i % 2 == 0));
            aspiratoareUmede.add(new AspiratorUmed("AspiratorUmed" + i, "Model" + i, 3000.0f + i * 200, (byte)(3 + i % 3), "CategorieUmed", (byte)(150 + i * 25), 3.0f + i * 0.5f, i % 2 == 0, true, 5.0f + i));
        }

        System.out.println("\nVector Aparate:");
        for (Aparat aparat : aparate) {
            System.out.println(aparat);
        }

        System.out.println("\nVector Aspiratoare Uscate:");
        for (AspiratorUscat aspirator : aspiratoareUscate) {
            System.out.println(aspirator);
        }

        System.out.println("\nVector Aspiratoare Umede:");
        for (AspiratorUmed aspirator : aspiratoareUmede) {
            System.out.println(aspirator);
        }
    }
}
