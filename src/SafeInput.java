import java.util.Scanner;

public class SafeInput {
    public static int getRangedInt(Scanner console, String prompt, int low, int high) {
        int input;
        do {
            System.out.print(prompt);
            input = console.nextInt();
            console.nextLine();
        } while (input < low || input > high);
        return input;
    }
    public static boolean getYNConfirm(Scanner console, String prompt) {
        String response;
        do {
            System.out.print(prompt);
            response = console.nextLine().trim().toLowerCase();
        } while (!response.equals("y") && !response.equals("n"));
        return response.equals("y");
    }
}
