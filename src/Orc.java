public class Orc extends GameCharacter{
    public Orc() {
        this.setName("Orc");
        this.setMaxHealth(50);
        this.setBaseAttack(10);
        this.setBaseDefence(0);
        this.setWeaponSlot1(new Club("Club"));
    }
}
