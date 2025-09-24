public class Weapon extends Item{
    private int baseDamageValue;
    private double baseCriticalHitChance;

    public Weapon(String name) {
        super(name);
    }

    public int getBaseDamageValue() {
        return baseDamageValue;
    }

    public void setBaseDamageValue(int baseDamageValue) {
        this.baseDamageValue = baseDamageValue;
    }

    public double getBaseCriticalHitChance() {
        return baseCriticalHitChance;
    }

    public void setBaseCriticalHitChance(double baseCriticalHitChance) {
        this.baseCriticalHitChance = baseCriticalHitChance;
    }
}
