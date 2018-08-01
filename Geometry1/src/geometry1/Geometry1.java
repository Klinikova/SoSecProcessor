package geometry1;

import java.util.Scanner;

/**
   This program demonstrates static methods
*/

public class Geometry1
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
               // r = 2, Math.PI= 3.14, A = 3.14 * 2*2 ~ 12.56
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
               // length = 2, width = 4; A = 2 * 4 = 8
               
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
               // base = 2, height = 4; A = 0.5 * 2 * 4 = 4
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
               // radius = 4; A = 2 * 3.14 * 4 ~ 25.13
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
               // length = 2, width = 4; P = 2 * 2 + 2 * 4 = 12
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
               value = trianglePerimeter(side1,side2, side3);
               // length1 = 4, length2 = 4, length3 = 4; P = 4 + 4 + 4 = 12
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
    * print output and ask the user to choose some options
    * 
    * choose from 6 options
    * 
    * has no @param and @return value
    */
   
    public static void printMenu(){
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
    * calculates circleArea
    * takes in the radius of the circle and return the area
    * @param r radius of the circle
    * @return area of the circle
    */
    public static double circleArea(double r) 
   {
       double area = Math.PI * Math.pow(2, r);
       return area;
   }
    
    /**
     * calculates rectangleArea
     * takes in the length of the rectangle and the width of the rectangle and return the area
     * @param l length of the rectangle
     * @param w width of the rectangle
     * @return area 
     */
   public static double rectangleArea(double l, double w)
   {
        double area = l * w;
        return area;
   }
   
    /**
     * calculates triangleArea
     * takes in the base of the triangle and the height of the triangle and return the area
     * @param b base of the triangle
     * @param h height of the triangle
     * @return area
     */
   public static double triangleArea(double b, double h)
   {
       double area = 0.5 * b * h;
       return area;
   }
   
   /**
    * calculates circleCircumference
    * takes the radius of the circle and return to circumference
    * @param r radius of circle
    * @return Circumference of circle
    */
   public static double circleCircumference(double r)
   {
       double area = 2 * Math.PI * r;
       return area;
   }
   
   /**
    * calculates rectanglePerimeter
    * takes length and width and return to perimeter
    * @param l length of rectangle
    * @param w width of the rectangle
    * @return perimeter of the rectangle
    */
   public static double rectanglePerimeter(double l, double w)
   {
       double perimeter  = 2 * l + 2 * w;
       return perimeter;
   }
   
   /**
    * calculates trianglePerimeter
    * takes 3 sides or3 length of triangle and returns the perimeter of the triangle
    * @param l1 length 1 of triangle
    * @param l2 length 2 of triangle
    * @param l3 length 3 of triangle
    * @return perimeter of the triangle
    */
   public static double trianglePerimeter(double l1, double l2, double l3)
   {
       double perimeter = l1 + l2 + l3;
       return perimeter;
   }
   
   
   // TASK #4 Write javadoc comments for each method
}