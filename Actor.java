public abstract class Actor {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    abstract String getName();

    public void setMakeOrder() {
    }

    public void setTakeOrder() {
    }
}