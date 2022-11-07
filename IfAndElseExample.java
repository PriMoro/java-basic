public class IfAndElseExample {
    public static void main(String args[]) {
        int x = 9;
        int y = 15;
        int min = 10;
        if (x > min) {
            if (x == y) {
                System.out.println("el valor de X es mayor a " + min + " y es igual a " + y);
            } else if (x > y) {
                System.out.println("el valor de X es mayor a " + min + " y es mayor a " + y);
            } else {
                System.out.println("el valor de X es mayor a " + min + " pero menor que " + y);
            }
        } else if (x == min) {
            System.out.println("el valor de X es igual a " + min);
        } else {
            System.out.println("el valor de X es menor a " + min);
        }
        System.out.println("X es igual " + x);
    }
}
