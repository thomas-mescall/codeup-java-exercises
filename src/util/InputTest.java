package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        String myString = input.getString();
        System.out.println("You have entered: " + myString);

        boolean myBool = input.yesNo();
        System.out.println("You have entered: " + myBool);

        int yourInt = input.getInt();
        System.out.println("You have entered: " + yourInt);

        int myInt = input.getInt(2,9);
        System.out.println("You have entered: " + myInt);

        double yourDouble = input.getDouble();
        System.out.println("You have entered: " + yourDouble);

        double myDouble = input.getDouble(2,9);
        System.out.println("You have entered: " + myDouble);
    }
}
