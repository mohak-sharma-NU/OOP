public class Rectangle{

    private double lenght, breadth;

    public Rectangle(double l,double b){
        this.lenght = l;
        this.breadth = b;
    }

    public void printLenght(){
        System.out.println("Lenght: "+this.lenght);
    }
    public void printBreadth(){
        System.out.println("Breadth: "+this.breadth);
    }

    public double printPerimeter(){
        double peri = this.lenght*2+this.breadth*2;
        System.out.println("Perimeter: "+peri);
        return peri;
    }

    public double printArea(){
        double area = this.lenght*this.breadth;
        System.out.println("Perimeter: "+area);
        return area;
    }
}
