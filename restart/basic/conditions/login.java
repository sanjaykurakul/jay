import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String correctUsername = "admin";
        String correctPassword = "1234";

        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        String password = sc.next();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login Successful");
        } else if (username.equals(correctUsername) && !password.equals(correctPassword)) {
            System.out.println("Wrong Password");
        } else {
            System.out.println("Invalid Username");
        }

        sc.close();
    }
}