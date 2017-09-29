import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);

        //Car MPG rating
        System.out.print("Enter your car's MPG (miles/gallon) rating as a positive integer: ");
        int carMPG = scnr.nextInt();

        if (carMPG < 0) {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            return;
        }

        //Car tank capacity
        System.out.print("Enter your car's tank capacity (gallons) as a positive decimal number: ");
        double tankCapacity = scnr.nextDouble();

        if (tankCapacity < 0){
            System.out.println("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            return;
        }

        //Percentage of gas tank filled
        System.out.print("Enter the percentage of the gas tank that is currently filled (from 0 to 100%): ");
        double tankPercentage = scnr.nextDouble();

        if ((tankPercentage < 0) || (tankPercentage > 100)) {
            System.out.println("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100 (INCLUSIVE)!!!");
            return;
        }

        //Calculate raw remaining miles left
        int rawRange = (int) (carMPG * tankCapacity * (tankPercentage * 0.01));

        //Display remaining miles left as rounded down integer
        if (rawRange <= 25) {
            System.out.println("Attention! Your current estimated range is running low: " + rawRange + " miles left!!!");
        }
        else {
            System.out.println("Keep driving! Your current estimated range is: " + rawRange + " miles!");
        }

    }
}
