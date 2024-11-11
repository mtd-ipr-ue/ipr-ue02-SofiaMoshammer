import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Out.println("Please enter an x-coordinate: ");
        double x = In.readDouble();

        Out.println("Please enter a y-coordinate: ");
        double y = In.readDouble();

        double radius = 4;

        if (x >= 0 && y >= 0 && x * x + y * y <= radius * radius) {

            Out.println("The point is in the green area.");
        } else {
            Out.println("The point is outside the green area.");
        }

    }
}
