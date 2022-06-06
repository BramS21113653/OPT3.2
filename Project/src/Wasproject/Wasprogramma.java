package Wasproject;

import java.util.*;

public class Wasprogramma {
    Scanner scanner = new Scanner(System.in);
    private Integer timerTijd;
    private Was was;
    private Programma programma;

    public Wasprogramma (Was was, Programma programma) {
        this.was = was;
        this.programma = programma;
    }

    public Programma getProgramma(){
        return programma;
    }

    public Was getWas() {
        return was;
    }

    public void setTimerTijd() {
        System.out.println("Kies uw timer (0 - 12) (kies 0 om de was nu te starten)" +
                "\n(Getal in uren, hoelang het duurt voordat de was mag beginnen...)");
        Integer timerTijd = scanner.nextInt();
        this.timerTijd = timerTijd;
    }

    public Integer getTimerTijd() {
        return this.timerTijd;
    }

    @Override
    public String toString() {
        return "De was\nMateriaal: " + was.getMateriaal() +
                "\nKleur: " + was.getKleur() +
                "\nGewicht: " + was.getGewicht() +
                "\n\nHet programma\nTemperatuur: " + programma.getTemperatuur() +
                "\nToeren: " + programma.getToeren() +
                "\nTijdsduur: " + programma.getTijdsduur() +
                "\nExtra water: " + programma.getExtraWater() +
                "\nKort: " + programma.getKort() +
                "\n\nDe was begint over: " + this.timerTijd + " uur!\n";
    }
}
