
import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        int score = 0;

        if (password.length() >= 8)
            score++;

        if (password.matches(".*[A-Z].*"))
            score++;

        if (password.matches(".*[a-z].*"))
            score++;

        if (password.matches(".*[0-9].*"))
            score++;

        if (password.matches(".*[@#$%^&+=!].*"))
            score++;

        if (score == 5)
            System.out.println("Strong Password");
        else if (score >= 3)
            System.out.println("Medium Password");
        else
            System.out.println("Weak Password");

        sc.close();
    }
}
