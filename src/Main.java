import java.awt.*;

public class Main {

    public static void main(String[] args) {

//        long resultConversion = a22_codingExerciseSpeedConverter.toMilesPerHour(10.5);
//        System.out.println("Miles: "+resultConversion);
//
//        a22_codingExerciseSpeedConverter.printConversion(10.5);

//        a_45class obj = new a_45class();
//        obj.setModel("Carreras");
//        System.out.println("Model is " +obj.getModel());
//        a_46codingExerciseSumCalculator obj = new a_46codingExerciseSumCalculator();
//        obj.setFirstNumber(5.0);
//        obj.setSecondNumber(4);
//
//        System.out.println("add= " + obj.getAdditionResult());
//        System.out.println("subtract= " + obj.getSubtractionResult());
//
//        obj.setFirstNumber(5.25);
//        obj.setSecondNumber(0);
//
//        System.out.println("multiply= " + obj.getMultiplicationResult());
//        System.out.println("divide= " + obj.getDivisionResult());

//        a_48constructorsChallengeExercise bobsAccount = new a_48constructorsChallengeExercise(); //(12345, 0.00, "Bob Brown",
//        //"myemail@bob.com", "(087) 123-4567");
//
//        System.out.println(bobsAccount.getAccountNumber());
//        System.out.println(bobsAccount.getBalance());
//        System.out.println(bobsAccount.getCustomerName());
//        System.out.println(bobsAccount.getEmail());
//        System.out.println(bobsAccount.getPhoneNumber());
//
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100.0);

//        a_49constructorChallengeExercises2 bobAccount = new a_49constructorChallengeExercises2();
//        bobAccount.withdrawFunds(100.0);
//
//        bobAccount.depositFunds(50.0);
//        bobAccount.withdrawFunds(100);
//
//        bobAccount.depositFunds(51.0);
//        bobAccount.withdrawFunds(100.0);

//        a_49constructorChallengeExercises2 bobsAccount = new a_49constructorChallengeExercises2(12345, 0.00, "Joey Madronero", "joemadcagoco@gmail.com", "09453999748");
//        System.out.println(bobsAccount.getAccount());
//        System.out.println(bobsAccount.getBalance());

//        a_49constructorChallengeExercises2 bobsAccount = new a_49constructorChallengeExercises2("joey", "joe@gmail.com", "09453999748");
//        System.out.println(bobsAccount.getAccount() + " name " + bobsAccount.getCustomerName());
//        bobsAccount.setBalance(100.55);
//        System.out.println("Current Balance is " + bobsAccount.getBalance());
//        bobsAccount.withdrawFunds(100.55);


//        a_50constructorChallengeExercisesVipCustomer person1 = new a_50constructorChallengeExercisesVipCustomer();
//        System.out.println(person1.getName());
//        System.out.println(person1.getCreditLimit());
//        System.out.println(person1.getEmailAddress());
//
//        a_50constructorChallengeExercisesVipCustomer person2  = new a_50constructorChallengeExercisesVipCustomer("Bob", 25000.00);
//        System.out.println(person2.getName());
//        System.out.println(person2.getCreditLimit());
//        System.out.println(person2.getEmailAddress());
//
//        a_50constructorChallengeExercisesVipCustomer person3 = new a_50constructorChallengeExercisesVipCustomer("Tim", 100.00, "tim@email.com");
//        System.out.println(person3.getName());
//        System.out.println(person3.getCreditLimit());
//        System.out.println(person3.getEmailAddress());

//        a_51codingExerciseWallArea wall = new a_51codingExerciseWallArea(5,4);
//        System.out.println("area= " + wall.getArea());
//
//        wall.setWidth(-1.5);
//        System.out.println("width= "+wall.getWidth());
//        System.out.println("height= "+wall.getHeight());
//        System.out.println("area= " +wall.getArea());

        a_52codingExercisePoint first = new a_52codingExercisePoint(6, 5);
        a_52codingExercisePoint second = new a_52codingExercisePoint(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        //System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        a_52codingExercisePoint point = new a_52codingExercisePoint();
        System.out.println("distance()= " + point.distance());
    }


}
