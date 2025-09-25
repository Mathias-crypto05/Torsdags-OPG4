import java.util.Scanner; // 2.c import Scanner

public class Main {
    public static void main(String[] args) {
        // 2.b Print message to the user
        System.out.println("Please type your name");

        // 2.c Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // 2.d Read name
        String name = scanner.nextLine();

        // 2.e Greet user and ask for age
        System.out.println("Hello " + name);
        System.out.println("Please type your age");

        // 2.f Read age
        int age = scanner.nextInt();

        // 2.g Print user's age
        System.out.println("You are " + age + " years old");

        // 2.h Calculate years until retirement
        int yearsUntilRetirement = 67 - age;
        System.out.println("You have " + yearsUntilRetirement + " years until retirement");
    }
}
