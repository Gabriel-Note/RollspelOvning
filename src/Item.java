public class Item {
    private double weight;
    private double sellValue;
    private String name;

    public Item(){
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSellValue() {
        return sellValue;
    }

    public void setSellValue(double sellValue) {
        this.sellValue = sellValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getNumberOfUses(){
        return -1;
    }
    public void addNumberOfUses(){
    }
    public void setNumberOfUses(int numberOfUses) {
    }
}
