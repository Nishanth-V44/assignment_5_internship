import java.util.Scanner;

public class ChooseYourAdventure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are Amelia Earhart. Your plane has crashed on a deserted island.");
        System.out.println("Choose your actions wisely to survive.\n");

        int n = 1;
        while (n != 0) {
            System.out.println("What would you like to do?");
            System.out.println("1. Explore the island");
            System.out.println("2. Build a shelter");
            System.out.println("3. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (!exploreIsland(scanner)) {
                        System.out.println("Game over. You did not survive. Goodbye!");
                        System.exit(0);
                    }
                    break;
                case 2:
                    if (!buildShelter(scanner)) {
                        System.out.println("Game over. You did not survive. Goodbye!");
                        System.exit(0);
                    }
                    break;
                case 3:
                    System.out.println("Thanks for playing. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

    public static boolean exploreIsland(Scanner scanner) {
        System.out.println("You find a dense forest and a mysterious cave. Where would you like to go?");
        System.out.println("1. Explore the forest");
        System.out.println("2. Enter the cave");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You are lost and are not able to go back to the beach.");
                return false;
            case 2:
                System.out.println("Inside the cave, you find ancient artifacts and a source of fresh water. Well done!");
                return true;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
                return false;
        }
    }

    public static boolean buildShelter(Scanner scanner) {
        System.out.println("You can build a shelter near the beach or in the dense forest. Where would you like to build?");
        System.out.println("1. Near the beach");
        System.out.println("2. In the dense forest");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your beachside shelter is sturdy and protects you from the weather.");
                return true;
            case 2:
                System.out.println("In the dense forest, you are bitten by a snake.");
                return false;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
                return false;
        }
    }
}
