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
    @Override
    public void addNumberOfUses(){
        this.numberOfUses++;
    }
    @Override
    public void setNumberOfUses(int numberOfUses) {
        this.numberOfUses = numberOfUses;
    }

}
