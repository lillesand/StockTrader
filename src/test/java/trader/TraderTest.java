package trader;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;

import external.Market;

public class TraderTest {
    
    @Test
    public void shouldBuyMFSTIfPriceLessThan120() {
//        final MutableBoolean bought = new MutableBoolean(false);
//        Market market = new Market() {
//            
//            public void sell(String stock) { }
//            
//            public int price(String stock) {
//                return 119;
//            }
//            
//            public void buy(String stock) {
//                bought.set(true);
//            }
//        };
//        
//        Trader trader = new Trader(market);
//        
//        trader.makeTransaction();
//        assertTrue(bought.get());
        Market market = Mockito.mock(Market.class);
        Trader trader = new Trader(market);
        
        doReturn(119).when(market).price("MSFT");
        
        trader.makeTransaction();
        
        verify(market, times(1)).buy("MSFT");
    }
    
    @Test
    public void shouldSellMFSTIfPriceGreaterThan140() {
        fail("implement me!");
    }
    
    class MutableBoolean {
        
        private boolean value;

        public MutableBoolean(boolean value) {
            this.value = value;
        }
        
        public boolean get() {
            return value;
        }
        
        public void set(boolean value) {
            this.value = value;
        }
        
    }
    
}
