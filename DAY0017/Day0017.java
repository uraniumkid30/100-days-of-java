package DAY0017;

abstract class TwoShape {
    private double width;
    private double height;
    private String name;

    TwoShape(){
        width = height = 0.0;
        name = "none";
    }
    TwoShape(double w, double h, String n){
        width = w;
        height = h;
        name = n;
    }
    TwoShape(double x, String n){
        width = height = x;
        name = n;
    }
    TwoShape(TwoShape obj){
        width = obj.width;
        height = obj.height;
        name = obj.name;
    }
    double getWidth(){return width;}
    double getHeight(){return height;}
    void setWidth(double w){width = w;}
    void setHeight(double h){height = h;}

    String getName(){return "Shape name is" + name;}

    void showDimensions(){
        System.out.println("Width: " + width + " Height: " + height);
    }
    abstract double area();
}

class Triangle extends TwoShape {
    double area (){
        return getHeight() * getWidth() * 0.5 ;
    }
    String getName(){return name;}
}

class Day0017 {
    public static void main(String[] args){
        Triangle my_triad = new Triangle();
    }
}