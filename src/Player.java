import java.util.Scanner;

public class Player extends GameCharacter {
    private String playerClass;
    Scanner scan = new Scanner(System.in);

    public Player(){
        super();
        System.out.println("choose your name");
        String name = scan.next();
        this.setName(name);
        this.setClassAndAttributes();
    }

    public void testMethod(){
        System.out.println("Class extended");
    }

    public String getPlayerClass() {
        return playerClass;
    }
    // requires selectionhandling to re-choose chosenClass argument
    public void setClassAndAttributes(){
        Message.printClassSelection();
        while (true){
            int chosenClass = SelectionHandling.positiveInt();
            switch (chosenClass){
                case 1:
                    playerClass = "Warrior";
                    this.setMaxHealth(100);
                    this.setBaseAttack(10);
                    this.setBaseDefence(15);
                    this.setWeaponSlot1(new Sword("Stinger"));
                    return;
                case 2:
                    playerClass = "Mage";
                    this.setMaxHealth(50);
                    this.setBaseAttack(15);
                    this.setBaseDefence(6);
                    this.setWeaponSlot1(new Staff("Staff of fire"));
                    return;
                case 3:
                    playerClass = "Rogue";
                    this.setMaxHealth(70);
                    this.setBaseAttack(11);
                    this.setBaseDefence(8);
                    this.setWeaponSlot1(new Dagger("Needle"));
                    return;
                default:
                    System.out.println("selection doesn't exist");
            }

        }
    }

    public void getPlayerInfo(){
        System.out.println(
                "\nNamn: " + getName() +
                "\nKlass: " + getPlayerClass() +
                "\nMaxliv: " + getMaxHealth() +
                "\nStartvapen: " + getWeaponSlot1().getName()
        );
    }
}
