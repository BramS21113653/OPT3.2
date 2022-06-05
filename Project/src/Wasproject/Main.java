package Wasproject;
import java.util.*;

public class Main {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wat is het materiaal? (katoen, wol of fijn)");
            String materiaal = scanner.nextLine();
            System.out.println("Wat is de kleur?");
            String kleur = scanner.nextLine();
            System.out.println("Wat is het gewicht?");
            Integer gewicht = scanner.nextInt();
            Was was = new Was(gewicht, kleur, materiaal);
            if (was.getMateriaal().equalsIgnoreCase("katoen")) {
                Programma programma = new Katoenprogramma();
                programma.basisProgramma();
            }
            else if (was.getMateriaal().equalsIgnoreCase("wol")) {
                Programma programma = new Wolprogramma();
                programma.basisProgramma();
                System.out.printf(String.valueOf(programma));
            }
            else if (was.getMateriaal().equalsIgnoreCase("fijn")) {
                Programma programma = new Fijnprogramma();
                programma.basisProgramma();
            }
            break;
        }
    }
}
