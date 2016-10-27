
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katop7929
 */
public class QUIZ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city 
        City kpl = new City();
        
        // create a robot 
        RobotSE obama = new RobotSE(kpl,1,1,Direction.EAST,20); 
        
        // get obama to drop things
        int loop = 0;
       
        // make obama repeat the placing of things in rows 4 times 
        while(loop < 4){
            // get obama to place down things until he reaches avenue 6
        while(obama.getAvenue()!= 6){ 
            obama.putThing();
            obama.move();
            // get him to turn around when avenue 6 is reached 
            if(obama.getAvenue()== 6){
                obama.turnAround();
            }
        }
        // get obama to move back to avenue 1 and get him to turn left, move and turn left again 
        while(obama.getAvenue()!= 1){
            obama.move();
            if(obama.getAvenue()== 1){
                obama.turnLeft();
                obama.move();
                obama.turnLeft();
            }
        }
        
        loop = loop + 1;
        }   
    }
}
