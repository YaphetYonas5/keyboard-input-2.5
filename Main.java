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

      String name; // To hold the employee's name
        int age; // To hold the employee's age
        char gender; // To hold the employee's gender
        double salary; // To hold the employee's salary

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get the employee's name
        System.out.print("Enter name: ");
        name = console.nextLine();

        // Get the employee's age
        System.out.print("Enter age: ");
        age = console.nextInt();

        // Get the employee's gender
        System.out.print("Enter gender: ");
        gender = console.next().charAt(0);

        // Get the employee's salary
        System.out.print("Enter salary: ");
        salary = console.nextDouble();

        // Display the information
        System.out.println("Name: " + name + " Age: " + age + " Gender: "
                + gender + " Salary: " + salary);

    }

   }

  
