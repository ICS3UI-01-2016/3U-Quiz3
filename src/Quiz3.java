
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author macdt8987
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make city
        City kw = new City();
        // New robot
        RobotSE karl = new RobotSE(kw, 1, 1, Direction.EAST, 20);
        // Make the robot move
        //First lane
        if (karl.frontIsClear()) {
            for (int a = 0; a < 1; a = a + 1) {
                karl.putThing();
                karl.move();
                karl.putThing();
                karl.move();
                karl.putThing();
                karl.move();
                karl.putThing();
                karl.move();
                karl.turnRight();
                karl.putThing();
                karl.move();
                karl.turnRight();
                //Second lane
                if (karl.frontIsClear()) {
                    for (int b = 0; b < 1; b = b + 1) {
                        karl.putThing();
                        karl.move();
                        karl.putThing();
                        karl.move();
                        karl.putThing();
                        karl.move();
                        karl.putThing();
                        karl.move();
                        karl.turnLeft();
                        karl.putThing();
                        karl.move();
                        karl.turnLeft();
                        // Third lane
                        if (karl.frontIsClear()) {

                            for (int c = 0; c < 1; c = c + 1) {
                                karl.putThing();
                                karl.move();
                                karl.putThing();
                                karl.move();
                                karl.putThing();
                                karl.move();
                                karl.putThing();
                                karl.move();
                                karl.turnRight();
                                karl.putThing();
                                karl.move();
                                karl.turnRight();
                                //Fourth lane
                                if (karl.frontIsClear()) {
                                    for (int d = 0; d < 1; d = d + 1) {
                                        karl.putThing();
                                        karl.move();
                                        karl.putThing();
                                        karl.move();
                                        karl.putThing();
                                        karl.move();
                                        karl.putThing();
                                        karl.move();
                                        karl.turnLeft();
                                        karl.putThing();
                                        karl.move();
                                        karl.turnLeft();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
