public class Enemy extends GameCharacter{
    private String description;
    private int specialAttack;
    private String specialAttackShout;

    public Enemy() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(int specialAttack, String specialAttackShout) {
        this.specialAttack = specialAttack;
        this.specialAttackShout = specialAttackShout;
    }

    public String getSpecialAttackShout() {
        return specialAttackShout;
    }

    public void setSpecialAttackShout(String specialAttackShout) {
        this.specialAttackShout = specialAttackShout;
    }
}
