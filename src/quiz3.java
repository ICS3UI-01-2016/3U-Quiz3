
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lawd8918
 */
public class quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kw = new City();
        //create a robot
        Robot dave = new Robot(kw, 1, 1, Direction.EAST, 20);
        //set counter to 0 
        int count = 0;
        //while in field
        while (dave.getAvenue() < 6 && dave.getAvenue() > 0 && count < 20) {
            dave.putThing();
            dave.move();
            count = count + 1;
            //when dave gets to end of field on the right
            if (dave.getAvenue() == 6) {
                dave.turnLeft();
                dave.turnLeft();
                dave.turnLeft();
                dave.move();
                dave.turnLeft();
                dave.turnLeft();
                dave.turnLeft();
                dave.move();
            }
            //when dave gets to end of field on the left
            if (dave.getAvenue() == 0) {
                dave.turnLeft();
                dave.move();
                dave.turnLeft();
                dave.move();
            }
        }
    }
}
