
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gavra1870
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create City hj
        City hj = new City();
        Robot bob = new Robot(hj, 1, 1, Direction.EAST, 20);
        //while loop with condition
        // count the 4 moves that the robot is going to do vertically 
        for (int l = 0; l < 4; l = l + 1) {
        //As the robot moves 5 space horizontally it will put a Tihng down and move      
            for (int a = 0; a < 5; a = a + 1) {
            bob.putThing();
            bob.move();
            }
        // Once the robot has arrived at Avenue 6 it will turn and move down, facing east 
            if (bob.getAvenue()== 6) {
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
                bob.move();
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
                bob.move();      
        //When the robot is not at avenue 6 it will turn and move down avenue 1 and return to its origanal postion 
            }else{
                bob.turnLeft();
                bob.move();
                bob.turnLeft();
                bob.move();
                
                
            }
       
        }
    }
}


