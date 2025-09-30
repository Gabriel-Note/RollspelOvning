public abstract class Weapon extends Item{
    private int baseWeaponAttack;
    private double baseCriticalHitChance;
    protected String abilityName;
    protected String weaponType;


    public Weapon(String name) {
        super();
        this.setName(name);
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
    public String getAbilityName() {
        return abilityName;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }
}
