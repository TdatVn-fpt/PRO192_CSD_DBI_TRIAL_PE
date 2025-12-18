
package demob5;

public class Cat extends Animal{
    private String onlyDog;

    public Cat(int id, double weight, String name, String color, String onlyDog) {
        super(id, weight, name, color);
        this.onlyDog = onlyDog;
    }

    @Override
    public void makeSound() {
        System.out.println("MEOW MEOW MEOW "); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
