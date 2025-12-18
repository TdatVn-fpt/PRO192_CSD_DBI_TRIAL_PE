package demob5;

public class Animal {
  public int id;
  public double weight;
  public String name;
  public String color;

    public Animal(int id, double weight, String name, String color) {
        this.id = id;
        this.weight = weight;
        this.name = name;
        this.color = color;
    }
    
    public void sleep(){
        System.out.println("I am sleeping");
    }
    public void run(){
        System.out.println("I am running");
    }
    
    public  void makeSound(){
        System.out.println("My Sound");
    }
  
    
  
}
