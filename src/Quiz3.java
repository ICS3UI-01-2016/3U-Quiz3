
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city
        City kw = new City();
        //create a new robot
        Robot tom = new Robot(kw, 1, 1, Direction.EAST, 20);

        //move the robot
        for (int move = 0; move < 4; move = move + 1) {
            for (int i = 0; i < 5; i = i + 1) {
                
                tom.putThing();
                tom.move();
            }
            if (tom.getAvenue() == 6 && tom.getDirection() == Direction.EAST) {
                tom.turnLeft();
                tom.turnLeft();
                tom.turnLeft();
                tom.move();
                tom.turnLeft();
                tom.turnLeft();
                tom.turnLeft();
                tom.move();

            }
            if (tom.getAvenue() == 0 && tom.getDirection() == Direction.WEST) {
                tom.turnLeft();
                tom.move();
                tom.turnLeft();
                tom.move();
                
   
            }
            
        }

    }
    // TODO code application logic here
}
