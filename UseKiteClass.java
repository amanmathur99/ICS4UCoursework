// The UseDiamondClass Class


import java.awt.*;
import hsa.Console;

class UseKiteClass
{
    public static void main (String[] args)
    {
	// Instatiate the console object
	Console c = new Console ();

	//Instantiate 2 DiamondClass objects objects
	KiteClass d1 = new KiteClass (100, 50, 1, 100, 200, 200);

	// Set the properites of the first BalloonClass objec

	// draw the first DiamondClass objects
	// draw the second DiamondClass objects object with the default property values

	// You need to put a delay method in Diamond Class See Assign sheet

	// grow balloon objects
	d1.draw (c);
	d1.delay (500);
	d1.rotate (c, "CW");
	d1.delay (500);
	d1.rotate (c, "CW");
	d1.delay (500);
	d1.rotate (c, "CCW");
	d1.delay (3000);









	// Output message to the Java console
	c.setCursor (12, 30);
	c.println ("Program Over");

    }
}
