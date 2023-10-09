public class a_50constructorChallengeExercisesVipCustomer {
    //Create a new class VipCustomer
    //it should have 3 fields name, credit limit, and email address.
    //create 3 constructor
    //1st constructor empty should call the constructor with 3 parameters with
    //default values
    //2nd constructor should pass on the 2 values it receives and add a default value
    //for the 3rd
    //3rd constructor should save all fields.
    //create getters only for this using code generation of intellij as setters
    //won't be needed test and confirm it works.

    private String name;
    private double creditLimit;
    private String emailAddress;

    public a_50constructorChallengeExercisesVipCustomer() {
        this("joey", 200.00, "joey@gmail.com");
    }

    public a_50constructorChallengeExercisesVipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@gmail.com");
    }

    public a_50constructorChallengeExercisesVipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
}
