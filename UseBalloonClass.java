// The UseDiamondClass Class


import java.awt.*;
import hsa.Console;

class UseBalloonClass
{
    public static void main (String[] args)
    {
	// Instatiate the console object
	Console c = new Console ();

	//Instantiate 2 DiamondClass objects objects
	BalloonClass d1 = new BalloonClass (50,50,20,200,200,200,200,false,false);
d1.fib(4);
	d1.delay (1000); // delay the program





	// Output message to the Java console
	c.setCursor (12, 30);
	c.println ("Program Over");

    }
}
