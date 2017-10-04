// The UseDiamondClass Class


import java.awt.*;
import hsa.Console;

class UseWhirlyGigClass
{
    public static void main (String[] args)
    {
	// Instatiate the console object
	Console c = new Console ();

	//Instantiate 2 DiamondClass objects objects
	WhirlyGigClass g1 = new WhirlyGigClass (100,100,1,50,100,100);

	// Set the properites of the first BalloonClass objec

	// draw the first DiamondClass objects
	// draw the second DiamondClass objects object with the default property values

	// You need to put a delay method in Diamond Class See Assign sheet

	// grow balloon objects
	g1.draw (c);
	g1.delay (2000);
	// Output message to the Java console
	c.setCursor (12, 30);
	c.println ("Program Over");

    }
}
