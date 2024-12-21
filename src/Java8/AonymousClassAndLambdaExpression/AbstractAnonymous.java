package Java8.AonymousClassAndLambdaExpression;

import java.util.Scanner;

public abstract class AbstractAnonymous {
    public abstract double area(int base,int height);
    public abstract int perimeter(int base,int height);
}

class AnonymousClass{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AbstractAnonymous abstractAnonymous = new AbstractAnonymous() {
            @Override
           public double area(int base, int height) {
                return 0.5*(base*height);
            }

            @Override
           public  int perimeter(int base, int height) {
                return 2*(height+base);
            }
        };
        AnonymousInterface anonymousInterface = new AnonymousInterface() {
            @Override
            public double area(int base, int height) {
                return 0.5*(base*height);
            }

            @Override
            public int perimeter(int base, int height) {
                return 2*(height+base);
            }
        };
        System.out.println("Enter the base of the Triangle");
        int base = s.nextInt();
        System.out.println("Enter the height of the Triangle");
        int height=s.nextInt();
        System.out.println("The Area of the Triangle is:"+anonymousInterface.area(base,height));
        System.out.println("The Perimeter of the Triangle is:"+anonymousInterface.perimeter(base,height));
    }
}
