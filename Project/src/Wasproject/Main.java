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
            Programma programma = null;
            if (was.getMateriaal().equalsIgnoreCase("katoen")) {
                programma = new Katoenprogramma();
            }
            else if (was.getMateriaal().equalsIgnoreCase("wol")) {
                programma = new Wolprogramma();
            }
//            else if (was.getMateriaal().equalsIgnoreCase("fijn")) {
//                programma = new Fijnprogramma();
//            }
            programma.basisProgramma();
            tijdsduur = programma.getTijdsduur();
            Wasprogramma wasprogramma = new Wasprogramma(was, programma);
            wasprogramma.setTimerTijd();
            Integer timerTijd = wasprogramma.getTimerTijd();
            System.out.println(wasprogramma);
            WasmachineX wasmachineX = new WasmachineX(wasprogramma);
            System.out.println(wasmachineX.wassen());
            System.out.println(wasmachineX.printEindtijd());
            break;
        }
    }
}
