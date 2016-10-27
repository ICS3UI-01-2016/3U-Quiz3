
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create city for robot
        City kw = new City();
        //create a robot
        Robot rick = new Robot(kw, 1, 1, Direction.EAST,20);
        
        //create loop to move rick
        //create a counter variable
        int count = 1;
        //loop 4 times
        while (count < 5) {
            rick.putThing();
            rick.move();
            rick.putThing();
            rick.move();
            rick.putThing();
            rick.move();
            rick.putThing();
            rick.move();
            rick.putThing();
            rick.turnLeft();
            rick.turnLeft();
            rick.move();
            rick.move();
            rick.move();
            rick.move();
            rick.turnLeft();
            rick.move();
            rick.turnLeft();
            //count 1 step
            count = count + 1;
            //counting using a for loop
            for (int i = 1; i < 5; i = i + 1) {
            }
        }
        
        
        
    }
}
