public class EnemyWithType extends GameCharacter{
    public enum EnemyType {
        ORC, ORCBOSS
    }
    private String description;
    private int specialAttack;

    public EnemyWithType(EnemyType enemyType) {
        createEnemy(enemyType);
    }

    public EnemyWithType() {
    }

    public void createEnemy(EnemyType enemyType){
        switch (enemyType){
            case ORC:
                orc();
                System.out.println("orc metod kallad");
                break;
            case ORCBOSS:
                orcBoss();
                System.out.println("orcBoss metod kallad");
                break;
        }
    }

    public void orc(){
        description = "En grön varelse som är väldigt aggressiv";
        this.setName("Orc");
        this.setMaxHealth(50);
        this.setBaseAttack(10);
        this.setBaseDefence(0);
        this.setWeaponSlot1(new Club("Club"));
    }
    public void orcBoss(){
        description = "En grön jätte som är ledaren över orcerna";
        this.setMaxHealth(200);
        this.setBaseAttack(20);
        this.setBaseDefence(0);
        this.setWeaponSlot1(new GreatClub("Smasher"));

    }


    public String getDescription() {
        return description;
    }

    public void getEnemyInfo(){
        System.out.println(
                "\nNamn: " + getName() +
                "\nMaxliv: " + getMaxHealth() +
                "\nStartvapen: " + getWeaponSlot1().getName()
        );
    }

    public void specialAttack(){

    }

}
