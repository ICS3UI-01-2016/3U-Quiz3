
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shieg0688
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create city for robot
        City kw = new City();
        //create robot
        RobotSE karel = new RobotSE (kw, 1, 1, Direction.EAST, 20);
        //plant things
       int moves = 0;
       //place first two rows
       while(moves < 20){
           karel.putThing();
           karel.move();
           karel.putThing();
           moves = moves + 1;
           while(moves == 4){
               karel.turnRight();
               karel.move();
               karel.putThing();
               karel.turnRight();
               moves = moves + 1;
               while(moves == 8){
               karel.turnLeft();
               karel.move();
               karel.putThing();
               karel.turnRight();
               moves = moves + 1;
              
               }
              
               }
              
              
                   }
               }
           }
           
           
           
           
       
      
 
           
           
       
       
           
       
        
        

    

