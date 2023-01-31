import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a integer:");
        int a = input.nextInt();
        int i = 2;
        System.out.printf("%d=", a);
        while (i < a) {
            if (a % i == 0) {
                a = a / i;
                System.out.printf("%d*", i);
            } else {
                i += 1;
            }

        }
        System.out.printf("%d", a);
    }
}