
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author messr2578
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // setup the robot
        City kw = new City();
        Robot karel = new Robot(kw, 1, 1, Direction.EAST, 20);
        //create the loop for planting the seeds
        int loop = 0;
        //plant seeds until there are no seeds left  
        while (karel.countThingsInBackpack() <= 20) {
            if (loop < 5) {
                karel.putThing();
                karel.move();
                loop = loop + 1;
            }
            //go to the next row when facing east
            if (loop == 5 && karel.getDirection() == Direction.EAST) {
                loop = 0;
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
            }
            //go to the next row when facing west
            if (loop == 5 && karel.getDirection() == Direction.WEST) {
                loop = 0;
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.move();
            }
            //when the seeds are out
            if(karel.countThingsInBackpack()==0){
                break;
            }
        }
    }
}
