
package demob5;

public class Dog extends Animal{
    private String onlyDog;

    public Dog(int id, double weight, String name, String color, String onlyDog) {
        super(id, weight, name, color);
        this.onlyDog = this.onlyDog;       
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof woof");
    }
    
    
}
