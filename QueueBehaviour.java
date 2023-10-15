import java.util.List;

public interface QueueBehaviour {
    void takeQueue(Human humans);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue(Human humans);
}
