//� A+ Computer Science  -  www.apluscompsci.com
//Name - Alan Zamora
//Date - 3/8/21
//Class - period 2nd
//Lab  - RandomColoredBoxes

import javax.swing.JFrame; 

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);
						
		getContentPane().add(new RandomColoredBoxes());
						
		//getContentPane().add(new RandomColoredBoxes());
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}