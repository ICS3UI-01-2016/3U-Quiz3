
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vandl4973
 */
public class quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // new city
        City kw = new City();
        //robot with plants
        Robot bob = new Robot(kw, 1, 1, Direction.EAST, 20);
        //loop for planting plants
        int count =0;
        while (count<20) {
        if (bob.getDirection() == Direction.EAST){
            bob.putThing();
            bob.move();
        if (bob.getAvenue() ==5){
           bob.putThing();
           bob.turnLeft();
           bob.turnLeft();
           bob.turnLeft();
           bob.move();
           
           bob.turnLeft();
           bob.turnLeft();
           bob.turnLeft();
        }
        }
        if (bob.getDirection() == Direction.WEST){
            bob.putThing();
            bob.move();
            if (bob.getAvenue()==1){
               bob.putThing();
                bob.turnLeft();
                bob.move();
                
                bob.turnLeft();
            }
        }
        if (bob.getStreet()==5){
        
        break;
        }
        count+=1;
        }
    }
}
       
        


