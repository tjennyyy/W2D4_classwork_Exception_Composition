package Intermediate_A2;

public class Intermediate_A2 {

    public static void main (String[] args){

        Menu weekday1 = new Menu("Cordon Bleu mit Reis", "Gemüse Suppe", "Mohr im Hemd");
       // Menu weekend1 = new Menu("Haschee Hörnchen", "Spinatcreme Suppe", "Panna Cotta");
        System.out.println("Menu for this weekday: " + weekday1.getMainDish()+ ", " + weekday1.getSoupOftheDay()+ ", " + weekday1.getDesert());
       // System.out.println("Menu for this weekend: " + weekend1.getMainDish()+ ", " + weekend1.getSoupOftheDay()+ ", " + weekend1.getDesert());

    }
}
