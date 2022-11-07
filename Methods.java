public class Methods {
    public static void main(String args[]) {
        greeting("Pepe");
    }

    int minValue = minValue(10, 15);

    public static int minValue(int number1, int number2) {
        if (number1 > number2) {
            return number2;
        } else if (number1 == number2) {
            return number1;
        } else {
            return number1;
        }
    }

    public static void greeting(String name) {
        System.out.println("Hi " + name + "!");
    }
}
