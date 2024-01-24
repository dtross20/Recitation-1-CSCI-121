import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt = 0;
        double userDouble = 0.0;
        // TODO Define char and string variables similarly
        char userChar = ' ';
        String userString = "";

        System.out.println("Enter integer:");
        userInt = scnr.nextInt();

        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space
        userDouble = scnr.nextDouble();
        userChar = scnr.next().charAt(0);
        userString = scnr.nextLine();

        System.out.print(userDouble);
        System.out.print(userInt);
        System.out.print(userChar);
        System.out.print(userString);


        // TODO (2): Output the four values in reverse


        // TODO (3): Cast the double to an integer, and output that integer

    }
}