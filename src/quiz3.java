
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Candice
 */
public class quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city
        City mtl = new City();
        //create a robot
        Robot candice = new Robot(mtl, 1, 1, Direction.EAST, 20);
        //create overall forloop for 4 rows
        for (int j = 0; j < 4; j++) {
            //forloop for dropping 5 seeds in a row
            for (int i = 0; i < 5; i++) {
                candice.putThing();
                candice.move();
            }
            //turn around
            candice.turnLeft();
            candice.turnLeft();
            //forloop for returning
            for (int i = 0; i < 5; i++) {
                candice.move();
            }
            //get to next row
            candice.turnLeft();
            candice.move();
            candice.turnLeft();
        }
    }

}
