public class BucleFor {
    public static void main(String args[]) {
        for (int x = 0; x < 10; x++) {
            System.out.println("valor de x: " + (x));
        }

        System.out.print("\n");
        System.out.print("-----");
        System.out.print("\n");

        int[] numbers = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        for (int number : numbers) {
            System.out.print(number);
            System.out.print("\n");
        }

        System.out.print("\n");
        System.out.print("-----");
        System.out.print("\n");

        String[] names = { "clara", "juan", "paco", "pedro", "marta" };

        for (String name : names) {
            System.out.print(name);
            System.out.print("\n");
        }

        System.out.print("\n");
        System.out.print("-----");
        System.out.print("\n");

        for (int number : numbers) {
            if (number == 50) {
                continue;
            }
            System.out.print(number);
            System.out.println("\n");
        }

        System.out.print("\n");
        System.out.print("-----");
        System.out.print("\n");

        for (int number : numbers) {
            if (number == 50) {
                break;
            }
            System.out.print(number);
            System.out.println("\n");
        }
    }
}
