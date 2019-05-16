//A2:  Soup of the Day in a Restaurant
//Many restaurants offer a soup-of-the-day. Good object-oriented customers will just order the soup-of-the-day
// and have faith that what is delivered will satisfy their hunger. Having a soup-of-the-day simplifies ordering
// for customers. They don't have to be experts on specific types of soups. The same request is made every time,
// but depending on which day the request is made, a different type of soap is returned.
//Create parent class Menu, that has two childs: WeekdayMenu and WeekendMenu. WeekdayMenu consist of MainDish,
// Desert and Soup . WeekendMenu consist of Appetizer, MainDish, Soup and Desert.
//Create several WeekdayMenu and Weekend menu  objects, save them in variables of Menu class type.
// Classes WeekdayMenu  and Weekend implement getSoupOfTheDay() method that returns a soup.
//Add method printMenu(). Call it on Menu objects
//Exception handling:
//A soup can be constructed with a name. But it has also a portionVolume (in liters)
//Raise an NoSoupVolumeDefined exception if you try to access  getPortionVolume() if it is not defined.
//ADVANCED: Research internet on “primitive wrapper classes java”


package Intermediate_A2;

public class Intermediate_A2 {

    public static void main (String[] args){

        WeekdayMenu WD1 = new WeekdayMenu("BLT Sandwich", "Potatoe Soup", "choc cake", 9.90);
        WeekendMenu WE1 = new WeekendMenu("Salad", "Roastbeef Sandwich Deluxe", "Tomatosoup", "Panna cotta", 15.90);
        System.out.println("Menu for this weekday: " + WD1.getMainDish()+ ", " + WD1.getSoupOftheDay()+ ", " + WD1.getDesert()+ " Price: € "+WD1.getPriceWd());
        System.out.println("Menu for this weekend: " + WE1.getAppertizer()+", "+WE1.getMainDish()+ ", " + WE1.getSoupOftheDay()+ ", " + WE1.getDesert()+ " Price: € "+WE1.getPriceWe());

    }
}
