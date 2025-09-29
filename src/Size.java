public enum Size {
    SMALL(1,"Small") ,
    MEDIUM(2,"Medium"),
    LARGE(3,"Large"),
    HUGE(4,"Huge");

    private final int strength;
    private final String description;

    Size(int strength, String description){
        this.strength = strength;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getStrength() {
        return strength;
    }
}
