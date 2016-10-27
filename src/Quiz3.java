
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomlj9878
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City JT = new City();
        //create robot
        Robot farmer = new Robot(JT,1,1,Direction.EAST,20);
        //create count
        int count1 = 0;
        //move farmer
        while(count1<5){
            farmer.putThing();
            farmer.move();
            count1 = count1 + 1;
            }
        farmer.turnLeft();
        farmer.turnLeft();
        farmer.turnLeft();
        farmer.move();
        farmer.turnLeft();
        farmer.turnLeft();
        farmer.turnLeft();
        farmer.move();
        //create count
        int count2 = 0;
        //move farmer
        while(count2<5){
            farmer.putThing();
            farmer.move();
            count2 = count2 + 1;
            }
        farmer.turnLeft();
        farmer.move();
        farmer.turnLeft();
        farmer.move();
        //create count
        int count3 = 0;
        //move farmer
        while(count3<5){
            farmer.putThing();
            farmer.move();
            count3 = count3 + 1;
        }
        farmer.turnLeft();
        farmer.turnLeft();
        farmer.turnLeft();
        farmer.move();
        farmer.turnLeft();
        farmer.turnLeft();
        farmer.turnLeft();
        farmer.move();
        //create count
        int count4 = 0;
        //move farmer
        while(count4<5){
            farmer.putThing();
            farmer.move();
            count4 = count4 + 1;
        }
        farmer.turnLeft();
        farmer.move();
        farmer.turnLeft();
        farmer.move();
    }
}


