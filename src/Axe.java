public class Axe extends Weapon{
    public Axe(String name) {
        super(name);
        this.setBaseCriticalHitChance(30);
        this.setBaseWeaponAttack(12);
        this.setWeaponType("Axe");
    }
}
