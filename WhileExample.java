public class WhileExample {
    public static void main(String args[]) {
        int x = 20;

        while (x < 30) {
            System.out.println("valor de x: " + (x));
            x++;
        }

        do {
            System.out.print(x);
            x++;
            System.out.print("\n");
            System.out.print("\n");
        } while (x < 20);
    }
}
