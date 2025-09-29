public class Sword extends Weapon {
    public Sword(String name) {
        super(name);
        this.setBaseCriticalHitChance(15);
        this.setBaseWeaponAttack(10);
    }
}
