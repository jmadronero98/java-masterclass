import java.util.Scanner;

public class a_48constructorsChallengeExercise {


    //Scanner scanner = new Scanner(System.in);

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public a_48constructorsChallengeExercise() {
        //the next code calls constructor to another constructor.
        this(56789, 2.50, "Default Name", "Default Address", "Default Phone");
        System.out.println("Empty constructor called");
    }
    public a_48constructorsChallengeExercise(int number, double balance, String customerName, String email, String phoneNumber) {

        System.out.println("Account constructor with parameters called");
        this.accountNumber = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public a_48constructorsChallengeExercise(String customerName, String email, String phoneNumber) {
        this(9999, 50.0, customerName, email, phoneNumber);
    }

    public void deposit(double depositAmount) {
        this.balance +=depositAmount;
        System.out.println("Deposit of " + depositAmount +
                " made. New balance is " +this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount <= 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not" +
                    " processed");
        } else {
            this.balance -=withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining" +
                    " balance = " + this.balance);
        }
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

//    public void depositFunds() {
//
//        System.out.println("Enter an amount to deposit funds: ");
//
//        boolean isValid = scanner.hasNextDouble();
//
//        if (isValid) {
//            double addAmount = scanner.nextInt();
//            double addToExistingAmount = getBalance() + addAmount;
//            setBalance(addToExistingAmount);
//        } else {
//            System.out.println("Invalid Input");
//        }
//    }
//
//    public void withdrawFunds() {
//
//        System.out.println("Enter an amount to withdraw funds: ");
//
//        boolean isValid = scanner.hasNextInt();
//
//        if(isValid) {
//            int withdrawAmount = scanner.nextInt();
//
//            if(withdrawAmount > getBalance()) {
//                System.out.println("Insufficient Fund");
//            } else {    //Create a new class VipCustomer
//    //it should have 3 fields name, credit limit, and email address.
//    //create 3 constructor
//    //1st constructor empty should call the constructor with 3 parameters with
//    //default values
//    //2nd constructor should pass on the 2 values it receives and add a default value
//    //for the 3rd
//    //3rd constructor should save all fields.
//    //create getters only for this using code generation of intellij as setters
//    //won't be needed test and confirm it works.
//                double deductRemainingBalance = getBalance() - withdrawAmount;
//                setBalance(deductRemainingBalance);
//            }
//
//        }
//    }

    //Create a new class for a bank account
    //Create fields for the account number, balance, customer name, email and phone number.

    //Create getters and setters for each field
    //Create two additional methods

    //1. To allow the customer to deposit funds (this should increment the balance field).
    //2. To allow the customer to withdraw funds. This should deduct from the balance field,
    //but not allow the withdrawal to complete if their are insufficient funds.
    //You will not want to create various code in the Main Class (the one created by Intellij)
    //to confirm your code is working.
    //Add some System.out.println's in the two methods above as well.


}
