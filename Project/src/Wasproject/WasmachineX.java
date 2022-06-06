package Wasproject;

import java.util.*;

public class WasmachineX implements IWassen{
    private Wasprogramma wasprogramma;

    public WasmachineX(Wasprogramma wasprogramma) {
        this.wasprogramma = wasprogramma;
    }

    @Override
    public void wassen() {
        Calendar calendar = Calendar.getInstance();
        Date huidigeTijd = calendar.getTime();
        System.out.println("De was is begonnen om: " + huidigeTijd);
    }

    @Override
    public void printEindtijd() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR_OF_DAY, wasprogramma.getTimerTijd());
        //todo onder fix tijdsduur want is in minuten...
        calendar.add(Calendar.HOUR_OF_DAY, (wasprogramma.getProgramma().getTijdsduur()));
        Date eindTijd = calendar.getTime();
        System.out.println("De was is klaar om: " + eindTijd);
    }
}
