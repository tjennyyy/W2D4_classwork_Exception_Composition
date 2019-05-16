package Intermediate_A2;

public class WeekdayMenu extends Menu {

    private double priceWd;

    public WeekdayMenu (String mainDish, String soupOftheDay, String desert, double priceWd) {
        super(mainDish, soupOftheDay, desert);
        this.priceWd = priceWd;
    }

        public double getPriceWd() {
            return priceWd;
        }

        public void setPriceWd(double priceWd) {
            this.priceWd = priceWd;
        }
    }

