//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Alan Zamora
import java.util.Scanner;
import static java.lang.System.*;

public class BoxWordRunner
{
   public static void main( String args[] )
   {
      Scanner keyboard = new Scanner(System.in);
      String choice = "";
      do {
         out.print("Enter a word : ");
         String value = keyboard.next();

         //instantiate a TriangleTwo object
         BoxWord phrase = new BoxWord(value);
         //call the toString method to print the triangle
         System.out.println(phrase);

         System.out.print("Do you want to enter more data? ");
         choice = keyboard.next();
      } while (choice.equals("Y") || choice.equals("y"));



   }
}