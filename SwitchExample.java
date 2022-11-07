public class SwitchExample {
    public static void main(String args[]) {

        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done!");
                break;
            case 'D':
                System.out.println("You're passed");
                break;
            case 'F':
                System.out.println("You should try again");
                break;
            default:
                System.out.println("Grade");
                break;
        }
        System.out.println("Your grade is " + (grade));
    }
}
