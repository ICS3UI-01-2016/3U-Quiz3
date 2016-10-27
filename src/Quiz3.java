
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
 * @author manok5757
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new city
        City kw = new City();
        // create a new robot with 20 things to start with
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST, 20);

        // make karel repeat all actions listed below four times
        for (int moves = 0; moves < 4; moves = moves + 1) {

            // make a loop to make karel drop 5 things 
            for (int move = 0; move < 5; move = move + 1) {
                karel.putThing();
                karel.move();
            }
            // when he reaches avenue six make him turn around and get to the next street
            if (karel.getAvenue() == 6) {
                karel.turnRight();
                karel.move();
                karel.turnRight();
                karel.move();
            }
            // when karel reaches avenue 0, tell him to get down to the next street
            if (karel.getAvenue() == 0) {
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.move();
            }
        }
    }
}