import java.util.Scanner;

/**
 * Created by Jack on 10/9/15.
 */
public class Player {  // Create a new class, Player, to simplify our code in Game.java
    String name;
    String weapon;
    String area;

    void chooseName() {  // Create a method to choose the name
        System.out.println("What is your name, traveler?");
        Scanner scanner = new Scanner(System.in);  // Scanner object is built into Java and lets it read the user's text input
        name = scanner.nextLine();
        System.out.println("Good luck, " + name);
    }

    void chooseWeapon() throws Exception {  // Create a method to choose the weapon
        System.out.println("[1] Pick up the sword");
        System.out.println("[2] Pick up the mallet");
        Scanner scanner = new Scanner(System.in);
        weapon = scanner.nextLine();
        int weaponNum = Integer.valueOf(weapon);
        if (weaponNum == 1) {
            System.out.println("That's a fine sword!");
        } else if (weaponNum == 2) {
            System.out.println("That's a heavy mallet!");
        } else {
            throw new Exception("Invalid Weapon.");  // Exception is a built in class in Java
        }
    }

     void chooseArea() throws Exception {
        System.out.println("[1] Enter the forest");
        System.out.println("[2] Enter the underground tunnel");
        Scanner scanner = new Scanner(System.in);
        area = scanner.nextLine();
        int areaNum = Integer.valueOf(area);
        if (areaNum == 1) {
            System.out.println("Entering the forest...");
        } else if (areaNum == 2) {
            System.out.println("Entering the tunnel");
        } else {
            throw new Exception("Invalid area.");
        }
    }

}