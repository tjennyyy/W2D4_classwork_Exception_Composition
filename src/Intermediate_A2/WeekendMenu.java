package Intermediate_A2;

public class WeekendMenu extends Menu {
    private String appertizer;
    private double priceWe;

    public WeekendMenu(String appertizer, String mainDish, Soup soupOftheDay, String desert, double priceWe) {
        super(mainDish,soupOftheDay,desert);
        this.appertizer = appertizer;
        this.priceWe = priceWe;
    }

    public String getAppertizer(){
        return appertizer;
    }

    public void setAppertizer(String appertizer){
        this.appertizer = appertizer;
    }


    public double getPriceWe() {
        return priceWe;
    }

    public void setPriceWe(double priceWe) {
        this.priceWe = priceWe;
    }
}
