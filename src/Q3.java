
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
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();

        // create robot
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST, 20);

        // create starting loop
        int loop = 0;

        // male karel repeat rows 5 times
        while (loop < 1) {
            // allow karel to do the rows
            while (karel.getAvenue() != 6) {
                karel.putThing();
                karel.move();
                if (karel.getAvenue() == 6) {
                    karel.turnAround();
                    while (karel.getAvenue() != 1) {
                        karel.move();
                    }
                    // commands to all it to turn around
                    if (karel.getAvenue() == 1) {
                        karel.turnLeft();
                        karel.move();
                        karel.turnLeft();
                    }
                    // robot die once place there
                    if(karel.getStreet()==5 && karel.getAvenue() ==1){
                        break;
                    }

                }

            }
            // add the loop count
            loop = loop + 1;
        }

    }
}
