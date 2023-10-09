public class a14_logicalOperators {
    public static void main (String[] args) {
        int sampleValue = 80;
        int secondValue = 60;

        //and logical operators
        if ((sampleValue > secondValue) && (sampleValue < 100)) {
            System.out.println("Greater than second value and less than to 100");
        }

        //or logical operators
        if ((sampleValue > 90) || (secondValue < 80)) {
            System.out.println("Either or both of the conditions are true!");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar){ //or isCar == false -this two are recommended to use
            System.out.println("This is supposed to happen");
        }

        //ternary operators
        isCar = true;
        boolean wasCar = isCar? true:false;
        if (wasCar) {
            System.out.println("wasCar is true!");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 20)? true:false;
        System.out.println(isEighteenOrOver);
    }
}
