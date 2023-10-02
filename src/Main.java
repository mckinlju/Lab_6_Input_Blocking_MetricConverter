
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double meters = 0.0;
        double inches = 0.0;
        double feet = 0.0;
        double miles = 0.0;
        boolean done = false;

        do {
            System.out.println("Please enter an amount in meters: ");
            if (in.hasNextDouble())
            {
                meters = in.nextDouble();
                if (meters >= 0)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Meters must be a positive number: ");
                    in.next();
                }

            }
            else
            {
                System.out.println("Please enter a number for meters!");
                in.next();
            }

        }while (!done);
        inches = meters * 39.3701;
        feet = meters * 3.28084;
        miles = meters * 0.0006211371;

        System.out.println("The number of meters you entered in inches is: " + inches);
        System.out.println("The number of meters you entered in feet is: " + feet);
        System.out.println("The number of meters you entered in miles is: " + miles);
    }
}
