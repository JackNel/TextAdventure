import java.util.ArrayList;

/**
 * Created by Jack on 10/9/15.
 */
public class Player extends Character {  // Create a new class, Player, to simplify our code in Game.java
    String area;
    ArrayList<String> items = new ArrayList();

    public Player() {
        health = 100;
        damage = 20;
    }

    void chooseName() {  // Create a method to choose the name
        System.out.println("What is your name, traveler?");
        name = Game.nextLine();
        System.out.println(String.format("Good luck, %s", name));
    }

    void chooseWeapon() throws Exception {  // Create a method to choose the weapon
        System.out.println("[1] Pick up the sword");
        System.out.println("[2] Pick up the mallet");
        int weaponNum = Integer.valueOf(Game.nextLine());
        if (weaponNum == 1) {
            weapon = new Weapon();
            weapon.name = "Sword";
            weapon.damage = 10;
        } else if (weaponNum == 2) {
            weapon = new Weapon();
            weapon.name = "Mallet";
            weapon.damage = 10;
        } else {
            throw new Exception("Invalid Weapon.");  // Exception is a built in class in Java
        }
        System.out.println(String.format("That's a fine %s!", weapon.name.toLowerCase()));
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
            System.out.println(String.format("You found a %s", item));
            items.add(item);
        }
    }
}//end class Player