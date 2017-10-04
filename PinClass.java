// The DiamondClass Class
// Second in a series of demonstration programs for introducing Java

import hsa.Console;
import java.awt.*;

class PinClass
{
    // global variables for this class
    // encapsulated data
    private int iHeadX = 100;
    private int iHeadY = 100;
    private int iPointX = 200;
    private int iPointY = 200;

    // communicator methods

    public void setHeadX (int iNewHeadX)
    {
	iHeadX = iNewHeadX;
    }


    public int getHeadX ()
    {
	return iHeadX;
    }


    public void setHeadY (int iNewHeadY)
    {
	iHeadY = iNewHeadY;
    }


    public int getHeadY ()
    {
	return iHeadY;
    }


    public void setPointX (int iNewPointX)
    {
	iPointX = iNewPointX;
    }


    public int getPointX ()
    {
	return iPointX;
    }


    public void setPointY (int iNewPointY)
    {
	iPointY = iNewPointY;
    }


    public int getPointY ()
    {
	return iPointY;
    }



    public void draw (Console c)
    {
	int upperLeftCornerX = iHeadX - 5; //upper left coordinates
	int upperLeftCornerY = iHeadY - 5; //needed to draw the oval
	c.setColor (Color.black); //set the console object's drawing colour
	c.fillOval (upperLeftCornerX, upperLeftCornerY, 10, 10);
	c.drawLine (iPointX, iPointY , iHeadX, iHeadY);
    }



    public void erase (Console c)
    {
	 int upperLeftCornerX = iHeadX - 5; //upper left coordinates
	int upperLeftCornerY = iHeadY - 5; //needed to draw the oval
	c.setColor (Color.white); //set the console object's drawing colour
	c.fillOval (upperLeftCornerX, upperLeftCornerY, 10, 10);
	c.drawLine (iPointX, iPointY , iHeadX, iHeadY);
    }


    public void delay (int iDelayTime)
    {
	long IFinalTime = System.currentTimeMillis () + iDelayTime;
	do
	{
	}
	while (IFinalTime >= System.currentTimeMillis ());
    }
}
