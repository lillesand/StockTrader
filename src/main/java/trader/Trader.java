package trader;

import external.Market;

public class Trader {
 
    private final Market targetMarket;

    public Trader(Market market) {
        this.targetMarket = market;
    }

    public void makeTransaction() {
        if (targetMarket.price("MSFT") < 120) {
            targetMarket.buy("MSFT");
        }
    }
    
}