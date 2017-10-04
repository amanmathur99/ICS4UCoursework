// The DiamondClass Class
// Second in a series of demonstration programs for introducing Java

import hsa.Console;
import java.awt.*;

public class SquircleClass extends Squapes
{
    // global variables for this class
    // encapsulated data


    //constructors
    public SquircleClass ()
    {
    }


    public SquircleClass (int x, int y, int sl, Color c)
    {
	iX = x;
	iY = y;
	sideLength = sl;
	cColor = c;
    }


    // communicator methods





    //procedures

    public void draw (Console c)
    {
	c.setColor (cColor); //set the console object's drawing colour
	c.fillRect (iX, iY, iX + sideLength, iY + sideLength);
	c.setColor (Color.white);
	c.fillOval (iX, iY, iX + sideLength, iY + sideLength);


    }



}
