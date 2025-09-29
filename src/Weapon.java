public abstract class Weapon extends Item{
    private int baseWeaponAttack;
    private double baseCriticalHitChance;
    private int abilityPower;

    public Weapon(String name) {
        super(name);
    }

    public int getBaseWeaponAttack() {
        return baseWeaponAttack;
    }

    public void setBaseWeaponAttack(int baseWeaponAttack) {
        this.baseWeaponAttack = baseWeaponAttack;
    }

    public double getBaseCriticalHitChance() {
        return baseCriticalHitChance;
    }

    public void setBaseCriticalHitChance(double baseCriticalHitChance) {
        this.baseCriticalHitChance = baseCriticalHitChance;
    }

    public int useAbility(){
        return -1;
    }
}
