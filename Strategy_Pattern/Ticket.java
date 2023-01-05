package Strategy_Pattern;

public class Ticket {
    private IPromotesStrategy _promotesStrategy;
    private double _price;
    private String _name;

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        this._price = price;
    }

    public IPromotesStrategy getPromotesStrategy() {
        return _promotesStrategy;
    }

    public void setPromotesStrategy(IPromotesStrategy promotesStrategy) {
        this._promotesStrategy = promotesStrategy;
    }

    public Ticket() {

    }

    public Ticket(IPromotesStrategy promoteStrategy) {
           _promotesStrategy = promoteStrategy;
    }

    public double GetPromotedPrice() {
        return _promotesStrategy.DoDiscount(_price);
    }

}
