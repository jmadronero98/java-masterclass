public class a15_operatorsChallenge {
    public static void main(String[] args) {
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("myValuesTotal= " +myValuesTotal);

        double remainderValue = myValuesTotal % 40.00d;
        System.out.println("remainderValue= " +remainderValue);

        boolean isNoRemainder = (remainderValue == 0)? true:false;
        System.out.println("isNoRemainder= " +isNoRemainder);

        if(!isNoRemainder){
            System.out.println("Got Some Remainder!");
        }
    }
}
