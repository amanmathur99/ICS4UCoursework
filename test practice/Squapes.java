// The DiamondClass Class
// Second in a series of demonstration programs for introducing Java

import hsa.Console;
import java.awt.*;

public abstract class Squapes
{
    // global variables for this class
    // encapsulated data
    public int iX = 80;
    public int iY = 100;
    public int sideLength = 100;
    public Color cColor = Color.black;

    //
    public abstract void draw (Console c);

    // communicator methods


 
    public Color getColor ()
    {
	return cColor;
    }






    //procedures





    public void delay (int iDelayTime)
    {
	long IFinalTime = System.currentTimeMillis () + iDelayTime;
	do
	{
	}
	while (IFinalTime >= System.currentTimeMillis ());
    }
}


