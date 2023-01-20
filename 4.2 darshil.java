import java.util.Scanner;

public class scan3{

    public static void main(String[] args) {
    
        int A;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A :- ");
        A = sc.nextInt();

        if (A > 0)
            System.out.println("Positive");
        else if (A < 0)
            System.out.println("Negative");
        else if (A == 0)
            System.out.println("Zero");

    }

}