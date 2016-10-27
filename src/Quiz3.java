
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 * Quiz 3 Plant some seeds
 *
 * @author micla1676
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City farm = new City();

        //create robot
        Robot karel = new Robot(farm, 1, 1, Direction.EAST, 20);

        //x equals how many times the loop is executed 

        //create a for loop, 
        for (int x = 0; x < 4; x = x + 1) {
            //move forward 5 times while placing things down
            //y represents the number of times this for loop is executed
            for (int y = 0; y < 5; y = y + 1) {
                karel.putThing();
                karel.move();
            }
            /*when karel faces east, turn right, move forward, turn right,
             then moves forward again
             */
            if (karel.getDirection() == Direction.EAST) {
                //karel turns right
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                //karel moves forward 1
                karel.move();
                // karel turns right
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                //karel moves forward 1
                karel.move();
            } 
            /*when karel faces west, turns left, move forward, turns left,
             then moves forward again
             */ else if (karel.getDirection() == Direction.WEST) {
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.move();
            }
        }
    }
}
