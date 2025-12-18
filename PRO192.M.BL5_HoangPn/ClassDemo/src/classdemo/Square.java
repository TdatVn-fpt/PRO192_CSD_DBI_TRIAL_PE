
package classdemo;



public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        }else {
        this.side = 5;
        }
    }
    
    // Contructor 
    public Square(){
    this.side = 5; // default aggisments 
    }// 
   // mac dinh va cos truyen vao
    // default maf vaaxn suwe dujng dudwocj o cai khac la no them contructor
   public  Square(double side){
    this.side = side;
   }
    
   
   // another
   public double getPerimeter(){
   return 4 * this.side;
}
    public double getArea(){
   return this.side * this.side;
}

    @Override
    public String toString() {
        String res = "Hinh vuong: " + "canh -" + this.side;
        res += ", chi vi - " + getPerimeter();
        res += ", dien tich - " + getArea();
        return res;
    }
    
}
