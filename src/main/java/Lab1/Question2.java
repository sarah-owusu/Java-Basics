package Lab1;

public class Question2 {
    public static void main(String arg[]){
        printMyNameDetails("Sarah","Owusu");
    }

    public static void printMyNameDetails(String firstName, String lastName){
        String fullName = firstName + " " + lastName;
        System.out.println("Hello, my name is " + fullName);
        System.out.println("There are " + firstName.length()+ " letters in my first name and "+ lastName.length()+ " letters in my lastName");
    }

}
