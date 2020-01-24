package academy.lesson05;

public class PolymorphismDemo {
    public static void main(String[] args){
        Figure[] figures = new Figure[2];
        figures[0] = new Circle(10,"black");
        figures[1] = new Square(10,"black");

        for(int i=0; i<figures.length; i++){
            figures[i].draw();
            System.out.println(figures[i]);
        }
    }
}
