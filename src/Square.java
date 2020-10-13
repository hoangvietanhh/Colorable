public class Square extends Rectangle implements Colorable{
    @Override
    public void howToColor() {
        System.out.print("\n" + "Side: " + getSide() + ",Area: " + getArea());
        System.out.println("Color all four side.");
    }

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    public double getArea(){
        return getSide() * getSide();
    }

//    public void display(){
//        System.out.print("\n" + "Side: " + getSide() + ",Area: " + getArea());
//    }


    @Override
    public String toString() {
        return super.toString();
    }
}
