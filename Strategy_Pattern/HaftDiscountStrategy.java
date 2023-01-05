package Strategy_Pattern;

public class HaftDiscountStrategy implements IPromotesStrategy{

    @Override
    public double DoDiscount(double price) {
        return price * 0.5;
    }
}
