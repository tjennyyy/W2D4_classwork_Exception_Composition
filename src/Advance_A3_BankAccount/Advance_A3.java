package Advance_A3_BankAccount;

public class Advance_A3 {
    public static void main(String[] args) {

       /* BankAccount bA1 = new BankAccount("John Doe", 5490.90);
        System.out.println("This person: " + bA1.getCustomer() + " has " + bA1.getAccountBalanace() + " €"); */

        BankAccount bA2 = new BankAccount((new Customer("Jenny T", "xxx87", 4)), 4000);
        System.out.println(bA2.getCustomerName());

       /* bA1.addMoney(500.80);
        System.out.println(bA1.getAccountBalanace() + " €");

       // System.out.println(bA1.getAccountBalanace() );
        try{
            bA1.withdrawMoney(6000);
        } catch (BankAccountNegativeExecption bane) {
            System.out.println("You can not go under minus" );
        }
            System.out.println(bA1.getAccountBalanace());

        try{
            bA1.withdrawMoney(1000);
        } catch (BankAccountNegativeExecption bale) {
            System.out.println(bA1.getCustomer() + " You can not go under minus" );
        }
            System.out.println(bA1.getAccountBalanace());

    }*/
    }
}

