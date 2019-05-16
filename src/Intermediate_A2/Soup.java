package Intermediate_A2;

public class Soup {

    private String soupName;
    private String portionVolume;

    //constructor soup
    public Soup (String soupName, String portionVolume){
        this.soupName = soupName;
        this.portionVolume = portionVolume;

    }

    public String getSoupName(){
        return soupName;
    }

    public void setSoupName(String soupName){
        this.soupName = soupName;
    }

    public String getPortionVolume(){
        return portionVolume;
    }

    public void setPortionVolume(){
        this.portionVolume = portionVolume;
    }


}
