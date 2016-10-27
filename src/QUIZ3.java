
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
       
        while(loop < 4){
        while(obama.getAvenue()!= 6){ 
            obama.putThing();
            obama.move();
            if(obama.getAvenue()== 6){
                obama.turnAround();
            }
        }
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
