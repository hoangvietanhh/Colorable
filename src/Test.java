public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(2);
        shapes[1] = new Circle(4);
        shapes[2] = new Rectangle(6,6);

        for (Shape shape:shapes) {
            if (shape instanceof Square){
                ((Square)shape).howToColor();
            }else {
                System.out.println(shape.toString());
            }
        }
    }
}
