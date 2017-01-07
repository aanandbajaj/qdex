// The "Quadratic" class.
//y = ax^2 + bx + c
import java.util.*;
import javax.swing.*;
public class Quadratic
{
    public static void main (String[] args)
    {
	double a, b, c;

	//intro message
	a = Double.parseDouble (JOptionPane.showInputDialog ("a = "));
	b = Double.parseDouble (JOptionPane.showInputDialog ("b = "));
	c = Double.parseDouble (JOptionPane.showInputDialog ("c = "));

	//calculate discriminant
	double d, root1, root2;
	d = b * b - 4 * a * c;

	    //two real roots
	    if (d > 0)
	    {
		root1 = (-b + Math.sqrt (d)) / (2 * a);
		root2 = (-b - Math.sqrt (d)) / (2 * a);
		System.out.println ("Two roots: " + root1 + " and " + root2);
	    }
	    //no real roots
	    else if (d < 0)
	{
	    System.out.println ("No roots");
	}
	//one root
	else
	{
	    root1 = -b / (2 * a);
	    System.out.println ("One root: " + root1);
	}
    } // main method
} // Quadratic class
