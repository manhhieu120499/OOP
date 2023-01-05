package Strategy_Pattern;

public class NoDiscountStrategy implements IPromotesStrategy{
    @Override
    public double DoDiscount(double price) {
        return price;
    }
}
