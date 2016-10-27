
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class Q3assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();

        // create a robot with 20 things
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST, 20);

        // create a counter loop for the rows the robot needs to complete
        int count = 0;
        // tell the robot how many robot rows that need to be completed
        while (count < 4) {
            // counter increase by 1 each time
            count = count + 1;
            // create second counter for how many things need to be placed in each row
            int moves = 0;
            // create the loop
            while (moves < 5) {
                karel.putThing();
                karel.move();
                // counter increases by 1 each time
                moves = moves + 1;
                // once karel finishes row turn back
                if (karel.getAvenue() == 6) {
                    karel.turnAround();
                    // once karel is back on avenue one move to row below
                    while (karel.getAvenue() != 1) {
                        karel.move();
                        // commands for when the robot needs to turn to row below
                        if (karel.getAvenue() == 1) {
                            karel.turnLeft();
                            karel.move();
                            karel.turnLeft();
                        }
                    }
                }
            }
        }


    }
}
