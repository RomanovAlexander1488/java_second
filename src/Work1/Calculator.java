package Work1;

public class Calculator extends Shop{
    private float finalPrice = 0;

    public Calculator(float price) {
        super(price);
    }
    public Calculator(String product, float price) {
        super(product, price);
    }

    private boolean SeePrice(float price){
        return price >= 0;
    }

    public void calc(float price){
        if (SeePrice(price)) {
            this.finalPrice += price;
            System.out.println(finalPrice);
        }
    }
}
