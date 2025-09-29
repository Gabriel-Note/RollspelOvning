import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
        System.out.println("\u001B[30mmm\u001B[0m");
        System.out.println("\u001B[31mmm\u001B[0m");
        System.out.println("\u001B[32mmm\u001B[0m");
        System.out.println("\u001B[33mmm\u001B[0m");
        System.out.println("\u001B[34mmm\u001B[0m");
        System.out.println("\u001B[35mmm\u001B[0m");
        System.out.println("\u001B[36mmm\u001B[0m");
        System.out.println("\u001B[37mmm\u001B[0m");
        System.out.println("\u001B[38mmm\u001B[0m");*/

        HealthPotion hpPot = new HealthPotion(Size.SMALL);
        System.out.println("Welcome to GAME NAME");
        Player player1 = new Player();
        System.out.println("\nIt's time for your first opponent, an orc");
        EnemyWithType orc1 = new EnemyWithType(EnemyWithType.EnemyType.ORC);
        Orc orc2 = new Orc();
        OrcBoss boss = new OrcBoss();

        player1.setInventory(new HealthPotion(Size.SMALL),1);
        player1.addToInventory(new HealthPotion(Size.LARGE),1);
        FightScene fight1 = new FightScene(player1, orc2);
        FightScene fight2 = new FightScene(player1, boss);




        System.out.println("\nWhat will you do?");
        boolean loopCheck = true;
        while (loopCheck){
            System.out.println(
                    "\n1. Attack" +
                    "\n2. Flee"
            );
            int selection = SelectionHandling.positiveInt();
            switch (selection){
                case 1:
                    if (player1.getPlayerClass().equals("Mage") && player1.getWeaponSlot1().equals(new Staff("Staff of fire"))){
                        System.out.println("we have a staff of fire");
                        System.out.println(
                                "\n1. Fireball" +
                                "\n2. Attack"
                        );
                        selection = SelectionHandling.positiveInt();
                        switch (selection){
                            case 1:
                                // using ability
                                player1.attack(orc1, player1.getWeaponSlot1());
                                break;
                            case 2:
                                break;
                            default:
                        }
                    }
                    player1.attack(orc1);
//                    orc1.removeHealth(player1.attackCalculation());
                    if (orc1.getHealth() <= 0){
                        System.out.println(orc1.getName() + " died");
                        loopCheck = false;
                        continue;
                    }
                    System.out.println(orc1.getName() + "'s health: " + orc1.getHealth() + "hp");
                    break;
                case 2:
                    System.out.println("You will be remembered as a coward");
                    System.exit(0);
                default:
                    System.out.println("Don't just stand there, DO SOMETHING!!");
            }

            System.out.println(orc1.getName() + "'s turn");
            orc1.attack(player1);
//            player1.removeHealth(orc1.attackCalculation());
            if (player1.getHealth() <= 0){
                System.out.println("You were defeated by " + orc1.getName() + ", your adventure ends here.");
                System.out.println("A forgotten hero");
                System.exit(0);
            }
            System.out.println("Your health: " + player1.getHealth() + "hp");
        }

        System.out.println("You defeated the " + orc1.getName() + ", congratulations!");
        System.out.println("after looting the corpse you find an armor and a health potion");


        /*System.out.println(player1.getName());
        System.out.println(player1.getPlayerClass());
        System.out.println(player1.getMaxHealth());
        player1.removeHealth(30);
        System.out.println(player1.getHealth());
        System.out.println(player1.getBaseAttack());
        System.out.println(player1.getBaseDefence());
        System.out.println("");*/


    }
}