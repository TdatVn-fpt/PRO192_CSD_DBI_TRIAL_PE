package classdemo;


public class Main {

    
    public static void main(String[] args) {
       Square sc = new Square();
       sc.setSide(10);
     
       Square sc2 = new Square();
       sc2.setSide(20);
       
       Square sc3 = new Square(30);
      
        Square sc4 = new Square();
       
        
        System.out.println("Canh cua hinh vuong la: " + sc.getSide());
        System.out.println("Canh cua hinh vuong2 la: " + sc2.getSide());
        System.out.println("Canh cua hinh vuong3 la: " + sc3.getSide());
        System.out.println("Canh cua hinh vuong4 la: " + sc4.getSide());
        System.out.println("Canh cua hinh vuong4 la: " + sc4.getPerimeter());
        System.out.println("Canh cua hinh vuong4 la: " + sc4.getArea());
        System.out.println(sc4);
        
    }
    
}

