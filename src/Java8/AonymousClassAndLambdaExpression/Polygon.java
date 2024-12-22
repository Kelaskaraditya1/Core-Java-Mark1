package Java8.AonymousClassAndLambdaExpression;

public class Polygon {
    public int sides;
    public Polygon(int sides){
        this.sides=sides;
    }

    public void getSides(){
        System.out.println("There are "+this.sides+" no of sides of Polygon");
    }

    public class Triangle{
        public int height,base;

        public Triangle(int height,int base){
            this.base=base;
            this.height=height;

        }
        public double getArea(Triangle triangle){
            return (0.5*triangle.base*triangle.base);
        }

        public int getPerimeter(Triangle triangle){
            return 2*triangle.base+triangle.height;
        }
    }

    public static class EquilateralTriangle{
        int length;

        public EquilateralTriangle(int length){
            this.length=length;
        }

        public double getArea(EquilateralTriangle triangle){
            return (1.732*Math.pow(triangle.length,2.0));
        }

        public int getPerimeter(EquilateralTriangle triangle){
            return (3*length);
        }
    }
}
