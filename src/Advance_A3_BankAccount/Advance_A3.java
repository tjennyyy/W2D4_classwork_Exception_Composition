package Advance_A3_BankAccount;
/* A3:  BankAccount: Exception on trying to set accountBalance to negative number

Create a BankAccount class that holds customer name and account balance. DONE
Add getters and setters, as well as addMoney(amount) and withdrawMoney(amount)

Raise an BankAcccountNegativeException when an attempt  has been made to set account to negative.
Demonstrate exception handling in main() with an example. DONE

Add classes DebitCardAccount and CreditCardAccount, which are child classes of BankAccount.
Add necessary fields. DONE

Demonstrate that exception still works for child classes. NOTDONE

Then, change the behaviour. Debit Card can not go into minus, but CreditCard can go into -3500 EUR minus.
Demonstrate. NOT DONE - started

Add class customer holding name, address and credit score (0,1,2,3, 4 or 5) of the customer. DONE
Add exception when someone wants to set the credit score to smth that is not 0,1,2,3,4, or 5),

Connect BankAccount with Customer. Change CreditCard behaviour so that customer can go to minus of
1000 EUR x creditScore. NOTDONE

*/


public class Advance_A3 {
    public static void main(String[] args) {

       /* BankAccount bA1 = new BankAccount("John Doe", 5490.90);
        System.out.println("This person: " + bA1.getCustomer() + " has " + bA1.getAccountBalanace() + " €"); */

        BankAccount bA2 = new BankAccount((new Customer("Jenny T", "xxx87", 4)), 4000);
        System.out.println("Customer Name:"+bA2.getCustomer()+" Accountbalance: € "+4000);

        bA2.addMoney(500.80);
        System.out.println(bA2.getAccountBalanace() + " €");

       // System.out.println(bA1.getAccountBalanace() );
        try{
            bA2.withdrawMoney(6000);
        } catch (BankAccountNegativeExecption bane) {
            System.out.println("You can not go under minus" );
        }
            System.out.println(bA2.getAccountBalanace());

        try{
            bA2.withdrawMoney(1000);
        } catch (BankAccountNegativeExecption bale) {
            System.out.println(bA2.getCustomer() + " You can not go under minus" );
        }
            System.out.println(bA2.getAccountBalanace());

    
    }
}

