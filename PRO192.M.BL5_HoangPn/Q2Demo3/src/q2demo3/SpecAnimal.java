package q2demo3;

public class SpecAnimal extends Animal {

    private String sound;

    public SpecAnimal() {
        super();
    }

    public SpecAnimal(String name, int price, String sound) {
        super(name, price);
        this.sound = sound;
    }

    @Override
    public String toString() {
        
        return "SpecAnimal(" + getName() + "-" + getPrice() + ":" + sound + ")";
    }

    public void setData() {
        String currentName = getName();

        if (currentName != null || currentName.length() < 2) { // phải có không bị nullpointexception
            String nameNew = currentName.substring(2);
            setName(nameNew);
        } else {
            setName("");
        }
    }

    public String getValue() {
        if (getPrice() > 10 && getPrice() % 2 == 0) {
            // trả về 4 lần 
            return sound + "%" + sound + "%" + sound + "%" + sound ;
        } else { // trả về 3 lần
            return sound + "@" + sound + "@" + sound;
        }

    }

}
