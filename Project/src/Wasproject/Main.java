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
            Integer tijdsduur = 0;
            if (was.getMateriaal().equalsIgnoreCase("katoen")) {
                Programma programma = new Katoenprogramma();
                programma.basisProgramma();
                tijdsduur = programma.getTijdsduur();
            }
            else if (was.getMateriaal().equalsIgnoreCase("wol")) {
                Programma programma = new Wolprogramma();
                programma.basisProgramma();
                tijdsduur = programma.getTijdsduur();
            }
            else if (was.getMateriaal().equalsIgnoreCase("fijn")) {
                Programma programma = new Fijnprogramma();
                programma.basisProgramma();
                tijdsduur = programma.getTijdsduur();
            }
            Wasprogramma wasprogramma = new Wasprogramma();
            wasprogramma.setTimerTijd();
            Integer timerTijd = wasprogramma.getTimerTijd();
            WasmachineX wasmachineX = new WasmachineX(timerTijd, tijdsduur);
            wasmachineX.wassen();
            wasmachineX.printEindtijd();
            break;
        }
    }
}
