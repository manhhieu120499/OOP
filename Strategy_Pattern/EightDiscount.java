package Strategy_Pattern;

public class EightDiscount implements IPromotesStrategy{
    @Override
    public double DoDiscount(double price) {
        return price * 0.2;
    }
}
