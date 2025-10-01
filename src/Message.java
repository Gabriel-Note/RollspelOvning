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
        System.out.println(
                    "\n1. Attack" +
                    "\n2. Ability" +
                    "\n3. Items" +
                    "\n4. Hero information" +
                    "\n5. Flee"
            );
    }

    static void printAreYouSure(){
        System.out.println(
                "Are you sure?" +
                "\n\n1. Yes!" +
                "\n2. No!"
        );
    }

    static void printInvalidInput (){
        System.out.println("\u001B[31mInvalid input\u001B[0m");
        System.out.println("");
    }



    static void printInventoryFull(){
        System.out.println("Your inventory is full");
    }
}
