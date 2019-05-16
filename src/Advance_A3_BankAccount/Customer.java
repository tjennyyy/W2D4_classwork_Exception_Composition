package Advance_A3_BankAccount;


public class Customer {
    private String customerName;
    private String adress;
    private int creditscore;

    public Customer(String customerName, String adress, int creditscore){
        this.customerName = customerName;
        this.adress = adress;
        this.creditscore = creditscore;
    }

    public String getCustomerName(){ //needs to be a string otherwise you will not be able to call it in the main
        return customerName;
    }

    public void setCustomerName(){
        this.customerName = customerName;
    }

    public String getAdress(){
        return adress;
    }

    public void setAdress(){
        this.adress = adress;
    }

    public int getCreditscore(){
        return creditscore;
    }

    public void setCreditscore(){
        this.creditscore = creditscore;
    }

}
