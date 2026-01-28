package Work1;

public class Main {
    public static void main(String[] args) {
        Calculator MyCalculator = new Calculator(100.50f);
        Shop MyShop = new Calculator("Orange", 150.0f);

        MyCalculator.calc(50.25f);
        MyCalculator.calc(150.0f);

        MyCalculator.calc(-10.0f);
    }
}