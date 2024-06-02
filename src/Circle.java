public class Circle {
    private int radius = 0;
    private double PI = 3.14;
    public void setRadius(int radius){
            this.radius = radius;
    }
    public int getRadius(){
        return this.radius;
    }
    public double area(){
        return this.radius * this.radius * this.PI;
    }
    public double perimeter(){
        return 2 * this.PI * this.radius;
    }

}
