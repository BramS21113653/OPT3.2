//package Wasproject;
//
//import java.util.Scanner;
//
//public class Fijnprogramma extends Programma {
//    Scanner scanner = new Scanner(System.in);
//
//    @Override
//    public void setKort() {
//        System.out.println("Wilt u een kort programma? (j/n)");
//        String antwoordKortProgramma = scanner.nextLine();
//        if (antwoordKortProgramma.equalsIgnoreCase("j")) {
//            super.kort = true;
//        } else { super.kort = false; }
//    }
//
//    @Override
//    public void setTijdsduur() {
//            if (super.kort == true) {
//                super.tijdsduur = 1;
//            } else if (super.kort == false) {super.tijdsduur = 2;}
//    }
//
//    @Override
//    public void setToeren() {
//        System.out.println("Kies toeren tussen de 600 en 1400");
//        super.toeren = scanner.nextInt();
//        scanner.nextLine();
//    }
//
//    @Override
//    public void setTemperatuur() {
//        System.out.println("Kies een temperatuur tussen de 30 en 50 graden");
//        super.temperatuur = scanner.nextInt();
//    }
//}
