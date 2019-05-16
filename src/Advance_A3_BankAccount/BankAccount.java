package Advance_A3_BankAccount;

public class BankAccount  {
    private Customer customer;
    private double accountBalanace;

    public BankAccount(Customer customer, double accountBalanace){
        this.customer = customer;
        this.accountBalanace = accountBalanace;
    }

    public String getCustomer(){
        return customer.getCustomerName();//call class and what you want to see in the 'main'
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public double getAccountBalanace(){
        return accountBalanace;
    }

    public void setAccountBalanace(double accountBalanace){
        this.accountBalanace = accountBalanace;
    }

    public void addMoney(double amount) {
        this.accountBalanace += amount;
    }

    /*public void withdrawMoney (double amount){
        this.accountBalanace -= amount;
    } */

    public double withdrawMoney (double minusAmount) throws BankAccountNegativeExecption{
            if ((this.accountBalanace - minusAmount ) < 0) {
                throw new BankAccountNegativeExecption();
            }  else {
                return this.accountBalanace -= minusAmount;
            }
        }
    }


