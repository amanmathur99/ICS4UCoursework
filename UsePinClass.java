// The UseDiamondClass Class


import java.awt.*;
import hsa.Console;

class UsePinClass
{
    public static void main (String[] args)
    {
	// Instatiate the console object
	Console c = new Console ();

	//Instantiate 2 DiamondClass objects objects
	PinClass d1 = new PinClass ();

	// Set the properites of the first BalloonClass object
	d1.setHeadX (200);
	d1.setHeadY (100);
	d1.setPointX (300);
	d1.setPointY(400);

	// draw the first DiamondClass objects
	d1.draw (c);


	// You need to put a delay method in Diamond Class See Assign sheet
	d1.delay (3000); // delay the program

	// erase both DiamondClass objects
	d1.erase (c);

	// Output message to the Java console
	c.setCursor (12, 30);
	c.println ("Program Over");

    }
}
