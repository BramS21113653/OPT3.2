package Wasproject;

import javax.sound.midi.Soundbank;
import java.util.*;

public class WasmachineX implements IWassen{
    private Integer timerTijd;
    private Integer tijdsDuur;

    public WasmachineX(Integer timerTijd, Integer tijdsDuur) {
        this.timerTijd = timerTijd;
        this.tijdsDuur = tijdsDuur;
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
        calendar.add(Calendar.HOUR_OF_DAY, this.timerTijd);
        //todo onder fix tijdsduur want is in minuten...
        calendar.add(Calendar.HOUR_OF_DAY, this.tijdsDuur);
        Date eindTijd = calendar.getTime();
        System.out.println("De was is klaar om: " + eindTijd);
    }
}
