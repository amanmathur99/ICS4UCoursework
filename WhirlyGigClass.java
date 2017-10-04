// The DiamondClass Class
// Second in a series of demonstration programs for introducing Java

import hsa.Console;
import java.awt.*;

public class WhirlyGigClass extends SkyShapesClass
{
    // global variables for this class
    // encapsulated data



    //constructors
    public WhirlyGigClass ()
    {
	iStringLength = 200;
	iHeight = 200;
	iWidth = 200;
	iStringLength = iHeight;
    }




    public WhirlyGigClass (int h, int w, int l, int s, int x, int y)
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


    //procedures

    public void draw (Console c)
    {
	KiteClass K1 = new KiteClass (1);
	K1.draw (c);
    }




}


