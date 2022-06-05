package Wasproject;

public class Wolprogramma extends Programma{
    private Integer temperatuur;
    private Integer toeren;
    private Integer tijdsduur;
    private boolean kort;
    private boolean extraWater;

    @Override
    public void setKort() {
        System.out.println("Een wolprogramma is altijd kort!");
        this.kort = true;
    }

    @Override
    public void setTijdsduur() {
        System.out.println("Een wolprogramma duurt altijd 45 minuten!");
        this.tijdsduur = 45;
    }

    @Override
    public void setToeren() {
        System.out.println("Een wolprogramma heeft altijd 600 toeren!");
        this.toeren = 600;
    }

    @Override
    public void setTemperatuur() {
        System.out.println("De temperatuur is altijd 30 graden bij een wolprogramma!");
        this.temperatuur = 30;
    }
}
