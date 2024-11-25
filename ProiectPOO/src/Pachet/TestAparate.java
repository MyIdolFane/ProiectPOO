package Pachet;

import java.util.ArrayList;
import java.util.Scanner;

public class TestAparate {

    public static void main(String[] args) {

        ArrayList<Aparat> aparate = new ArrayList<>();
        ArrayList<AspiratorUscat> aspiratoareUscate = new ArrayList<>();
        ArrayList<AspiratorUmed> aspiratoareUmede = new ArrayList<>();

     
        aparate.add(new Aparat("Samsung", "X100", 1500.5f, (byte)2, "Electrocasnice"));
        aspiratoareUscate.add(new AspiratorUscat("Dyson", "V15", 2500.99f, (byte)3, "Aspirator", (byte)400, 2.5f, true));
        aspiratoareUmede.add(new AspiratorUmed("Karcher", "WD6", 3500.0f, (byte)5, "Aspirator Umed", (byte)800, 5.0f, true, true, 10.0f));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceți brandul:");
        String brandCautat = scanner.nextLine();
        
        System.out.println("Introduceți prețul minim:");
        float pretMinim = scanner.nextFloat();
        
        System.out.println("Introduceți prețul maxim:");
        float pretMaxim = scanner.nextFloat();

        System.out.println("\nAparate care satisfac condițiile:");
        for (Aparat aparat : aparate) {
            if (aparat.getBrand().equalsIgnoreCase(brandCautat) && aparat.getPret() >= pretMinim && aparat.getPret() <= pretMaxim) {
                System.out.println(aparat);
            }
        }

        System.out.println("\nAspiratoare Uscate care satisfac condițiile:");
        for (AspiratorUscat aspirator : aspiratoareUscate) {
            if (aspirator.getBrand().equalsIgnoreCase(brandCautat) && aspirator.getPret() >= pretMinim && aspirator.getPret() <= pretMaxim) {
                System.out.println(aspirator);
            }
        }

        System.out.println("\nAspiratoare Umede care satisfac condițiile:");
        for (AspiratorUmed aspirator : aspiratoareUmede) {
            if (aspirator.getBrand().equalsIgnoreCase(brandCautat) && aspirator.getPret() >= pretMinim && aspirator.getPret() <= pretMaxim) {
                System.out.println(aspirator);
            }
        }
    }
}
