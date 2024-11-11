import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.println("Please enter an integer number: ");
        int number1 = In.readInt();

        Out.println("Please enter an integer number: ");
        int number2 = In.readInt();

        Out.println("Please enter an integer number: ");
        int number3 = In.readInt();

        int max;

        if (number1 >= number2 && number1 >= number3) {
            max = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            max = number2;
        } else {
            max = number3;
        }

        Out.println("Maximum:" + max);

    }
}
