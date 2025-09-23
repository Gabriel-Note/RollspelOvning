public class Class extends GameCharacter{
    private String playerClass;



    public Class(String playerClass, int maxHealth, int health, int baseAttack, int baseDefence){
        super(maxHealth, health, baseAttack, baseDefence);
        this.playerClass = playerClass;
        System.out.println("Class is made");
    }

    public void testMethodClass(){
        System.out.println("GameCharacter extended");
        System.out.println(playerClass);
    }
}
