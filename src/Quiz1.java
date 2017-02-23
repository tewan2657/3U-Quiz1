
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tewan2657
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creat a city 
        City kw = new City();

        //create a robot 
        RobotSE carl = new RobotSE(kw, 4, 0, Direction.EAST);

        //create a stair case
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);

        //place lights on the stair case
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);

        //move and pick up the four lights 
        carl.move();
        carl.pickThing();
        carl.turnLeft();
        carl.move();
        carl.turnRight();
        carl.move();
        carl.pickThing();
        carl.turnLeft();
        carl.move();
        carl.turnRight();
        carl.move();
        carl.pickThing();
        carl.turnLeft();
        carl.move();
        carl.turnRight();
        carl.move();
        carl.pickThing();

        // while climbing down the stair place the lights 
        carl.move();
        carl.putThing();
        carl.move();
        carl.turnRight();
        carl.move();
        carl.putThing();
        carl.turnLeft();
        carl.move();
        carl.turnRight();
        carl.move();
        carl.putThing();
        carl.turnLeft();
        carl.move();
        carl.turnRight();
        carl.move();
        carl.putThing();
        carl.turnLeft();
        carl.move();



    }
}
