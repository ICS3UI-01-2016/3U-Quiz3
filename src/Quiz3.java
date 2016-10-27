
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitaa8228
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Make the city
        City kw = new City();
        //Make the robot
        RobotSE jim = new RobotSE(kw, 1, 1, Direction.EAST, 20);
        //Label jim
        jim.setLabel("Jim");
        jim.setColor(Color.blue);
        for (int plot = 0; plot < 4; plot++) {
            for (int line = 0; line < 5; line++) {
                jim.putThing();
                jim.move();
            }
            //Used to move up a street
            jim.turnAround();
            jim.move(5);
            jim.turnLeft();
            jim.move();
            jim.turnLeft();
        }
    }
}
