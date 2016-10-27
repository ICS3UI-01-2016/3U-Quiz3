
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slatz8075
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a City for the Robot
        City kw = new City();
        //Create robot
        Robot karel = new Robot(kw, 1, 1, Direction.EAST, 20);

        //set count = 0
        int count = 0;
        int count2 = 0;
        //while karel has stuff in his back pack tell him to move
        while (karel.countThingsInBackpack() > 0) {
            //planting crops and moving forward + adding 1 to count
            while (count < 4) {
                karel.putThing();
                karel.move();
                count = count + 1;
            }
            karel.putThing();
            karel.turnLeft();
            karel.turnLeft();
            //moving back
            while (count2 < 4) {
                karel.move();
                count2 = count2 + 1;
            }
            if (count2 == 4) {
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
            }
            count = count - 4;
           count2 = count2 - 4;
        }
        
    }
}
