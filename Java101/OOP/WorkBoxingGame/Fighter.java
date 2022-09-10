package OOP.WorkBoxingGame;

/**
 * @author Ali Yavuz YALCIN
 * 
 * This class defines fighter objects.
 */
public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;


    Fighter(String name, int damage, int health, int weight, double dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    /**
     * This method allows Fighter to hit the other fighter.
     * @param foe from Fighter class. Represents the rival.
     * @return remaining health
     */
    public int hit(Fighter foe){
        System.out.println("------------------");
        System.out.println(this.name + " hit " + foe.name + " " + this.damage + " damage.");
        
        if(foe.dodge()){
            System.out.println(foe.name + " has dodged the damage.");
            return foe.health;
        }

        if(foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }

    /**
     * This method produce a random value from 0 to 99,9.
     * Then calculates the possibility of blocking a hit.
     * If the result is greater than random value then it will return true.
     * @return false or true.
     */
    public boolean dodge(){

        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}
