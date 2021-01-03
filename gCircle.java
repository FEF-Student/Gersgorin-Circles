
/**
 * Write a description of class gCircle here.
 * 
 * The purpose of this code is to produce Gersgorin Circles from a matrix.
 * The matrix will be produced randomly by the java math random generator function,
 * then draw a circle, or circles, depending on the size of the matrix.
 *
 * @author: Felix Estay-Foix
 * @version: 12/31/2020 , 1/03/2020
 */
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
import java.awt.geom.Ellipse2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent ;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class gCircle extends JComponent
{
    // sets range for the random number generator
    private static final int range = 11;
    //the size of the matrix
    public static int nValue;
    public static int matrix[][];
    //values for drawing the circles
    public static final int xCoor;
    public static final int yCoor;
    public static final int size;
    public static int wFrame = 500;
    public static int hFrame = 1000;

    /**
     * Constructor for objects of class gCircle
     */
    public gCircle(int n)
    {
        // initialise instance variables
        nValue = n;
    }

    /**
     * Object to create the matrix and print it
     *
     * @param  n, the size of the matrix
     * 
     */
    public static void matrix(int n)
    {
        // matrix
        float m[][] = new float[n][n];
        //int matrix[][] = new int[n][n];

        int e[] = new int[n];
        nValue = n;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                m[i][j] = random();
                System.out.printf("%.0f", m[i][j]);
                System.out.print(" ");

                if(i == j)
                {
                    e[i] = (int)m[i][j];
                }
            }
            System.out.println(" ");
        }

        //return m[][];
    }

    /**
     * Method to create random numbers
     * 
     */
    public static int random()
    {
        Random rand = new Random();
        int num = rand.nextInt(range);
        return num;
    }

    /**
     *Method to find the eigenvalues of any matrix 
     *
     * 1/02/2020 note, seems this
     * matrix from the matrix method is not publicly available. Shelf this method for now.
     * 
     */

    public void eigenvalue()
    {
        int n = nValue;
        int e[];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                //m[i][j] = random();
                if(i == j)
                {
                    //e[i] = m[i][j];
                }
            }

        }
        //return 0;
    }

    /**
     * method to draw the Gersgorin Circles
     * 
     * 
     */
    public void circles(int x, int y, radius)
    {
        Ellipse2D.Int circle = new Ellipse2D.Double(x, y, radius, radius);

    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to Gersgorin Circles program");        
        System.out.println("Please enter a value to create a nxn matrix");

        Scanner scan = new Scanner (System.in);

        boolean valid = false;

        //loop to make sure a valid value is being entered
        while(!valid)
        {
            if(scan.hasNextInt())
            {
                int value = scan.nextInt();
                matrix(value);
            }
            else
            {
                System.out.println("Not a valid input.");
            }
        }
        System.out.println();
        System.out.println("The following is the randly generted matrix.");
        System.out.println();

        

        System.out.println("");

        //code to draw the G. Circles
        JFrame frame = new JFrame();
        frame.setSize(hFrame, wFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
