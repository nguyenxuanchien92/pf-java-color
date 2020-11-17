import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Square(21);
        shapes[3] = new Rectangle(2, 3);

        for (Shape element : shapes) {

            if (element instanceof Square) {
                String str = ((Square) element).howToColor();
                System.out.println(str);
            }
        }
    }
}
