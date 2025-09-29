public class HealthPotion extends Consumable{
    public HealthPotion(Size size) {
        super();
        System.out.println(size.getDescription());
        this.setName(size.getDescription() + " Health potion");
        System.out.println(this.getName());
        switch (size.getStrength()){
            case 1:
                this.effectValue = 10;
                break;
            case 2:
                this.effectValue = 30;
                break;
            case 3:
                this.effectValue = 50;
                break;
            case 4:
                this.effectValue = 70;
                break;
        }
    }

}
