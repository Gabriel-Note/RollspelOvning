public class Staff extends Weapon{
    public Staff(String name) {
        super(name);
        this.setBaseCriticalHitChance(0);
        this.setBaseWeaponAttack(2);
    }

    @Override
    // Fireball
    public int useAbility(){
        System.out.println("fireball");
        return 30;
    }
}
