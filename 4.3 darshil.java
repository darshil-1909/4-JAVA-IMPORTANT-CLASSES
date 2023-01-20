import java.util.Scanner;

public class scan4 {

    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A :- ");
        a = sc.nextInt();

        System.out.print("Enter B :- ");
        b = sc.nextInt();

        System.out.print("Enter C :- ");
        c = sc.nextInt();
        if (a < b) {
            if (a < c) {
                System.out.println("A is small");

            } else {
                System.out.println("c is small");

            }
        } else {
            if (b < c) {
                System.out.println("b is small");

            } else {
                System.out.println("c is small");

            }
        }
    }

}