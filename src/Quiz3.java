
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tmister911
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot geo = new Robot(kw, 1, 1, Direction.EAST, 20);
        //Main counting int
        int twoloops = 0;
   //Do everything below it twice
        while (twoloops < 2) {
            //secondary counting int
            int count = 0;
            //what to do 
            while (count < 5) {
                geo.putThing();
                geo.move();
                count++;
            }
            geo.turnLeft();
            geo.turnLeft();
            geo.turnLeft();
            geo.move();
            geo.turnLeft();
            geo.turnLeft();
            geo.turnLeft();
            geo.move();
            while (count < 10) {
                geo.putThing();
                geo.move();
                count++;
            }
            geo.turnLeft();
            geo.move();
            geo.turnLeft();
           geo.move();
            twoloops++;
        }
    }
}
