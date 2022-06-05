package Wasproject;

import java.util.*;

public class WasmachineX implements IWassen{
    Scanner scanner = new Scanner(System.in);

    private Date huidigeTijd;
    private Date eindTijd;
    private Date resterendeTijd;

    @Override
    public String Wassen() {
        return "De was is begonnen om: " + this.huidigeTijd;
    }

    @Override
    public String printEindtijd() {
        ///todo
        return null;
    }

    @Override
    public String printResterend() {
        ///todo
        return null;
    }

}
