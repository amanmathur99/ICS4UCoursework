// The UseDiamondClass Class


import java.awt.*;
import hsa.Console;

class UsePinBalloon
{
    public static void main (String[] args)
    {
	// Instatiate the console object
	Console c = new Console ();

	//Random Integer

	// random pin


	//Instantiate balloon object
	BalloonClass d1 = new BalloonClass ();


	// Set the properites of the first BalloonClass object
	d1.setCenter (320, 240);
	d1.setHeight (200);
	d1.setWidth (200);
	d1.setColor (Color.blue);
	d1.setMaxHeight (400);
	d1.setMaxWidth (200);
	d1.setPopped (false);




	// draw the first DiamondClass objects
	d1.draw (c);


	d1.delay (1000); // delay the program

	// insert pins

	PinClass[] pins = new PinClass [100];

	for (int i = 1 ; i < 100 ; i++)
	{
	    
	    PinClass p1 = new PinClass ();

	    int p11 = (int) (Math.random () * 640) + 1;
	    int p12 = (int) (Math.random () * 480) + 1;
	    int p13 = (int) (Math.random () * 640) + 1;
	    int p14 = (int) (Math.random () * 480) + 1;

	    p1.setHeadX (p11);
	    p1.setHeadY (p12);
	    p1.setPointX (p13);
	    p1.setPointY (p14);
	    d1.isPointInside (c, p13, p14);
	    p1.draw (c);


	    d1.delay (500); // delay the program

	    pins [i] = p1;
	    if (d1.popped)
	    {
		for (int x = 1 ; x < i ; x++)
		{
		    pins [x].draw (c);
		}
		break;
	    }

	}

	// Output message to the Java console
	c.setCursor (12, 30);
	c.println ("Program Over");

    }
}
