
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create city
        City q1 = new City();

        // Create robot carrying 20 seeds
        RobotSE rick = new RobotSE(q1, 1, 1, Direction.EAST, 20);

        // Plant 4 rows of seeds
        for (int plantRow = 0; plantRow < 4; plantRow = plantRow + 1) {
            // Fill one row by planting 5 seeds
            for (int plantSeed = 0; plantSeed < 5; plantSeed = plantSeed + 1) {
                // Plant one seed
                rick.putThing();
                // If rick is not at the end of the row (avenue 5)
                if (rick.getAvenue() != 5) {
                    // Move forward
                    rick.move();
                    // If rick is at the end of the row (avenue 5)
                } else {
                    // MOVE TO NEW ROW
                    rick.turnRight();
                    rick.move();
                    rick.turnRight();
                    // Move to start of row (avenue 1) 
                    do {
                        rick.move();
                    } while (rick.getAvenue() != 1);
                    // Turn around to plant new row of seeds
                    rick.turnAround();
                }
            }
        }
    }
}
