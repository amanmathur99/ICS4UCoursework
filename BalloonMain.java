import hsa.Console;     // Holt Software Associates' Console package
import java.awt.*;      // Java's Abstract Windowing Toolkit package - includes class Color

class BalloonMain 
{
    // declare a Colsole object to allow access to hsa's I/O methods
    static Console c;

    // global variables for this class
    static int iWidth = 80;
    static int iHeight = 100;
    static int iCentreX = 100;
    static int iCentreY = 100;

    // create a Color object from the Color class in java.awt.Color and
    // give it the value stored in the encapsulated data item called red
    static Color iColor = Color.red;

    // main method -- will be executed automatically - MUST have this signature
    // if this method is present the class is an application (main) program
    // if it isn't then the class must be instantiated in a main program
    public static void main (String[] args)
    {
	// instantiate a Console object from the hsa.Console package
	c = new Console ();

	// declare two arrays for X & Y coordinates of Diamond

	
	/**
	int iPointsX[] = new int [4];
	int iPointsY[] = new int [4];

	// calculate points on diamond & store in the arrays
	iPointsX [0] = iCentreX - iWidth / 2;
	iPointsY [0] = iCentreY;
	iPointsX [1] = iCentreX;
	iPointsY [1] = iCentreY - iHeight / 2;
	iPointsX [2] = iCentreX + iWidth / 2;
	iPointsY [2] = iCentreY;
	iPointsX [3] = iCentreX;
	iPointsY [3] = iCentreY + iHeight / 2;

	// draw the diamond using methods available from the Console object (c)
	c.setColour (iColor);
	c.fillPolygon (iPointsX, iPointsY, 4);
	**/
    }
}
