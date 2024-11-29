import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String CORRECT_PASSWORD = "CeleHub"; // THIS IS THE CORRECT PASSWORD
        int MAX_ATTEMPTS = 3;

        System.out.println("Welcome! Please enter your password:");

        for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
            System.out.print("Attempt " + attempt + ": ");
            String userPassword = scanner.nextLine();

            if (userPassword.equals(CORRECT_PASSWORD)) {
                System.out.println("Access granted. Welcome!");
                break;
            } else {
                if (attempt < MAX_ATTEMPTS) {
                    System.out.println("Incorrect password. Please try again.");
                } else {
                    System.out.println("Incorrect password. You have been banned.");
                }
            }
        }

        scanner.close();
    }
}
