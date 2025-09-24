import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to GAME NAME");
        Player player1 = new Player();
        player1.getPlayerInfo();
        System.out.println("\nIt's time for your first opponent, an orc");
        Enemy orc1 = new Enemy(Enemy.EnemyType.ORC);
        Orc orc2 = new Orc();
//        boolean loopCheck = true;
        while (true){
            System.out.println("What will you do?");
            System.out.println(
                    "\n1. Attack" +
                    "\n2. Flee"
            );
            int selection = SelectionHandling.positiveInt();
            if (selection == 1) {
                orc1.removeHealth(player1.attackCalculation(player1.getWeaponSlot1()));
                if (orc1.getHealth() <= 0){
                    System.out.println(orc1.getName() + " died");
//                    loopCheck = false;
                    break;
                }
                System.out.println(orc1.getName() + "'s health: " + orc1.getHealth() + "hp");
            } else if (selection == 2) {
                System.out.println("You will be remembered as a coward");
                System.exit(0);
            } else {
                System.out.println("Don't just stand there, DO SOMETHING!!");
            }
            System.out.println(orc1.getName() + "'s turn");
            player1.removeHealth(orc1.attackCalculation(orc1.getWeaponSlot1()));
            System.out.println("Your health: " + player1.getHealth() + "hp");
        }
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