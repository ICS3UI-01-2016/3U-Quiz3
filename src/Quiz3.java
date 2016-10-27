
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();
        // make a robot
        RobotSE lang = new RobotSE(kw, 1, 1, Direction.EAST, 20);
        // create a for loop
        for (int i = 0; i < 4; i = i + 1) {
            // create a second for loop for repeats
            for (int t = 0; t < 5; t = t + 1) {
                lang.putThing();
                lang.move();
            }
            // count backpack to turn the correct way
            if (lang.countThingsInBackpack() == 15) {
                lang.turnRight();
                lang.move();
                lang.turnRight();
                lang.move();
            }
            // count backpack to turn back 
            if (lang.countThingsInBackpack() == 10) {
                lang.turnLeft();
                lang.move();
                lang.turnLeft();
                lang.move();
            }
           // count backpack for last row
            if (lang.countThingsInBackpack() == 5) {
                lang.turnRight();
                lang.move();
                lang.turnRight();
                lang.move();
            }
            // count backpack for last row to finish spot
            if (lang.countThingsInBackpack() == 0) {
                lang.turnLeft();
                lang.move();
                lang.turnLeft();
                lang.move();
            }
        }
    }
}
