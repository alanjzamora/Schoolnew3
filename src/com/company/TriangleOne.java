//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Alan Zamora

import static java.lang.System.*; 
import java.util.Scanner;

public class TriangleOne
{
   //this lab is setup with a single static method
   //there are no instance variables or additional methods / constructors

	public static String createTriangle( String let, int size)
	{
		String output="";
		//runs how ever many the size is
		for(int i = 1;i<=size;i++) {
			output = output + let;

		}
			/*for(int j = 1;j<=i;j++){
				output = output + let;

			}
			output = output + "\n";



		}

*/


		return output;
	}
}
/*

{
		String output = "";

//runs however many times the size is
		for (int i = 1; i <=size; i++) {
			//runs where blank space is needed
			for (int j = size-1; j>=i; j--) {
				output = output + " ";

				//enters letters
				for (int k = i-1; k>=0; k--) {
				output = output + letter;


				}
				return output = output + "\n";
			}


		}
		return output + "\n";
	}
}
 */