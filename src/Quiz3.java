
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wangk9757
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kw = new City();
        //create a special robot with 20 things
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST, 20);
        //make main loop
        for (int i = 0; i < 3; i = i + 1) {
//get karel to put things as he moves 
            for (int f = 0; f <= 4; f = f + 1) {
                karel.putThing();
                karel.move();
                //get karel to move to next line 
            }
            karel.turnRight();
            karel.move();
            karel.turnRight();
            karel.move();
            for (int k = 0; k <= 3; k = k + 1) {
                karel.putThing();
                karel.move();





            }
            karel.putThing();
            karel.turnLeft();

            karel.move();
            karel.turnLeft();

 if (karel.countThingsInBackpack() == 0) {
            break;
        }
       
        }
    }
}
