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
                Katoenprogramma programma = new Katoenprogramma();
                programma.basisProgramma();
                tijdsduur = programma.getTijdsduur();
                Wasprogramma wasprogramma = new Wasprogramma(was, programma);
                wasprogramma.setTimerTijd();
                Integer timerTijd = wasprogramma.getTimerTijd();
                WasmachineX wasmachineX = new WasmachineX(wasprogramma);
                wasmachineX.wassen();
                wasmachineX.printEindtijd();
            }
            else if (was.getMateriaal().equalsIgnoreCase("wol")) {
                Wolprogramma programma = new Wolprogramma();
                programma.basisProgramma();
                tijdsduur = programma.getTijdsduur();
                Wasprogramma wasprogramma = new Wasprogramma(was, programma);
                wasprogramma.setTimerTijd();
                Integer timerTijd = wasprogramma.getTimerTijd();
                WasmachineX wasmachineX = new WasmachineX(wasprogramma);
                wasmachineX.wassen();
                wasmachineX.printEindtijd();            }
            else if (was.getMateriaal().equalsIgnoreCase("fijn")) {
                Fijnprogramma programma = new Fijnprogramma();
                programma.basisProgramma();
                tijdsduur = programma.getTijdsduur();
                Wasprogramma wasprogramma = new Wasprogramma(was, programma);
                wasprogramma.setTimerTijd();
                Integer timerTijd = wasprogramma.getTimerTijd();
                WasmachineX wasmachineX = new WasmachineX(wasprogramma);
                wasmachineX.wassen();
                wasmachineX.printEindtijd();
            }
            break;
        }
    }
}
