public class OrcBoss extends Enemy {
    public OrcBoss() {
        this.setName("OrcBoss Big´un");
        this.setMaxHealth(200);
        this.setBaseAttack(14);
        this.setBaseDefence(0);
        this.setWeaponSlot1(new GreatClub("Smasher"));
        this.setSpecialAttack(
                30,
                "Big Smash"
        );
    }
}
