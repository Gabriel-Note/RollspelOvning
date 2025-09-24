public class Sword extends Weapon{
    public Sword(String name) {
        super(name);
        this.setBaseCriticalHitChance(1.15);
        this.setBaseDamageValue(10);
    }
}
