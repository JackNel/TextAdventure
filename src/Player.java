import java.util.ArrayList;

/**
 * Created by Jack on 10/9/15.
 */
public class Player {  // Create a new class, Player, to simplify our code in Game.java
    String name;
    String weapon;
    String area;
    ArrayList items = new ArrayList();

    void chooseName() {  // Create a method to choose the name
        System.out.println("What is your name, traveler?");
        name = Game.nextLine();
        System.out.println("Good luck, " + name);
    }

    void chooseWeapon() throws Exception {  // Create a method to choose the weapon
        System.out.println("[1] Pick up the sword");
        System.out.println("[2] Pick up the mallet");
        weapon = Game.nextLine();
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
        area = Game.nextLine();
        int areaNum = Integer.valueOf(area);
        if (areaNum == 1) {
            System.out.println("Entering the forest...");
        } else if (areaNum == 2) {
            System.out.println("Entering the tunnel");
        } else {
            throw new Exception("Invalid area.");
        }
    }

    void findItem(String item) {
        System.out.println("Found Item! Pick it up? [y/n]");
        String s = Game.nextLine();
        if (s.equals("y")) {
            System.out.println("You found a " + item);
            items.add(item);
        }
    }

}