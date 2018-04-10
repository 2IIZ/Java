import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        boolean ok = true;
        double degrees = 0;
        double degreesConverted = 0;

        System.out.println("Celsius - Fahrenheit Converter");

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("In which Degrees will you input the data ?");
            System.out.println("F for Fahrenheit > Celsius");
            System.out.println("C for Celsius > Fahrenheit");

            String choice = sc.nextLine();

            if (choice.equals("f") || choice.equals("F")) {

                //F to C
                System.out.println("Input the Fahrenheit data number : ");
                degrees = sc.nextInt();

                degreesConverted = degrees;
                degreesConverted -= 32;
                degreesConverted *= 5;
                degreesConverted /= 9;

                System.out.println(degrees +"º Fahrenheit = "+ degreesConverted +"º Celsius ");

                ok = false;

            } else if (choice.equals("c") || choice.equals("C")) {

                //C to F
                System.out.println("Input the Celsius data number : ");
                degrees = sc.nextInt();

                degreesConverted = degrees;     //Celsius to Fahrenheit
                degreesConverted = degrees * 1.8;
                degreesConverted += 32;

                System.out.println(degrees +"º Celsius = "+ degreesConverted +"º Fahrenheit ");

                ok = false;
            } else {
                System.out.println("You may had a misspelled letter, try again...");
            }


        }while(ok);

        //relance ok = 1;
    }
}
