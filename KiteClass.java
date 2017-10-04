// The DiamondClass Class
// Second in a series of demonstration programs for introducing Java

import hsa.Console;
import java.awt.*;

public class KiteClass extends SkyShapesClass
{
    // global variables for this class
    // encapsulated data
    private int iWidth = 80;
    private int iHeight = 100;
    private int iCentreX = 100;
    private int iStringLength = 100;
    private int iCentreY = 100;
    private int iStringDirection = 1;
    private boolean filled = true;


    //constructors
    public KiteClass ()
    {
    }


    public KiteClass (int x)
    {
	iStringDirection = x;

    }


    public KiteClass (int h, int w, int l, int s, int x, int y)
    {
	iHeight = h;
	iWidth = w;
	iStringDirection = l;
	iStringLength = s;
	iCentreX = x;
	iCentreY = y;

    }


    // communicator methods



    public void setCenter (int iNewCentreX, int iNewCentreY)
    {
	iCentreX = iNewCentreX;
	iCentreY = iNewCentreY;
    }



    public int getString ()
    {
	return iStringLength;
    }


    public void setString (int string)
    {
	iStringLength = string;
    }




    //procedures

    public void draw (Console c)
    {
	c.setColor (cColor);

	//draw in string
	if (iStringDirection == 1)
	{
	    c.drawLine (iCentreX, iCentreY + iHeight / 2, iCentreX, iCentreY + iHeight / 2 + iStringLength);
	}
	else if (iStringDirection == 2)
	{
	    c.drawLine (iCentreX - iWidth / 2, iCentreY, iCentreX - iWidth / 2 - iStringLength, iCentreY);

	}
	else if (iStringDirection == 3)
	{
	    c.drawLine (iCentreX, iCentreY - iHeight / 2, iCentreX, iCentreY - iHeight / 2 - iStringLength);

	}
	else if (iStringDirection == 4)
	{
	    c.drawLine (iCentreX + iWidth / 2, iCentreY, iCentreX + iWidth / 2 + iStringLength, iCentreY);
	}

	// declare two arrays for X & Y coordinates of Diamond
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

	c.fillPolygon (iPointsX, iPointsY, 4);
    }


    public void rotate (Console c, String dir)
    {
	erase (c);

	int temp1 = iHeight;
	int temp2 = iWidth;
	iWidth = temp1;
	iHeight = temp2;
	if (dir == "CW")
	{
	    if (iStringDirection == 4)
	    {
		iStringDirection = 1;
	    }
	    else
	    {
		iStringDirection++;
	    }
	}
	else
	{
	    if (iStringDirection == 1)
	    {
		iStringDirection = 4;
	    }
	    else
	    {
		iStringDirection--;
	    }
	}
	draw (c);

    }
}


