package Intermediate_A2;

public class Intermediate_A2 {

    public static void main (String[] args){

        WeekdayMenu WD1 = new WeekdayMenu("BLT Sandwich", "Potatoe Soup", "choc cake", 9.90);
        WeekendMenu WE1 = new WeekendMenu("Salad", "Roastbeef Sandwich Deluxe", "Tomatosoup", "Panna cotta", 15.90);
        System.out.println("Menu for this weekday: " + WD1.getMainDish()+ ", " + WD1.getSoupOftheDay()+ ", " + WD1.getDesert()+ " Price: € "+WD1.getPriceWd());
        System.out.println("Menu for this weekend: " + WE1.getAppertizer()+", "+WE1.getMainDish()+ ", " + WE1.getSoupOftheDay()+ ", " + WE1.getDesert()+ " Price: € "+WE1.getPriceWe());

    }
}
