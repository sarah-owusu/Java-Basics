package Lab1;

public class Question1 {

    public static void main(String arg[]){
        int bankBalance = 500;
        bankBalance += 250;
        // 500+250
        // 750
      int newBankBalance = bankBalance-= 100;
        //                 =750 - 100
        //                = 650
        System.out.println(bankBalance);

        double fahrenheit = 50d;
        double celsius;

        celsius = (5.0 / 9.0) * (fahrenheit - 32.0);
        System.out.println(celsius);
    }
}
