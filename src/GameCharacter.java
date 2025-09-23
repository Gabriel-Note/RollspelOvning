public class GameCharacter {
    private int maxHealth;
    private int health;
    private int baseAttack;
    private int baseDefence;

    public GameCharacter(int maxHealth, int health, int baseAttack, int baseDefence){
        this.maxHealth = maxHealth;
        this.health = health;
        this.baseAttack = baseAttack;
        this.baseDefence = baseDefence;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public int getBaseDefence() {
        return baseDefence;
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
            System.out.println(" reached 0 or less health and died");
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
    public int attackCalculation(int weaponAttack){
        return baseAttack + weaponAttack;
    }
}
