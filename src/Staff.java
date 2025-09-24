public class Staff extends Weapon{
    public Staff(String name) {
        super(name);
        this.setBaseCriticalHitChance(1);
        this.setBaseDamageValue(2);
    }

    public int fireball(){
        return this.getBaseDamageValue() + 30;
    }
}
