public abstract class GameCharacter {
    private String name;
    private int maxHealth;
    private int health;
    private int baseAttack;
    private int baseDefence;
    private Weapon weaponSlot1;
    private Armor armorSlot1;
    private int attackPower;
    private Item[] inventory;

    public GameCharacter(){
        this.inventory = new Item[6];
        /*
        System.out.println("inventory at creation: "
                + this.inventory[0]
                + this.inventory[1]
                + this.inventory[2]
                + this.inventory[3]
                + this.inventory[4]
                + this.inventory[5]);*/
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getBaseAttack() {
        return baseAttack;
    }
    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public int getBaseDefence() {
        return baseDefence;
    }
    public void setBaseDefence(int baseDefence) {
        this.baseDefence = baseDefence;
    }

    public void setWeaponSlot1(Weapon weapon){
        this.weaponSlot1 = weapon;
        this.attackPower = baseAttack + weapon.getBaseWeaponAttack();
    }
    public Weapon getWeaponSlot1() {
        return weaponSlot1;
    }

    public Armor getArmorSlot1() {
        return armorSlot1;
    }
    public void setArmorSlot1(Armor armorSlot1) {
        this.armorSlot1 = armorSlot1;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setNewMaxHealth(int newMaxHealth){
        maxHealth = newMaxHealth;
    }

    // lägga till liv till vår GameCharacter
    public void addHealth(int healthPoints){
        if (health + healthPoints > maxHealth){
            health = maxHealth;
            System.out.println("set to max health");
        }
        else {
            health += healthPoints;
            System.out.println("added " + healthPoints + " hp to health");
        }
    }

    private void removeHealth(int healthPoints){
        if (health - healthPoints <= 0){
            health = 0;
            //System.out.println("reached 0 or less health and died");
        }
        else {
            health -= healthPoints;
        }
    }

    //Attack without defence in mind
    public void attack(GameCharacter victim){
        victim.removeHealth(this.attackPower);
    }

    //Attack with ability
    public void attack(GameCharacter victim, Weapon weapon){
        victim.removeHealth(weapon.useAbility());
    }


    public void isCritical(){
    }

    public Item[] getInventory() {
        return inventory;
    }

    public  void setInventory(Item item, int location, int amount){
        if (location <= this.inventory.length && location >= 1){
            this.inventory[location - 1] = item;
            try {
                this.inventory[location - 1].setNumberOfUses(amount);
            }catch (Exception e){
                System.out.println("Can't stack this item");
            }
        }
        else {
            System.out.println("Can't assign, out of bounds");
        }
    }


    public void addToInventory(Item item) {
        int count = 0;
        for (Item itemInInventory : this.inventory) {
            if (itemInInventory == null) {
                this.inventory[count] = item;
                this.inventory[count].addNumberOfUses();
                System.out.println(item.getName() + " added in slot " + (count + 1));
                break;
            }
            else if (itemInInventory.getName().equals(item.getName())) {
                //System.out.println("första namnet: " + itemInInventory.getName());
                //System.out.println("andra namnet: " + item.getName());
                itemInInventory.addNumberOfUses();
                //this.inventory[count].addNumberOfUses();
                System.out.println(
                    itemInInventory.getName() + ": " +
                    itemInInventory.getNumberOfUses() +
                    " uses left"
                );
                break;
            }
            count++;
        }
        if (count == this.inventory.length){
            boolean loopCheck = false;
            System.out.println("Your inventory is full");
            do {
                System.out.println("Which item would you like to discard to free up space?");
                printInventory();
                System.out.println("0: Cancel (discard " + item.getName() + ")");
                int selection = SelectionHandling.positiveInt();
                if (selection == 0){
                    loopCheck = false;
                }
                else if (selection >=1 && selection <= this.inventory.length) {
                    this.inventory[selection - 1] = item;
                    this.inventory[selection - 1].addNumberOfUses();
                    System.out.println("Added to slot " + selection);
                    loopCheck = false;
                }
                else {
                    System.out.println("Not a valid option");
                    loopCheck = true;
                }
            }while (loopCheck);
        }
    }

    public void printInventory(){
        int count = 1;
        System.out.println("\nYour inventory:\n");
        for (Item item : this.inventory){
            if (item == null){
                continue;
            }
            if (item instanceof Weapon){

            }
            if (item.getNumberOfUses() == -1){
                System.out.println(count + ". " + item.getName());
            }else {
                System.out.println(
                        count + ". " + item.getName() + ", " + item.getNumberOfUses() + " uses left"
                );
            }
            count++;
        }
    }
}
