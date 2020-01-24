package academy.lesson08.exception;

public class AppMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            System.out.println(calc.div(6,1));
            System.out.println(calc.div(6,0));
            System.out.println(calc.div(6.3,3.4));
        } catch (DivisionByZero e) {
            System.out.println("Ошибка: нельзя делить на ноль");
            System.out.println("Подробности: " + e.getMessage());
            //e.printStackTrace();
        }
         System.out.println("FINISH");

    }
}
