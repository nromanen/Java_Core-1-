
public class Animal {
    private String name;
    private String family;
    private boolean meet;
    private AnimalType type;

    public Animal() {
        this.name = "NONE";
        this.family = "NONE";
        this.meet = false;
        this.type = AnimalType.NONE;
    }

    public enum AnimalType{
        NONE, BIRDS, FISH, MAMMALS
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public boolean isMeet() {
        return meet;
    }

    public void setMeet(boolean meet) {
        this.meet = meet;
    }

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public void setType(int type){

        switch (type){
            case 0 : this.type = AnimalType.NONE; break;
            case 1 : this.type = AnimalType.BIRDS; break;
            case 2 : this.type = AnimalType.FISH; break;
            case 3 : this.type = AnimalType.MAMMALS; break;
            default:
                System.out.println("Something goes wrong...");
                break;
        }
    }

    public void setType(String type) {
        this.type = AnimalType.valueOf(type.toUpperCase());
        System.out.println(this.type.ordinal());
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", family=" + family + ", meet=" + meet + ", type=" + type + "]";
    }

    public static void main(String[] args){
        Animal animal = new Animal();
        animal.setName("Lion");
        animal.setType(2);

        System.out.println(animal);
    }
}
