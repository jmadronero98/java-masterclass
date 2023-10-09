public class a10_classString {
    public static void main(String[] args){
        //String has a maximum capacity of 2.14 billion.
        String myStringValue = "This is a string";
        System.out.println("myString is equal to: "+myStringValue);

        myStringValue = myStringValue + ", and this is more";

        System.out.println("myString is equal to "+myStringValue);

        //can used unicode

        myStringValue = myStringValue + "\u00A9 2019";
        System.out.println("myStringValue" + myStringValue);
    }
}
