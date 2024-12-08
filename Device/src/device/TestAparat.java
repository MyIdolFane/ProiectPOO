package device;

import java.util.ArrayList;

public class TestAparat {
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
      
                Aparat[] aparate = new Aparat[10];
                aparate[0] = new Aparat("Samsung", "ModelX", 1200.0f, (byte) 2, "Electrocasnice");
                aparate[1] = new Aparat("LG", "CleanPro", 1500.0f, (byte) 3, "Electrocasnice");
                aparate[2] = new Aparat("Philips", "DustAway", 900.0f, (byte) 1, "Electrocasnice");
                aparate[3] = new Aparat("Bosch", "AquaPlus", 1100.0f, (byte) 2, "Electrocasnice");
                aparate[4] = new Aparat("Dyson", "CycloneV10", 2500.0f, (byte) 5, "Premium");
                aparate[5] = new Aparat("Rowenta", "AirForce", 800.0f, (byte) 1, "Electrocasnice");
                aparate[6] = new Aparat("Electrolux", "ECO200", 1000.0f, (byte) 3, "Electrocasnice");
                aparate[7] = new Aparat("Miele", "SilentClean", 3000.0f, (byte) 4, "Premium");
                aparate[8] = new Aparat("Xiaomi", "MiVacuum", 700.0f, (byte) 1, "Electrocasnice");
                aparate[9] = new Aparat("Beko", "QuickClean", 650.0f, (byte) 2, "Electrocasnice");

                AspiratorUscat[] aspiratoareUscate = new AspiratorUscat[10];
                aspiratoareUscate[0] = new AspiratorUscat("Samsung", "DryClean", 1200.0f, (byte) 2, "AspiratorUscat", (byte) 200, 2.0f, true);
                aspiratoareUscate[1] = new AspiratorUscat("LG", "DustHunter", 1400.0f, (byte) 3, "AspiratorUscat", (byte) 220, 3.5f, false);
                aspiratoareUscate[2] = new AspiratorUscat("Philips", "DryForce", 1100.0f, (byte) 1, "AspiratorUscat", (byte) 180, 2.2f, true);
                aspiratoareUscate[3] = new AspiratorUscat("Bosch", "PowerDust", 1600.0f, (byte) 4, "AspiratorUscat", (byte) 240, 3.0f, false);
                aspiratoareUscate[4] = new AspiratorUscat("Dyson", "CycloneDry", 3000.0f, (byte) 5, "AspiratorUscat", (byte) 300, 1.5f, true);
                aspiratoareUscate[5] = new AspiratorUscat("Rowenta", "CleanMax", 1300.0f, (byte) 2, "AspiratorUscat", (byte) 200, 2.8f, true);
                aspiratoareUscate[6] = new AspiratorUscat("Electrolux", "DustEater", 900.0f, (byte) 1, "AspiratorUscat", (byte) 160, 2.0f, false);
                aspiratoareUscate[7] = new AspiratorUscat("Miele", "AirDust", 3500.0f, (byte) 5, "AspiratorUscat", (byte) 250, 4.0f, true);
                aspiratoareUscate[8] = new AspiratorUscat("Xiaomi", "VacDry", 800.0f, (byte) 2, "AspiratorUscat", (byte) 150, 1.8f, false);
                aspiratoareUscate[9] = new AspiratorUscat("Beko", "DustPro", 700.0f, (byte) 2, "AspiratorUscat", (byte) 170, 2.5f, true);

          
                AspiratorUmed[] aspiratoareUmede = new AspiratorUmed[10];
                aspiratoareUmede[0] = new AspiratorUmed("Samsung", "WetClean", 1500.0f, (byte) 3, "AspiratorUmed", (byte) 200, 2.0f, true, true, 2.5f);
                aspiratoareUmede[1] = new AspiratorUmed("LG", "AquaForce", 1600.0f, (byte) 3, "AspiratorUmed", (byte) 220, 3.5f, true, true, 3.0f);
                aspiratoareUmede[2] = new AspiratorUmed("Philips", "WetForce", 1400.0f, (byte) 2, "AspiratorUmed", (byte) 190, 2.2f, true, true, 1.8f);
                aspiratoareUmede[3] = new AspiratorUmed("Bosch", "AquaClean", 1800.0f, (byte) 4, "AspiratorUmed", (byte) 250, 3.0f, true, true, 3.5f);
                aspiratoareUmede[4] = new AspiratorUmed("Dyson", "WetCyclone", 3200.0f, (byte) 5, "AspiratorUmed", (byte) 280, 1.5f, true, true, 1.0f);
                aspiratoareUmede[5] = new AspiratorUmed("Rowenta", "AquaMax", 1300.0f, (byte) 2, "AspiratorUmed", (byte) 220, 2.8f, true, true, 2.8f);
                aspiratoareUmede[6] = new AspiratorUmed("Electrolux", "WetDust", 1000.0f, (byte) 1, "AspiratorUmed", (byte) 160, 2.0f, true, false, 2.2f);
                aspiratoareUmede[7] = new AspiratorUmed("Miele", "AquaDust", 3500.0f, (byte) 5, "AspiratorUmed", (byte) 300, 4.0f, true, true, 4.5f);
                aspiratoareUmede[8] = new AspiratorUmed("Xiaomi", "WetVacuum", 800.0f, (byte) 2, "AspiratorUmed", (byte) 170, 1.8f, false, false, 1.5f);
                aspiratoareUmede[9] = new AspiratorUmed("Beko", "WetPro", 700.0f, (byte) 2, "AspiratorUmed", (byte) 200, 2.5f, true, false, 2.0f);

                System.out.println("Lista de aparate:");
                for (Aparat aparat : aparate) {
                    System.out.println(aparat);
                }

                System.out.println("\nLista de aspiratoare uscate:");
                for (AspiratorUscat aspirator : aspiratoareUscate) {
                    System.out.println(aspirator);
                }

                System.out.println("\nLista de aspiratoare umede:");
                for (AspiratorUmed aspirator : aspiratoareUmede) {
                    System.out.println(aspirator);
                }
                System.out.println("\nAparate care îndeplinesc condițiile (pret > 1000 și garantie >= 3):");
                for (Aparat aparat : aparate) {
                    if (aparat.getPret() > 1000 && aparat.getGarantie() >= 3) {
                        System.out.println(aparat);
                    }
                }

                System.out.println("\nAspiratoare uscate care îndeplinesc condițiile (putereAspirare > 200 și areFiltruHEPA == true):");
                for (AspiratorUscat aspirator : aspiratoareUscate) {
                    if (aspirator.getPret() > 200 && aspirator.getGarantie() >= 3) {
                        System.out.println(aspirator);
                    }
                }

                System.out.println("\nAspiratoare umede care îndeplinesc condițiile (capacitateApa >= 3 și areFunctieUscare == true):");
                for (AspiratorUmed aspirator : aspiratoareUmede) {
                    if (aspirator.getCapacitateApa() >= 3 && aspirator.getFunctieSpalare()) {
                        System.out.println(aspirator);
                    }
                }

            }
        }
