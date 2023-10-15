
import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Human humans);
    void releaseFromMarket (Human humans);
    void update();
}