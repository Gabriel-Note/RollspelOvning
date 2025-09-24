public class Club extends Weapon{
    public Club(String name) {
        super(name);
        this.setBaseCriticalHitChance(1);
        this.setBaseDamageValue(6);
    }
}
