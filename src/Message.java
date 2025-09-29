public class Message {

    static void printClassSelection(){
        System.out.println("Choose a class: ");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Rogue");
    }

    static void printWelcomeToLevel(){

    }

    static void printCombatChoices(Player player){
        if (player.getPlayerClass().equals("Mage")){
            System.out.println(
                    "\u001B[34mmm\u001B[0m" +
                    "\n1. Attack" +
                    "\n2. Spells" +
                    "\n3. Items" +
                    "\n4. Flee"
            );
        }
        else {
            System.out.println(
                    "\n1. Attack" +
                    "\n\u001B[31m2. Spells\u001B[0m" +
                    "\n3. Items" +
                    "\n4. Flee"
            );
        }
    }

    static void printAreYouSure(){
        System.out.println(
                "Are you sure?" +
                "\n\n1. Yes!" +
                "\n2. No!"
        );
    }

    static void printInvalidInput (){
        System.out.println("\u001B[31m Ogiltigt val\u001B[0m");
        System.out.println("");
    }
}
