package Intermediate_A2;

public class Menu {

    private String mainDish;
    private String soupOftheDay;
    private String desert;

    public Menu (String mainDish, String soupOftheDay, String desert){
        this.mainDish = mainDish;
        this.soupOftheDay = soupOftheDay;
        this.desert = desert;

        }
    public String getMainDish() {
        return mainDish;
    }

    public void setMainDish(String mainDish){
        this.mainDish = mainDish;
    }

    public String getSoupOftheDay(){
        return soupOftheDay;
    }

    public void setSoupOftheDay(String soupOftheDay){
        this.soupOftheDay = mainDish;
    }

    public String getDesert(){
        return desert;
    }

    public void setDesert(String desert){
        this.desert = desert;
    }



}
