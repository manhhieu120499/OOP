package Strategy_Pattern;

public class QuaterDiscountStrategy implements IPromotesStrategy{
    @Override
    public double DoDiscount(double price) {
        return price * 0.75;
    }
}
