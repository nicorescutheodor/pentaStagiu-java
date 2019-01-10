package Problema1_GeometricForms;

import java.util.Scanner;

    /*
    Create an application that knows how to calculate the perimeter and area for common shapes
    (circle, square, rectangle, triangle)
    To test it: create few objects of each type and print to the console informations
     about the object that has the biggest area
     */

public class GoemetricForm {
    private int circleRadius;
    private float circleArea;
    private float circlePerimeter;

    private int squareLength;
    private int squareArea;
    private int squarePerimeter;

    private int rectangleLength;
    private int rectangleWidth;
    private int rectangleArea;
    private int rectanglePerimeter;

    private int triangleBase;
    private int triangleHeight;
    private float triangleHypotenuse;
    private float triangleArea;
    private float trianglePerimeter;

    public static void main(String[] args) {

////////// CIRCLE perimeter and area //////////
        GoemetricForm circle = new GoemetricForm();
        System.out.print("\n" + "Insert the radius of the circle: ");
        Scanner scan = new Scanner(System.in);
        circle.circleRadius = scan.nextInt();
        circle.circleArea = (float) (Math.PI * circle.circleRadius * circle.circleRadius);
        circle.circlePerimeter = (float) (2 * Math.PI * circle.circleRadius);

        System.out.println("Circle perimeter is P = " + circle.circlePerimeter);
        System.out.println("Circle area is A = " + circle.circleArea);

//////// SQUARE perimeter and area //////////
        GoemetricForm square = new GoemetricForm();
        System.out.print("\n" + "Insert the length of the square: ");
        square.squareLength = scan.nextInt();
        square.squarePerimeter = 4 * square.squareLength ;
        square.squareArea = square.squareLength * square.squareLength;
        System.out.println("Square perimeter is P = " + square.squarePerimeter);
        System.out.println("Square area is A = " + square.squareArea);

//////// RECTANGLE perimeter and area //////////
        GoemetricForm rectangle = new GoemetricForm();
        System.out.print("\n" + "Insert the length of the rectangle: ");
        rectangle.rectangleLength = scan.nextInt();
        System.out.print("\n" + "Insert the width of the rectangle: ");
        rectangle.rectangleWidth = scan.nextInt();
        rectangle.rectangleArea = rectangle.rectangleLength * rectangle.rectangleWidth;
        rectangle.rectanglePerimeter = 2 * (rectangle.rectangleLength + rectangle.rectangleWidth) ;
        System.out.println("Rectangle perimeter is P = " + rectangle.rectanglePerimeter);
        System.out.println("Rectangle area is A = " + rectangle.rectangleArea);

//////// TRIANGLE perimeter and area //////////
        GoemetricForm triangle = new GoemetricForm();
        System.out.print("\n" + "Insert the base of the triangle: ");
        triangle.triangleBase = scan.nextInt();
        System.out.print("Insert the height of the triangle: ");
        triangle.triangleHeight = scan.nextInt();
        triangle.triangleHypotenuse = (float) Math.pow(Math.pow(triangle.triangleBase, 2) + Math.pow(triangle.triangleHeight, 2),0.5);
        triangle.triangleArea = (float)(triangle.triangleBase * triangle.triangleHeight)/2;
        triangle.trianglePerimeter = triangle.triangleBase + triangle.triangleHeight + triangle.triangleHypotenuse;
        System.out.println("Triangle perimeter is P = " + triangle.trianglePerimeter);
        System.out.println("Triangle area is A = " + triangle.triangleArea);

//////// DETERMINATE the biggest geometric form area //////////
        if(circle.circleArea > square.squareArea && circle.circleArea > rectangle.rectangleArea &&
                circle.circleArea > triangle.triangleArea) {
            System.out.println("\nThe CIRCLE has the largest area: A = " + circle.circleArea);
        }
        else if(square.squareArea > circle.circleArea && square.squareArea > rectangle.rectangleArea &&
                square.squareArea > triangle.triangleArea) {
            System.out.println("\nThe SQUARE has the largest area: A = " + square.squareArea);
        }
        else if(rectangle.rectangleArea > circle.circleArea && rectangle.rectangleArea > square.squareArea &&
                rectangle.rectangleArea > triangle.triangleArea) {
            System.out.println("\nThe RECTANGLE has the largest area: A = " + rectangle.rectangleArea);
        }
        else if (triangle.triangleArea > circle.circleArea && triangle.triangleArea > square.squareArea &&
                triangle.triangleArea > rectangle.rectangleArea) {
            System.out.println("\nThe TRIANGLE has the largest area: A = " + triangle.triangleArea);
        }
    }
}
