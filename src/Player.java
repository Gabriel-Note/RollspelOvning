public class Player extends Class{
    String name;

    public Player(String playerClass, int maxHealth, int health, int baseAttack, int baseDefence){
        super(playerClass, maxHealth, health, baseAttack, baseDefence);
    }

    public void testMethod(){
        System.out.println("Class extended");
    }
}
