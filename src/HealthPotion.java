import java.util.Objects;

public class HealthPotion extends Consumable{
    public HealthPotion(Size size) {
        super();
        //System.out.println(size.getDescription());
        this.setName(size.getDescription() + " Health potion");
        //System.out.println(this.getName());
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
    @Override
    public void useItem(GameCharacter player){
        if (this.getNumberOfUses() <= 0){
            System.out.println("No uses left");
        }
        else {
            player.addHealth(effectValue);
            removeNumberOfUses();
        }

    }

}
