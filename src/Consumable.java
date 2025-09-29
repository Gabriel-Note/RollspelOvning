public class Consumable extends Item{
    private int numberOfUses;
    protected int effectValue;

    public Consumable() {
        super();
    }

    @Override
    public int getNumberOfUses() {
        return numberOfUses;
    }

    public void setNumberOfUses(int numberOfUses) {
        this.numberOfUses = numberOfUses;
    }

    public void addNumberOfUses(int numberOfUses) {
        this.numberOfUses += numberOfUses;
    }

}
