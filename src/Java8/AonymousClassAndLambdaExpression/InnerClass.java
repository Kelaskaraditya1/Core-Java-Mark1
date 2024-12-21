package Java8.AonymousClassAndLambdaExpression;

import Java8.AonymousClassAndLambdaExpression.Polygon;

import java.util.Scanner;

public class InnerClass{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the sides of the Polygon");
        int sides=s.nextInt();
        Polygon polygon = new Polygon(sides);
        polygon.getSides();
        System.out.println("Enter the base and height of the Triangle");
        int base = s.nextInt();
        int height = s.nextInt();
        Polygon.Triangle triangle = polygon.new Triangle(height,base);
        System.out.println("The Area of the Triangle is:"+triangle.getArea(triangle));
        System.out.println("The Perimeter of the Triangle is:"+triangle.getPerimeter(triangle));
        System.out.println("Enter the length of the Equilateral Triangle");
        int length=s.nextInt();
        Polygon.EquilateralTriangle equilateralTriangle = new Polygon.EquilateralTriangle(length);
        System.out.println("The Area of the Equilateral Triangle is:"+equilateralTriangle.getArea(equilateralTriangle));
        System.out.println("The Perimeter of the Equilateral Triangle is:"+equilateralTriangle.getPerimeter(equilateralTriangle));
    }
}
