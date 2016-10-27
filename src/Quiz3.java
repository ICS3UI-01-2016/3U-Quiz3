
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fabed2976
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a a city for the robot and it is carrying 20 things
        City nm = new City();
        Robot kris = new Robot(nm, 1, 1, Direction.EAST, 20);

        //robot willl plant his seeds
        for (int a = 0; a < 4; a = a + 1) {



            for (int i = 0; i < 5; i = i + 1) {
                kris.putThing();
                kris.move();
            }
            if (kris.getAvenue() == 6) {
                kris.turnLeft();
                kris.turnLeft();
                kris.turnLeft();
                kris.move();
                kris.turnLeft();
                kris.turnLeft();
                kris.turnLeft();
                kris.move();
            }else{
                kris.turnLeft();
                kris.move();
                kris.turnLeft();
                kris.move();
            }


        }
    }
}
