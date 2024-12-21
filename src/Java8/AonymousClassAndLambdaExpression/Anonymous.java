package Java8.AonymousClassAndLambdaExpression;

import java.util.Scanner;

public class Anonymous {
    public double area(int length,int breadth){
        return length*breadth;
    }
    public int perimeter(int length,int bredth){
        return (length+bredth);
    }
}

class Test{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Anonymous anonymous = new Anonymous(){
            public double area(int base,int height){
                return 0.5*base*height;
            }
            public int perimeter(int base,int height){
                return 2*(base+height);
            }
        };
        System.out.println("Enter the base of the Triangle");
        int base = s.nextInt();
        System.out.println("Enter the height of the Triangle");
        int height = s.nextInt();
        System.out.println("The Area of the Triangle is:"+anonymous.area(base,height));
        System.out.println("The Perimeter of the Triangle is:"+anonymous.perimeter(base,height));
    }
}
