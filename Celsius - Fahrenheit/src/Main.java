import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        boolean ok = true;
        double degrees = 0;
        double degreesConverted = 0;

        String stop = "y";
        String choice;

        System.out.println("Celsius - Fahrenheit Converter");

        Scanner sc = new Scanner(System.in);

        while (ok){
            System.out.println("In which Degrees will you input the data ?");
            System.out.println("F for Fahrenheit > Celsius");
            System.out.println("C for Celsius > Fahrenheit");

            choice = sc.nextLine();

            if (choice.equals("f") || choice.equals("F")) {

                //Fahrenheit to Celsius
                System.out.println("Input the Fahrenheit data number : ");
                degrees = sc.nextInt();

                degreesConverted = degrees;
                degreesConverted -= 32;
                degreesConverted /= 1.8;

                System.out.println(degrees +"º Fahrenheit = "+ degreesConverted +"º Celsius ");

            } else if (choice.equals("c") || choice.equals("C")) {

                //Celsius to Fahrenheit
                System.out.println("Input the Celsius data number : ");
                degrees = sc.nextInt();

                degreesConverted = degrees;
                degreesConverted = degrees * 1.8;
                degreesConverted += 32;

                System.out.println(degrees +"º Celsius = "+ degreesConverted +"º Fahrenheit ");

                } else {
                System.out.println("You may had a misspelled letter, try again...");
            }


            System.out.println();
            System.out.println("Do you want to try again ? y/n");

            stop = sc.next(); // this doesn't work, don't know why

            if (stop.equals("y") || stop.equals("Y")) { ok = true; } else { ok = false; }

        }



    }
}
