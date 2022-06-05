package Wasproject;

import java.util.Scanner;

public class Katoenprogramma extends Programma {
    Scanner scanner = new Scanner(System.in);

    private Integer temperatuur;
    private Integer toeren;
    private Integer tijdsduur;
    private boolean kort;
    private boolean extraWater;

    @Override
    public void setKort() {
        System.out.println("Wilt u een kort programma? (j/n)");
        String antwoordKortProgramma = scanner.nextLine();
        if (antwoordKortProgramma.equalsIgnoreCase("j")) {
            this.kort = true;
        } else { this.kort = false; }
    }

    @Override
    public void setTijdsduur() {
        if (this.kort = true) {
            this.tijdsduur = 45;
        } else if (this.kort = false) { this.tijdsduur = 60;}
    }

    @Override
    public void setToeren() {
        System.out.println("Kies toeren tussen de 600 en 1400");
        this.toeren = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public void setTemperatuur() {
        System.out.println("Kies een temperatuur tussen de 30 en 60 graden");
        this.temperatuur = scanner.nextInt();
    }
}
