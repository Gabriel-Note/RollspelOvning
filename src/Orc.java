public class Orc extends Enemy{
    public Orc() {
        this.setName("Orc");
        this.setMaxHealth(50);
        this.setBaseAttack(10);
        this.setBaseDefence(0);
        this.setWeaponSlot1(new Club("Club"));
        this.setSpecialAttack(13, "WAAAGHH!!");
    }
}
