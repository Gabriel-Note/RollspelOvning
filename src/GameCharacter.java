public abstract class GameCharacter {
    private String name;
    private int maxHealth;
    private int health;
    private int baseAttack;
    private int baseDefence;
    private Weapon weaponSlot1;



    public GameCharacter(){}

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
    // Ta bort liv från vår GameCharacter
    public void removeHealth(int healthPoints){
        if (health - healthPoints <= 0){
            health = 0;
            System.out.println("reached 0 or less health and died");
        }
        else {
            health -= healthPoints;
        }
    }
    // ändra maxlivet
    public void setNewMaxHealth(int newMaxHealth){
        maxHealth = newMaxHealth;
    }

    // attacks with defence in mind
    public int attackCalculationWithDefence(int weaponAttack, int defenceValue){
        int damage = baseAttack + weaponAttack - defenceValue;
        if (damage < 0){
            damage = 0;
        }
        return damage;
    }
    // attack without defence in mind
    public int attackCalculation(Weapon weapon){
        return baseAttack + weapon.getBaseDamageValue();
    }

    public void setWeaponSlot1(Weapon weapon){
        this.weaponSlot1 = weapon;
    }

    public Weapon getWeaponSlot1() {
        return weaponSlot1;
    }
}
