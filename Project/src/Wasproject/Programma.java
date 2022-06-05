package Wasproject;

import java.util.Scanner;

public abstract class Programma {
    Scanner scanner = new Scanner(System.in);

    private Integer temperatuur;
    private Integer toeren;
    private Integer tijdsduur;
    private boolean kort;
    private boolean extraWater;

    public final void basisProgramma() {
        setTemperatuur();
        setToeren();
        setKort();
        setTijdsduur();
        setExtraWater();
    }

    abstract void setKort();

    abstract void setTijdsduur();

    abstract void setToeren();

    abstract void setTemperatuur();

    final void setExtraWater() {
        //todo check waar het wordt opgeslagen
        System.out.println("Wilt u extra water toevoegen? (j/n)");
        String antwoordExtraWater = scanner.nextLine();
        if (antwoordExtraWater.equalsIgnoreCase("j")) {
            this.extraWater = true;
        } else { this.extraWater = false; }
    }

    public Integer getTemperatuur() {return this.temperatuur;}

    public Integer getToeren() {return this.toeren;}

    public Integer getTijdsduur() {return this.tijdsduur;}

    public boolean getKort() {return this.kort;}

    public boolean getExtraWater() {return this.extraWater;}
}
