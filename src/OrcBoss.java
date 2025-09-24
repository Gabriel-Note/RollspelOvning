public class OrcBoss extends Enemy{
    public OrcBoss() {

        this.setMaxHealth(200);
        this.setBaseAttack(20);
        this.setBaseDefence(0);
        this.setWeaponSlot1(new GreatClub("Smasher"));
    }
}
