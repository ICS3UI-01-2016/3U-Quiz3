
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl3669
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city 
        City kw = new City();

        // make robot that plants the seeds
        Robot karel = new Robot(kw, 1, 1, Direction.EAST, 20);
        

        // make robot move while planting the seeds
        for (int row = 0; row < 4; row = row + 1) {
            int move = 0;
            while (move < 5) {
                karel.putThing();
                karel.move();
                move = move + 1;
            }
            // make robot to turn around the line and return to Avenue(1) every time the robot finishes planting 5 seeds
            karel.turnLeft();
            karel.turnLeft();
            int turn = 0;
            while (turn < 5) {

                turn = turn + 1;
                karel.move();
            }
            
            // make robot move to (5,1) after he finishes planting 20 seeds
            karel.turnLeft();
            karel.move();
            karel.turnLeft();

        }
    }
}
