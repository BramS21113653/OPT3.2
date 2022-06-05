package Wasproject;

import java.util.*;

public class Wasprogramma {
    Scanner scanner = new Scanner(System.in);
    private Integer timerTijd;

    public void setTimerTijd() {
        System.out.println("Kies uw timer (getal in uren)");
        Integer timerTijd = scanner.nextInt();
        this.timerTijd = timerTijd;
    }

    public Integer getTimerTijd() {
        return this.timerTijd;
    }

    @Override
    //todo
    public String toString() {
        return null;
    }
}
