package OOP.WorkBoxingGame;

/**
 * @author Ali Yavuz YALCIN
 * 
 * This class lets the user play the game.
 */
public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    /**
     * This method runs the game.
     */
    public void run() {
        int counter = 1;
        if (checkWeight()) {
            System.out.println();
            System.out.println(this.f1.name + " health: " + this.f1.health);
            System.out.println(this.f2.name + " health: " + this.f2.health);
            System.out.println();
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("========= " + counter + ". ROUND " + "=========");

                if (isFirst() <= 50) {

                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.f1.name + " health: " + this.f1.health);
                    System.out.println(this.f2.name + " health: " + this.f2.health);
                    System.out.println();

                } else {

                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.f1.name + " health: " + this.f1.health);
                    System.out.println(this.f2.name + " health: " + this.f2.health);
                    System.out.println();
                }
                counter++;
            }
            printScore();
        } else {
            System.out.println("Sportsmen weights don't match!");
        }

    }
    /**
     * This method checks if the fighters weight have matched.
     * 
     * @return false or true
     */
    public boolean checkWeight() {

        return (this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight)
                && (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight);
    }

    /**
     * This method decides which fighter will be the first one to hit.
     * 
     * @return double random number
     */
    public double isFirst() { 
        double randomNumber = Math.random() * 100;
        return randomNumber;
    }

    /**
     * This method decides which fighter has won the match.
     * 
     * @return true or false.
     */
    boolean isWin() {

        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " is winner!");
            return true;
        }

        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " is winner!");
            return true;
        }

        return false;
    }

    /**
     * This method prints the score.
     */
    public void printScore() {
        System.out.println();
        System.out.println("========= MATCH RESULT =========");
        isWin();
        System.out.println(this.f1.name + " health: " + this.f1.health);
        System.out.println(this.f2.name + " health: " + this.f2.health);
    }
}
