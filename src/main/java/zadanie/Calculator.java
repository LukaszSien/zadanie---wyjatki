package zadanie;

public class Calculator {


    public double divide(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException();
        }
        return a / b;
    }


}
