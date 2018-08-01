import java.util.Scanner;

/**
   This program demonstrates static methods
*/

public class Geometry
{
   public static void main(String[] args)
   {
      int choice;       // The user's choice
      double value = 0; // The method's return value
      char letter;      // The user's Y or N decision
      double radius;    // The radius of the circle
      double length;    // The length of the rectangle
      double width;     // The width of the rectangle
      double height;    // The height of the triangle
      double base;      // The base of the triangle
      double side1;     // The first side of the triangle
      double side2;     // The second side of the triangle
      double side3;     // The third side of the triangle

      // Create a scanner object to read from the keyboard
      Scanner keyboard = new Scanner(System.in);

      // The do loop allows the menu to be displayed first
      do
      {
         // TASK #1 Call the printMenu method
         printMenu();
         choice = keyboard.nextInt();

         switch(choice)
         {
            case 1:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circleArea method and
               // store the result in the value variable
               value = circleArea(radius); 
               // r = 2; A = 3.14 * 2*2 ~ 12.56
                              
               System.out.println("The area of the " +
                                  "circle is " + value);
               break;
            case 2:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the rectangleArea method and
               // store the result in the value variable
               value = rectangleArea(length, width);
               // length = 5, width = 2; A = 5 * 2 = 10
               
               System.out.println("The area of the " +
                                  "rectangle is " + value);
               break;
            case 3:
               System.out.print("Enter the height of " +
                                "the triangle: ");
               height = keyboard.nextDouble();
               System.out.print("Enter the base of " +
                                "the triangle: ");
               base = keyboard.nextDouble();

               // TASK #3 Call the triangleArea method and
               // store the result in the value variable
               value = triangleArea(base, height);
               // base = 5, height = 4; A = 0.5 * 5 * 4 = 10
               
               System.out.println("The area of the " +
                                  "triangle is " + value);
               break;
            case 4:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circumference method and
               // store the result in the value variable
               value = circleCircumference(radius);
               // radius = 3; C = 2 * 3.14 * 3 ~ 18.84
               System.out.println("The circumference " +
                                  "of the circle is " +
                                  value);
               break;
            case 5:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               value = rectanglePerimeter(length, width);
               //length = 5, width = 2; P = 2 * 5 + 2 * 2 = 14
               System.out.println("The perimeter of " +
                                  "the rectangle is " +
                                  value);
               break;
            case 6:
               System.out.print("Enter the length of " +
                                "side 1 of the " +
                                "triangle: ");
               side1 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 2 of the " +
                                "triangle: ");
               side2 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 3 of the " +
                                "triangle: ");
               side3 = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               value = trianglePerimeter(side1, side2, side3);
               // side1 = 1, side2 = 2, side3 = 3; P = 1 + 2 + 3 = 6 
               System.out.println("The perimeter of " +
                                  "the triangle is " +
                                  value);
               break;
            default:
               System.out.println("You did not enter " +
                                  "a valid choice.");
         }
         keyboard.nextLine(); // Consume the new line

         System.out.println("Do you want to exit " +
                            "the program (Y/N)?: ");
         String answer = keyboard.nextLine();
         letter = answer.charAt(0);

      } while(letter != 'Y' && letter != 'y');
   }

   // TASK #1 Create the printMenu method here

    /**
     * print out instructions for the user with a menu of options for the user to
     * choose from
     * 
     * has no parameter list and does not return a value
     */
    public static void printMenu()
   {
       System.out.println("This is a geometry calculator");
       System.out.println("Choose what you would like to calculate");
       System.out.println("1. Find the area of a circle");
       System.out.println("2. Find the area of a rectangle");
       System.out.println("3. Find the area of a triangle");
       System.out.println("4. Find the circumference of a circle");
       System.out.println("5. Find the perimeter of a rectangle");
       System.out.println("6. Find the perimeter of a triangle");
       System.out.println("Enter the number of your choice:");
   }
   // TASK #2 Create the value-returning methods here
    /**
     * calculates circle area
     * 
     * takes in the radius of the circle and returns the area
     * @param r radius of the circle
     * @return area of the circle
     */
   public static double circleArea(double r)
   {
       double area = Math.PI * Math.pow(r, 2);
       return area; 
   }
   
   /**
    * calculates rectangle area
    * 
    * 
    * @param l length of rectangle
    * @param w width of the rectangle
    * @return area of the rectangle 
    */
   public static double rectangleArea(double l, double w)
   {
        double area = l * w;
        return area;
   }
   /**
    * calculates triangle area
    * 
    * takes in the base and height of the triangle and2 returns the area
    * 
    * @param b base of triangle
    * @param h height of triangle
    * @return area of triangle
    */
   
   public static double triangleArea(double b, double h)
   {
        double area = 0.5 * b * h; // b*h/2
        return area;
   }
   
   /**
    * calculates circle circumference
    * 
    * takes in the radius of the circle and returns the circumference
    * @param r radius of circle
    * @return circumference of circle 
    */
   public static double circleCircumference(double r)
   {
        double area = 2 * Math.PI * r;
        return area;
   }
   
   /**
    * calculates perimeter of rectangle
    * 
    * takes in the length and the width of the rectangle and returns the perimeter
    * 
    * @param l length of rectangle
    * @param w width of rectangle
    * @return perimeter of rectangle
    */
   public static double rectanglePerimeter(double l, double w)
   {
        double perimeter = 2 * l + 2 * w;
        return perimeter;
   }
   
   /**
    * calculates perimeter of triangle
    * 
    *  takes in the lengths of the three sides of the triangle and returns the perimeter of the triangle
    * @param length1 of side1 of triangle
    * @param length2 of side2 of triangle
    * @param length3 of side3 of triangle
    * @return perimeter of triangle
    */
   public static double trianglePerimeter(double length1, double length2, double length3)
   {
        double perimeter = length1 + length2 + length3;
        return perimeter;
   }
   
   // TASK #4 Write javadoc comments for each method
   
}