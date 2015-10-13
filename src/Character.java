/**
 * Created by Jack on 10/13/15.
 */
public class Character {
    String name;
    int health;
    int damage;

    void battle(Character opponent) {  //method called battle
        while (health > 0  && opponent.health > 0) {  //While health is less than zero or opponent health is less than zero
            health -= opponent.damage;
            opponent.health -= damage;
        }

        String deadMessage = ("%s has been killed!");

        if (health <= 0) {
            System.out.println(String.format(deadMessage, name));
        }

        if (opponent.health <= 0) {
            System.out.println(String.format(deadMessage, opponent.name));
        }
    }
}
