import java.util.Locale;

public class Player extends GameCharacter {
    String playerClass;

    public Player(String name, int selectedClass){
        super();
        this.setName(name);

    }

    public void testMethod(){
        System.out.println("Class extended");
    }

    public void setClassAttributes(int selectedClass){
        switch (selectedClass){
            case 1:
                playerClass = "Warrior";
                this.setMaxHealth(100);
                this.setBaseAttack(10);
                this.setBaseDefence(15);
                break;
            case 2:
                playerClass = "Mage";
                this.setMaxHealth(50);
                this.setBaseAttack(15);
                this.setBaseDefence(6);
                break;
            case 3:
                playerClass = "Rogue";
                this.setMaxHealth(70);
                this.setBaseAttack(11);
                this.setBaseDefence(8);
                break;
        }
    }
}
