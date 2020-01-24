package academy.lesson08.exception;

public class Calculator {
    public double div(double x1, double x2){
        return x1/x2;
    }

    public int div(int x1, int x2) throws DivisionByZero{
        if (x2!=0)
        return x1/x2;
        else
            throw  new DivisionByZero("Попытка поделить "+x1+" на "+x2);
    }
}
