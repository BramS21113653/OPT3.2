package Wasproject;

public class Wolprogramma extends Programma{
    private Integer temperatuur;
    private Integer toeren;
    private Integer tijdsduur;
    private boolean kort;

    @Override
    public void setKort() {
        System.out.println("Een wolprogramma is altijd kort!");
        super.kort = true;
    }

    @Override
    public void setTijdsduur() {
        System.out.println("Een wolprogramma duurt altijd 1 uur!");
        super.tijdsduur = 1;
    }

    @Override
    public void setToeren() {
        System.out.println("Een wolprogramma heeft altijd 600 toeren!");
        super.toeren = 600;
    }

    @Override
    public void setTemperatuur() {
        System.out.println("De temperatuur is altijd 30 graden bij een wolprogramma!");
        super.temperatuur = 30;
    }
}
