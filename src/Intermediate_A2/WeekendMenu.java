package Intermediate_A2;

public class WeekendMenu extends Menu {
    private String appertizer;
    private String mainDish;
    private String soupOftheDay;
    private String desert;
    private double price;

    public WeekendMenu(String appertizer, String mainDish, String soupOftheDay, String desert, double price) {
        this.appertizer = appertizer;
        this.mainDish = mainDish;
        this.soupOftheDay = soupOftheDay;
        this.desert = desert;
        this.price = price;
    }

    public String getAppertizer(){
        return appertizer;
    }

    public void setAppertizer(){
        this.appertizer = appertizer;
    }

    public String getMainDish() {
        return mainDish;
    }

    public void setMainDish() {
        this.mainDish = mainDish;
    }

    public String getSoupOftheDay() {
        return soupOftheDay;
    }

    public void setSoupOftheDay() {
        this.soupOftheDay = mainDish;
    }

    public String getDesert() {
        return desert;
    }

    public void setDesert() {
        this.desert = desert;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }
}
