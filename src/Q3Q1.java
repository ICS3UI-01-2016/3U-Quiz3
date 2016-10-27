
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smith3577
 */
public class Q3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot karel = new Robot(kw, 1, 1, Direction.EAST, 20);
        
        int moves1 = 0; 
        while (moves1 < 4){
            karel.putThing();
            karel.move();
            moves1 = moves1 + 1;
        }
        karel.putThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        int moves2 = 0; 
        while (moves2 < 4){
            karel.putThing();
            karel.move();
            moves2 = moves2 + 1;
    }   
        karel.putThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
         int moves3 = 0; 
        while (moves3 < 4){
            karel.putThing();
            karel.move();
            moves3 = moves3 + 1;
        }
        karel.putThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        int moves4 = 0; 
        while (moves4 < 4){
            karel.putThing();
            karel.move();
            moves4 = moves4 + 1;
    }   
        karel.putThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
}
}
