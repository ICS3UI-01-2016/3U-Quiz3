
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a city for robot
        City field = new City();

        //Create a special robot WITH 20 things in his backpack
        RobotSE bob = new RobotSE(field, 1, 1, Direction.EAST, 20);


        //Create a big loop to make robot plant all four rows
        for (int a = 0; a <= 3; a = a + 1) {
            //Create for loop to plant 5 in a horizontal row
            for (int i = 0; i <= 4; i = i + 1) {
                bob.putThing();
                bob.move();
            }
            //get robot to move to second row
            bob.turnRight();
            bob.move();
            bob.turnRight();
            bob.move();
            //loop again
            for (int m = 0; m <= 4; m = m + 1) {
                bob.putThing();
                bob.move();
            }
            //get robot to move to third row
            bob.turnLeft();
            bob.move();
            bob.turnLeft();
            bob.move();

            //Create if statement to stop robot from dying
            if (bob.countThingsInBackpack() == 0) {
                break;
            }
        }
    }
}
