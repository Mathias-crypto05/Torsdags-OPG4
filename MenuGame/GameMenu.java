import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {

    private ArrayList<String> actions = new ArrayList<>();

    public GameMenu(ArrayList<String> actions) {
        this.actions = actions;
    }

    public void displayMenu() {

        for (int i = 0; i < actions.size(); i++) {
            System.out.println((i + 1) + ". " + actions.get(i));

        }
    }

    public String promptUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number to choose an action");
        displayMenu();
        String choise = scanner.nextLine();
        scanner.close();
        return choise;
    }
}