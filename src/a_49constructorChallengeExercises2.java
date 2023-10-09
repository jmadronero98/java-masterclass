public class a_49constructorChallengeExercises2 {

    private int account;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public a_49constructorChallengeExercises2() {
        this(6789, 150.0, "Jewes Mads", "joeymad", "0923");
        System.out.println("Empty constructor called");
        System.out.println(getAccount());
    }

    public a_49constructorChallengeExercises2(int account, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.account = account;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public a_49constructorChallengeExercises2(String customerName, String email, String phoneNumber) {
        this(99999, 100.55, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("You deposited: " +depositAmount);
        System.out.println("Your new account balance is: "+this.balance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if(this.balance - withdrawalAmount < 0) {
            System.out.println("Can't withdraw! Insufficient funds.");
        } else {
            System.out.println("You withdraw: "+ withdrawalAmount);
            this.balance -=withdrawalAmount;
        System.out.println("Your new balance is:" + this.balance);
        }
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getAccount() {
        return this.account;
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
}
