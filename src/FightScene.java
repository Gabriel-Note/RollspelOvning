public class FightScene extends Scenario{

    public FightScene(Player player, GameCharacter enemy) {
        boolean loopCheck = true;
        while (loopCheck) {
            // Player turn
            Message.printCombatChoices(player);
            int selection = SelectionHandling.positiveInt();
            switch (selection) {
                case 1:
                    player.attack(enemy);
                    System.out.println(enemy.getName() + " Got hit for " + player.getAttackPower());
                    break;
                case 2:
                    if (player.getWeaponSlot1().useAbility() == -1){
                        System.out.println("Your weapon doesn't seem to have an ability");
                        continue;
                    }else {
                        player.attack(enemy, player.getWeaponSlot1());
                        System.out.println("You used " + player.getWeaponSlot1().getAbilityName());
                        System.out.println(enemy.getName() + " got hit for " + player.getWeaponSlot1().useAbility());
                    }
                    break;
                case 3:
                    System.out.println("shows items that can be used (not implemented)");
                    Message.printInventory(player);
                    continue;
                case 4:
                    player.getPlayerInfo();
                    continue;
                case 5:
                    Message.printAreYouSure();
                    selection = SelectionHandling.positiveInt();
                    if (selection == 1){
                        System.out.println("You are a coward!");
                        System.exit(0);
                    }else {
                        System.out.println("Keep fighting!");
                        continue;
                    }
                    break;
                default:
                    Message.printInvalidInput();
                    continue;
            }
            if (enemy.getHealth() <= 0){
                loopCheck = false;
                System.out.println(enemy.getName() + " has been defeated");
                continue;
            }else {
                System.out.println(enemy.getName() + " got " + enemy.getHealth() + " hp remaining");
            }

            // Enemy turn
            enemy.attack(player);
            if (player.getHealth() <= 0){
                loopCheck = false;
                System.out.println("You were defeated by " + enemy.getName());
                System.out.println("Sadly your journey end here");
                System.exit(0);
            }else {
                System.out.println("You got hit for " + enemy.getAttackPower());
                System.out.println("You have " + player.getHealth() + " hp remaining");
            }
        }
    }
}
