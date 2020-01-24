package academy.lesson05;

public class FigureTests {
    public static void main(String[] args){
       testSquare();
       testCircle();
    }

    private static void testCircle() {
        Circle circle = new Circle(5);
        Circle circle2 = new Circle(7);
        System.out.println("Площадь круга = " + circle.area());
        double areaActual = circle.area();
        double areaExpected = Math.PI*5*5;
        System.out.println(areaActual==areaExpected);
        System.out.println("Результат сравнения круга: " + circle.equals(circle2));
    }

    private static void testSquare() {
        Square square = new Square(5);
        Square square2 = new Square(6, "Black");
        double areaActual = square.area();
        double areaExpected = 25;
        if(areaActual==areaExpected)
            System.out.println("Test passed");
        else
            System.out.println("Test error");
        square.draw();
        System.out.println(square);

        System.out.println("Результат сравнения квадрата: " + square.equals(square2));
    }

}
