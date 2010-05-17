package external;

public interface Market {
    
    public int price(String stock);
    
    public void buy(String stock);
    
    public void sell(String stock);
    
}
