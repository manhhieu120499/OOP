package Strategy_Pattern;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        System.out.println("Start getting ticket");

        var random = new Random();
        for(int i = 0 ; i < 5 ; i++)
        {
            var StrategyIndex = random.nextInt(3);
            var ticKet = new Ticket();
            ticKet.setName("Ticket " + i);
            ticKet.setPrice(50 * i);
            switch (StrategyIndex)
            {
                case 0:
                    ticKet.setPromotesStrategy(new NoDiscountStrategy());
                    break;
                case 1:
                    ticKet.setPromotesStrategy(new QuaterDiscountStrategy());
                    break;
                case 2:
                    ticKet.setPromotesStrategy(new HaftDiscountStrategy());
                    break;
            }
            var promotedPrice = ticKet.GetPromotedPrice();
            System.out.println("Promoted price of " + ticKet.getName() + " is " + ticKet.GetPromotedPrice() + " " + ticKet.getPromotesStrategy());
        }
    }
}
