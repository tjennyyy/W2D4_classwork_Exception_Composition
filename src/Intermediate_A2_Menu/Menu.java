package Intermediate_A2_Menu;

public class Menu {

    private String mainDish;
    private Soup soupOftheDay; //needs to 'call' on the soup method
    private String desert;

    public Menu (String mainDish, Soup soupOftheDay, String desert){
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
        return soupOftheDay.getSoupName()+soupOftheDay.getPortionVolume(); //what you want from soup class

    }


    /*public void setSoupOftheDay(Soup soupOftheDay){
        this.soupOftheDay = soupOftheDay.setSoupName();
    }*/

    public String getDesert(){
        return desert;
    }

    public void setDesert(String desert){
        this.desert = desert;
    }
    public String getPortionVolume() throws NoSoupVolumeDefined {
        if (this.soupOftheDay.getPortionVolume() == null) {
            throw new NoSoupVolumeDefined();
        } else {
            return this.soupOftheDay.getPortionVolume();
        }
    }



}
