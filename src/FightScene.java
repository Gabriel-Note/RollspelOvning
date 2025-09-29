public class FightScene extends Scenario{

    public FightScene(Player player, GameCharacter enemy) {
        boolean loopCheck = true;
        while (loopCheck) {
            Message.printCombatChoices(player);
            int selection = SelectionHandling.positiveInt();
            switch (selection) {
                case 1:
                    player.attack(enemy);
                    break;
                case 2:
                    System.out.println("Choose spells to attack with (not implemented)");
                    break;
                case 3:
                    System.out.println("shows items that can be used (not implemented)");
                    break;
                case 4:
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
            }
            enemy.attack(player);
        }
    }
}
