public class Staff extends Weapon{
    public Staff(String name) {
        super(name);
        this.setBaseCriticalHitChance(0);
        this.setBaseWeaponAttack(2);
        setAbilityName();
    }

    @Override
    // Fireball
    public int useAbility(){
        return 30;
    }
    public void setAbilityName(){
        this.abilityName = "Fireball";
    }
}
