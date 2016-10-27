
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
         City quiz = new City();
        // Create a robot
        Robot karel = new Robot(quiz, 1, 1, Direction.EAST, 20);
        // 
        while(karel.countThingsInBackpack() >15) {
            karel.putThing();
            karel.move();}
            while(karel.countThingsInBackpack() ==15) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                break;}
         while(karel.countThingsInBackpack() >10) {
             karel.putThing();
             karel.move();}
             while(karel.countThingsInBackpack() ==10) {
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.move();
                break;}
         while(karel.countThingsInBackpack() >5) {
            karel.putThing();
            karel.move();}
            while(karel.countThingsInBackpack() ==5) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                break;}
         while(karel.countThingsInBackpack() >0) {
             karel.putThing();
             karel.move();}
             while(karel.countThingsInBackpack() ==0) {
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.move();
                break;}
            
            

            
        
    }
}
