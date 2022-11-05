public class Test {
    public static void main(String args[]) {
        int a = 10;
        int b = 15;
        int c = 20;
        int d = 25;

        int x = 20;

        System.out.println("a + (b * c) - d = " + (a + b * c - d));
        System.out.println("a == b : " + (a == b));
        System.out.println("c < d : " + (c < d));

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
