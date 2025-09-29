public class Club extends Weapon{
    public Club(String name) {
        super(name);
        this.setBaseCriticalHitChance(0);
        this.setBaseWeaponAttack(6);
    }
}
