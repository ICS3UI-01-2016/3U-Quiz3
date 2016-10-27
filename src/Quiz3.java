
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new city
        City mc = new City();
        //place robot
        Robot bul = new Robot(mc, 1, 1, Direction.EAST, 20);

        //pick up things and place them 
        int count = 0;
        //do 4 rows
        while (count < 4) {
            
            while (bul.frontIsClear()) {
                bul.putThing();
                bul.move();

                //turn to new crop
                if (bul.getStreet() == 1 && bul.getAvenue() == 5) {
                    bul.turnLeft();
                    bul.turnLeft();
                    bul.turnLeft();
                }

                if (bul.getStreet() == 2 && bul.getAvenue() == 5) {
                    bul.turnLeft();
                    bul.turnLeft();
                    bul.turnLeft();

                }
                if (bul.getStreet() == 2 && bul.getAvenue() == 1) {
                    bul.turnLeft();
                }
                if (bul.getStreet() == 3 && bul.getAvenue() == 1) {
                    bul.turnLeft();
                }
                if (bul.getStreet() == 3 && bul.getAvenue() == 5) {
                    bul.turnLeft();
                    bul.turnLeft();
                    bul.turnLeft();
                }
                if (bul.getStreet() == 4 && bul.getAvenue() == 5) {
                    bul.turnLeft();
                    bul.turnLeft();
                    bul.turnLeft();

                }
                if (bul.getStreet() == 4 && bul.getAvenue() == 1) {
                    bul.turnLeft();
                }

            }

        }
    }
}
