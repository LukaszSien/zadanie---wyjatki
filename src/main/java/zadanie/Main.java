package zadanie;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            calculator.divide(5,0);
        } catch (DivideByZeroException e) {
            e.printStackTrace();
            System.out.println("Nie mozna dzielic przez 0");
        }
    }
}
