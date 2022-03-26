/*
name: Yujin Bae
dtae: october 15, 2020
teacher: mr. guglielmi
describtion: If statement programming.
This program will calculate the volume of either a sphere or a cylinder.
The shape and the dimesions are given by the user.
*/

// The "VolumeCalculator" class.
import java.awt.*;
import hsa.Console;

public class VolumeCalculator
{
    Console c;           // The output console

    //variable declaration
    static char quit;
    char shape;
    double height;
    double radius;

    //the constructor
    VolumeCalculator ()
    {
	c = new Console ("Volume Calculator");
    }


    //this method displays the title of the program
    private void title ()
    {
	c.print (' ', 21);
	c.println ("Volume of a sphere/cylinder calculator");
	c.println ();
    }


    //this method outputs the inrtoduction about the program
    //the title() method is also called in this method.
    public void intro ()
    {
	title ();
	c.print (' ', 32);
	c.println ("Made by Yujin Bae");
	c.println ("You can choose between a cylinder or a sphere. Given the dimensions of that shape, this program will calculate the volume of your shape for you.");
	c.println ();
    }


    //this method asks the user for the shape and the dimensions.
    public void askData ()
    {
	c.println ("Press 'c' if your shape is a cylinder or press 's' if your shape is a sphere");
	shape = c.readChar ();
	c.println ();

	if (shape == 'c')
	{
	    c.println ("Please type in the radius of the cylinder. ");
	    radius = c.readDouble ();
	    c.println ();

	    c.println ("Please type in the height of the cylinder. ");
	    height = c.readDouble ();
	    c.println ();
	}
	else
	{
	    c.println ("Please type in the radius of the sphere. ");
	    radius = c.readDouble ();
	    c.println ();
	}

	display ();
	pauseProgram ();
    }


    //this method outputs the calculations and the volume of the user's shape.
    private void display ()
    {
	if (shape == 'c')
	{
	    c.println ();
	    c.println ("Volume of a cylinder with the height of " + height + " units and radius of " + radius + " units");
	    c.println (" = \u03C0 x " + height + " x " + radius + " ^ 2 units cubed");
	    c.println (" = \u03C0 " + height * radius * radius + " units cubed");
	    c.println (" = " + Math.PI * height * radius * radius + " units cubed");
	    c.println ();
	    c.println ("Therefore, the volume of your cylinder is : " + Math.PI * height * radius * radius + " units cubed");
	    c.println ();
	}
	else
	{
	    c.println ();
	    c.println (" Volume of a shpere with the radius of " + radius + " units");
	    c.println (" = 4/3 x \u03C0 x " + radius + " ^ 3 units cubed");
	    c.println (" = \u03C0 " + radius * radius * radius * 4 / 3 + " units cubed");
	    c.println (" = " + Math.PI * 4 / 3 * radius * radius * radius + " units cubed");
	    c.println ();
	    c.println ("Thereforem the volume of your sphere is : " + Math.PI * 4 / 3 * radius * radius * radius + " units cubed");
	    c.println ();
	}
    }


    //this method asks the user if they wish to continue or exit the program.
    private void pauseProgram ()
    {

	c.println ("If you wish to quit the program, please type in \"q\". ");
	c.println ("If you wish to continue and make another calculation, please type in \"c\". ");
	quit = c.readChar ();
	c.println ();
    }


    //this method outputs the goodbye message and ends the program.
    public void goodbye ()
    {
	c.println ();
	c.println ("That's it for the volume of a sphere/cylinder calculator. ");
	c.println ("Thanks for using my program, and goodbye!");
	c.println ();
	c.println ("Press any key to exit. ");
	c.getChar ();
	System.exit (0);
    }


    //this is the main method of the program.
    public static void main (String[] args)
    {

	VolumeCalculator v = new VolumeCalculator ();

	v.intro ();

	do
	{
	    v.askData ();
	}
	while (quit == 'c');

	v.goodbye ();

    } // main method
} // VolumeCalculator class


