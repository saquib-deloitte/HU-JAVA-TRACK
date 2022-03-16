import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        int i, j, k, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows you want to print: ");
        r = sc.nextInt();
        for (i = 1; i <= r; i++) {
            for (j = i; j < r; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (i = r; i >= 1; i--) {
            for (j = i; j <= r5; j++) {
                System.out.print(" ");
            }
            for (k = 1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
