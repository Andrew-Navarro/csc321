//Andrew Navarro 


import java.util.Scanner;

      public class AndrewNavarro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pick your destiny:");
        System.out.println("1. \"I'm gonna make him an offer he can't refuse.\"");
        System.out.println("2. \"May the Force be with you.\"");
        System.out.println("3. \"Why so serious?\"");
        System.out.println("4. Exit dramatically");

        System.out.print("Your choice: ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("You chose power and confidence.");
        } else if (choice == 2) {
            System.out.println("You chose hope, courage, and adventure.");
        } else if (choice == 3) {
            System.out.println("You chose chaos with a smile.");
        } else if (choice == 4) {
            System.out.println("You slowly walk away as the screen fades to black...");
        } else {
            System.out.println("That option doesn't exist in this timeline.");
        }

        input.close();
    }
}

