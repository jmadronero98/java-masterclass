public class a_39parsingValuesFromAString {
    public static void main (String[]args) {
        String numbersAsString = "2018.125";
        System.out.println("numberAsString= " + numbersAsString);

        //wrapper class example - Integer.parseInt (it means converting specific data type
        // to one another
        double number = Double.parseDouble(numbersAsString);
        System.out.println("Converted Data from String to Integer Using Wrapper Class: " + number);

        numbersAsString += 1;
        number += 1;

        System.out.println("numberAsString = " +numbersAsString);
        System.out.println("number = " + number);
    }
}
