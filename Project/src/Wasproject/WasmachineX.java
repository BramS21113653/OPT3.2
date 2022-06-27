package Wasproject;

import java.util.*;

public class WasmachineX implements IWassen{
    private Wasprogramma wasprogramma;
    private Tijd tijd = new Tijd();

    public WasmachineX(Wasprogramma wasprogramma) {
        this.wasprogramma = wasprogramma;
    }

    @Override
    public String wassen() {
        Calendar calendar = tijd.getHuidigeTijd();
        calendar.add(Calendar.HOUR_OF_DAY, wasprogramma.getTimerTijd());
        Date startTijd = calendar.getTime();
        return "De was begint om: " + startTijd;
    }

    @Override
    public String printEindtijd() {
        Calendar calendar = tijd.getHuidigeTijd();
        calendar.add(Calendar.HOUR_OF_DAY, wasprogramma.getTimerTijd());
        calendar.add(Calendar.HOUR_OF_DAY, (wasprogramma.getProgramma().getTijdsduur()));
        Date eindTijd = calendar.getTime();
        return "De was is klaar om: " + eindTijd;
    }

//    @Override
//    public Calendar getHuidigeTijd() {
//        Calendar calendar = Calendar.getInstance();
//        return calendar;
//    }
}
