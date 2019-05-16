package Intermediate_A2;

public class WeekdayMenu extends Menu {

    private double price;

    public WeekdayMenu (String mainDish, String soupOftheDay, String desert, double price) {
        super(mainDish, soupOftheDay, desert);
        this.price = price;

        public double getPrice() {
            return price;
        }

        public void setPrice() {
            this.price = price;
        }
    }

