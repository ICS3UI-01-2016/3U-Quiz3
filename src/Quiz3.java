
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayyaf3300
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // make a city
        City kw = new City();
        // make a robot
        Robot dino = new Robot(kw, 1, 1, Direction.EAST, 20);
        // make a loop that will tell the robot to (plant seeds) on all 4 rows
        for (int a = 0; a <= 3; a = a + 1) {
            // make a for loop that will tell robot to plant seeds in 4 horizontal rows
            for (int i = 0; i <= 4; i = i + 1) {
                // tell robot to put things 
                dino.putThing();
                // tell the robot to move
                dino.move();
            }
            // make code to tell the robot to move onto the 2nd row
            dino.turnLeft();
            // tell the robot to turn left
            dino.turnLeft();
            dino.turnLeft();
            dino.move();
            dino.turnLeft();
            dino.turnLeft();
            dino.turnLeft();
            dino.move();
            //loop again
            for (int m = 0; m <= 4; m = m + 1) {
                dino.putThing();
                dino.move();
            }
            // make code to tell the robot to move to the 3rd row
            dino.turnLeft();
            dino.move();
            dino.turnLeft();
            dino.move();
            // make an if statement so that the robot wont smack its hand on the ground thinkint that their is more things in t=its backpack (theirs NOT)                
            if (dino.countThingsInBackpack() == 0) {
                // break if this is true
                break;
            }
        }
    }
}
