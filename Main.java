import java.util.Scanner;    // Needed for Scanner class

public class Main {
  /**
 *  This program demonstrates keyboard input.
 */

   public static void main(String[] args)
   {
     
      int length;    // To hold rectangle's length.
      int width;     // To hold rectangle's width.
      int area;      // To hold rectangle's area

      // Create a Scanner object to read input.
      Scanner myObj = new Scanner(System.in);

      // Get length from the user.
      System.out.print("Enter length ");
      length = myObj.nextInt();

      // Get width from the user.
      System.out.print("Enter width ");
      width = myObj.nextInt();

      // Calculate area.
      area = length * width;

      // Display area.
      System.out.println("The area of rectangle is " + area);
   }
}
  
